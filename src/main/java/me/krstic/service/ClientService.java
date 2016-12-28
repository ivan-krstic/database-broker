package me.krstic.service;

import java.io.StringReader;
import java.io.StringWriter;
import java.lang.reflect.Field;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.JAXB;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.UnmarshalException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import me.krstic.model.Denomination;
import me.krstic.model.Digital;
import me.krstic.model.Print;
import me.krstic.vo.ServiceRequest;
import me.krstic.vo.ServiceResponse;
import me.krstic.xml.DenominationInfo;
import me.krstic.xml.PrintBusinessData;
import me.krstic.xml.PrintForm;
import me.krstic.xml.Client;

@Service
public class ClientService {

	private static Logger LOG = LoggerFactory.getLogger(ClientService.class);
	
	@Autowired
	private DatabaseBrokerService databaseBrokerService;
	
	public ClientService() {
	}
	
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public ServiceResponse createDigital(Client client) throws IllegalAccessException {
		//Printing ID must be unique
		if (databaseBrokerService.getDigitalRepository().findOneByPrintingId(client.getMeta().getPrintingID()) != null) {
			LOG.error("Document with printig ID: " + client.getMeta().getPrintingID() + " already exists.");
			return new ServiceResponse(400, "Document with printig ID: " + client.getMeta().getPrintingID() + " already exists.", null);
		}
		
		// Creating DIGITAL
		Digital digital = new Digital();
		
		Timestamp currentBankingDate = Timestamp.valueOf(client.getMeta().getCurrentBankingDate().replace('T', ' '));
		Timestamp transactionCalendarDate = Timestamp.valueOf(client.getMeta().getTransactionCalendarDate().replace('T', ' '));
		
		digital.setStartDate(new Timestamp(System.currentTimeMillis()));
		digital.setClientSystem("Client");
		digital.setBranchCity(client.getMeta().getBranchCity());
		digital.setBranchCode(client.getMeta().getBranchCode());
		digital.setBranchName(client.getMeta().getBranchName());
		digital.setBranchStreet(client.getMeta().getBranchStreet());
		digital.setCashDeskId(client.getMeta().getCashDeskID());
		digital.setCurrentBankingDate(currentBankingDate);
		digital.setDocumentNumber(client.getMeta().getDocumentNumber());
		digital.setDomainName(client.getMeta().getDomainName());
		digital.setOriginalPrintingId(client.getMeta().getOriginalPrintingID());
		digital.setOriginalTransactionNumber(client.getMeta().getOriginalTransactionNumber());
		digital.setPrintFormId(client.getMeta().getPrintFormID());
		digital.setPrintingId(client.getMeta().getPrintingID());
		digital.setStornoFlag(client.getMeta().getStornoFlag());
		digital.setTransactionCalendarDate(transactionCalendarDate);
		digital.setTransactionCode(client.getMeta().getTransactionCode());
		digital.setTransactionCodeDescription(client.getMeta().getTransactionCodeDescription());
		digital.setTransactionNumber(client.getMeta().getTransactionNumber());
		digital.setOperaterId(client.getMeta().getClientUserID());
		digital.setOperaterName(client.getMeta().getUserName());
		digital.setOperaterUsername(client.getMeta().getWindowsUserID());
		digital.setOperaterMachine(client.getMeta().getWorkstationID());
		
		digital = databaseBrokerService.getDigitalRepository().save(digital);
		
		// Creating PRINT data
		List<Print> prints = new ArrayList<>();
		for (Map.Entry<String, String> entry : getFieldsValueFromObject(getPrintFormFromClient(client)).entrySet()) {
			Print print = new Print();
			
			print.setDigital(digital);
			print.setTag(entry.getKey());
			print.setValue(entry.getValue());
			print.setModifiedOn(new Date());
			
			prints.add(print);
		}
		
		// Creating DENOMINATION data
		List<Denomination> denominations = new ArrayList<>();
		client.getTxDenomination().getTxDenominationInfo().getTxDenomination().getDenominationInfo();
		for (DenominationInfo denominationInfo : client.getTxDenomination().getTxDenominationInfo().getTxDenomination().getDenominationInfo()) {
			Denomination denomination = new Denomination();
			
			denomination.setDenominationIn(denominationInfo.getDenomPcsIn());
			denomination.setDenominationOut(denominationInfo.getDenomPcsOut());
			denomination.setDenominationType(denominationInfo.getDenomType());
			denomination.setDenominationUnit(denominationInfo.getDenomUnit());
			denomination.setStock(denominationInfo.getStock());
			denomination.setDigital(digital);
			denomination.setModifiedOn(new Timestamp(System.currentTimeMillis()));
			
			denominations.add(denomination);
		}
	
		databaseBrokerService.getPrintRepository().save(prints);
		databaseBrokerService.getDenominationRepository().save(denominations);
		
		digital.setStatus("0");
		digital.setInputXml(convertToBase64(client));
		digital.setDenominationValue(client.getTxDenomination().getTxDenominationInfo().getTxDenominationAmount());
		digital.setDenominationCurrency(client.getTxDenomination().getTxDenominationInfo().getTxDenominationCurrency());
		digital.setDenominationWay(client.getTxDenomination().getTxDenominationInfo().getTxDenominationWay());
		digital.setModifyDate(new Timestamp(System.currentTimeMillis()));
		
		digital = databaseBrokerService.getDigitalRepository().save(digital);
		
		return new ServiceResponse(200, "OK", digital.getId());
	}
	
