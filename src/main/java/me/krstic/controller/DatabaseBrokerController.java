package me.krstic.controller;

import javax.xml.bind.UnmarshalException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import me.krstic.service.UniCashService;
import me.krstic.vo.ServiceRequest;
import me.krstic.vo.ServiceResponse;
import me.krstic.xml.Client;

@RestController
public class DatabaseBrokerController {

	private static final Logger LOG = LoggerFactory.getLogger(DatabaseBrokerController.class);
	
	@Autowired
	private UniCashService uniCashService;
	
	public DatabaseBrokerController() {
	}
	
	@RequestMapping(value = "/status", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ServiceResponse> status() {
		return new ResponseEntity<>(new ServiceResponse(200, "OK", null), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/digital", method = RequestMethod.POST, consumes = MediaType.APPLICATION_XML_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ServiceResponse> saveXml(@RequestBody Client client) {
		
		try {
			ServiceResponse serviceResponse = uniCashService.createDigital(client);
			
			return new ResponseEntity<>(serviceResponse, HttpStatus.valueOf(serviceResponse.getCode()));
		} catch (IllegalAccessException e) {
			LOG.error("IllegalAccessException for parsing input XML document.");
			return new ResponseEntity<>(new ServiceResponse(400, "Error with parsing XML", null), HttpStatus.BAD_REQUEST);
		}
	}
	
	@RequestMapping(value = "/create", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ServiceResponse> create(@RequestBody ServiceRequest input) {
		if (input.getId() != null || input.getType() != null || input.getData() == null || input.getData().isEmpty()) {
			return new ResponseEntity<>(new ServiceResponse(400, "Bad Request: ID & TYPE must NOT be setted and DATA must be setted.", null), HttpStatus.BAD_REQUEST);
		}
		
		try {
			ServiceResponse serviceResponse = uniCashService.createDigital(input);
			
			return new ResponseEntity<>(serviceResponse, HttpStatus.valueOf(serviceResponse.getCode()));
		} catch (UnmarshalException e) {
			LOG.error("UnmarshalException.");
			return new ResponseEntity<>(new ServiceResponse(400, "Error with parsing XML", null), HttpStatus.BAD_REQUEST);
		} catch (IllegalAccessException e) {
			LOG.error("IllegalAccessException for parsing input XML document.");
			return new ResponseEntity<>(new ServiceResponse(400, "Error with parsing XML", null), HttpStatus.BAD_REQUEST);
		}
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ServiceResponse> update(@RequestBody ServiceRequest input) {
		if (input.getId() == null || input.getType() == null || !input.getType().equalsIgnoreCase("PDF") || input.getData() == null || input.getData().isEmpty()) {
			return new ResponseEntity<>(new ServiceResponse(400, "Bad Request: ID & TYPE must be setted.", null), HttpStatus.BAD_REQUEST);
		}
		
		ServiceResponse serviceResponse = uniCashService.updateDigital(input);
		
		return new ResponseEntity<>(serviceResponse, HttpStatus.valueOf(serviceResponse.getCode()));
	}
}
