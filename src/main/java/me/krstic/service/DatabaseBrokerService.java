package me.krstic.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.krstic.repository.DenominationRepository;
import me.krstic.repository.DigitalRepository;
import me.krstic.repository.PrintRepository;

@Service
public class DatabaseBrokerService {

	private static Logger LOG = LoggerFactory.getLogger(DatabaseBrokerService.class);
	
	@Autowired
	private DigitalRepository digitalRepository;
	@Autowired
	private DenominationRepository denominationRepository;
	@Autowired
	private PrintRepository printRepository;
	
	public DatabaseBrokerService() {
	}

	public DigitalRepository getDigitalRepository() {
		return digitalRepository;
	}

	public void setDigitalRepository(DigitalRepository digitalRepository) {
		this.digitalRepository = digitalRepository;
	}

	public DenominationRepository getDenominationRepository() {
		return denominationRepository;
	}

	public void setDenominationRepository(DenominationRepository denominationRepository) {
		this.denominationRepository = denominationRepository;
	}

	public PrintRepository getPrintRepository() {
		return printRepository;
	}

	public void setPrintRepository(PrintRepository printRepository) {
		this.printRepository = printRepository;
	}
}