	public ServiceResponse createDigital(ServiceRequest input) throws UnmarshalException, IllegalAccessException {
		String xml = new String(Base64.getDecoder().decode(input.getData()));

		Client client = JAXB.unmarshal(new StringReader(xml), Client.class);
		
		return createDigital(client);
	}
	
	public ServiceResponse updateDigital(ServiceRequest input) {
		Digital digital = databaseBrokerService.getDigitalRepository().findOne(input.getId());
		
		if (digital == null) {
			LOG.error("Document with ID: " + input.getId() + " doesn't exists.");
			return new ServiceResponse(404, "Document with ID: " + input.getId() + " doesn't exists.", null);
		}
		
		if (digital.getData() != null && !digital.getData().isEmpty()) {
			LOG.error("Document with ID: " + input.getId() + " already have setted data.");
			return new ServiceResponse(409, "Document with ID: " + input.getId() + " already have setted data.", null);
		}
		
		digital.setDataType(input.getType().toUpperCase());
		digital.setData(input.getData());
		digital.setStatus("-1");
		digital.setModifyDate(new Timestamp(System.currentTimeMillis()));
		
		databaseBrokerService.getDigitalRepository().save(digital);
		
		return new ServiceResponse(200, "OK", digital.getId());
	}

//	PRIVATE methods
	private PrintForm getPrintFormFromClient(Client client) throws IllegalAccessException {
		Class<?> c = client.getClass();
		
		Field[] fields = c.getDeclaredFields();
		
		for(Field field : fields ) {
			field.setAccessible(true);
			if (field.getName().equalsIgnoreCase("printBusinessData")) {
				PrintBusinessData printBusinessData = (PrintBusinessData) field.get(client);
				
				return printBusinessData.getPrintForm();
			}
		}
		
		return null;
	}
	
	private Map<String, String> getFieldsValueFromObject(Object object) throws IllegalAccessException {
		Map<String, String> map = new HashMap<>();
		
		Class<?> c = object.getClass();
		
		Field[] fields = c.getDeclaredFields();
		
		for(Field field : fields ) {
			field.setAccessible(true);
			
			if (!String.valueOf(field.get(object)).isEmpty()) {
				map.put(field.getName(), String.valueOf(field.get(object)));
			}
		}
		
		return map;
	}
	
	private String convertToBase64(Object object) {
		try {
			if (object instanceof Client) {
				JAXBContext jaxbContext = JAXBContext.newInstance(Client.class);
				Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
				jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
				StringWriter sw = new StringWriter();
				jaxbMarshaller.marshal(object, sw);
				
				return Base64.getEncoder().encodeToString(sw.toString().getBytes());
			}
		} catch (JAXBException e) {
			LOG.error("JAXBException.");
			e.printStackTrace();
		}
		return null;
	}
}
