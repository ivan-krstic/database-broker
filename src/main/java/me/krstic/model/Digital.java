package me.krstic.model;

import java.sql.Timestamp;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(uniqueConstraints = {@UniqueConstraint(columnNames = {"printingId"})})
public class Digital {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO, generator="digitalSequence")
	@SequenceGenerator(name="digitalSequence", sequenceName="digital_sequence")
	private Long id;
	private String clientId;
	private String clientSystem;
	private String operaterId;
	private String operaterUsername;
	private String operaterName;
	private String operaterMachine;
	private String dataType;
	private String data;
	private String status;
	private String tsaResponse;
	private String guid;
	private Timestamp startDate;
	private Timestamp modifyDate;
	private Timestamp endDate;
	private String branchCity;
	private String branchCode;
	private String branchName;
	private String branchStreet;
	private String cashDeskId;
	private Timestamp currentBankingDate;
	private String documentNumber;
	private String domainName;
	private String originalPrintingId;
	private String originalTransactionNumber;
	private String printFormId;
	@Column(unique = true)
	private String printingId;
	private String stornoFlag;
	private Timestamp transactionCalendarDate;
	private String transactionCode;
	private String transactionCodeDescription;
	private String transactionNumber;
	@Lob
	@Basic(fetch = FetchType.LAZY)
	private String inputXml;
	private String denominationValue;
	private String denominationCurrency;
	private String denominationWay;
	
	public Digital() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getClientId() {
		return clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public String getClientSystem() {
		return clientSystem;
	}

	public void setClientSystem(String clientSystem) {
		this.clientSystem = clientSystem;
	}

	public String getOperaterId() {
		return operaterId;
	}

	public void setOperaterId(String operaterId) {
		this.operaterId = operaterId;
	}

	public String getOperaterUsername() {
		return operaterUsername;
	}

	public void setOperaterUsername(String operaterUsername) {
		this.operaterUsername = operaterUsername;
	}

	public String getOperaterName() {
		return operaterName;
	}

	public void setOperaterName(String operaterName) {
		this.operaterName = operaterName;
	}

	public String getOperaterMachine() {
		return operaterMachine;
	}

	public void setOperaterMachine(String operaterMachine) {
		this.operaterMachine = operaterMachine;
	}

	public String getDataType() {
		return dataType;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTsaResponse() {
		return tsaResponse;
	}

	public void setTsaResponse(String tsaResponse) {
		this.tsaResponse = tsaResponse;
	}

	public String getGuid() {
		return guid;
	}

	public void setGuid(String guid) {
		this.guid = guid;
	}

	public Timestamp getStartDate() {
		return startDate;
	}

	public void setStartDate(Timestamp startDate) {
		this.startDate = startDate;
	}

	public Timestamp getModifyDate() {
		return modifyDate;
	}

	public void setModifyDate(Timestamp modifyDate) {
		this.modifyDate = modifyDate;
	}

	public Timestamp getEndDate() {
		return endDate;
	}

	public void setEndDate(Timestamp endDate) {
		this.endDate = endDate;
	}

	public String getBranchCity() {
		return branchCity;
	}

	public void setBranchCity(String branchCity) {
		this.branchCity = branchCity;
	}

	public String getBranchCode() {
		return branchCode;
	}

	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getBranchStreet() {
		return branchStreet;
	}

	public void setBranchStreet(String branchStreet) {
		this.branchStreet = branchStreet;
	}

	public String getCashDeskId() {
		return cashDeskId;
	}

	public void setCashDeskId(String cashDeskId) {
		this.cashDeskId = cashDeskId;
	}

	public Timestamp getCurrentBankingDate() {
		return currentBankingDate;
	}

	public void setCurrentBankingDate(Timestamp currentBankingDate) {
		this.currentBankingDate = currentBankingDate;
	}

	public String getDocumentNumber() {
		return documentNumber;
	}

	public void setDocumentNumber(String documentNumber) {
		this.documentNumber = documentNumber;
	}

	public String getDomainName() {
		return domainName;
	}

	public void setDomainName(String domainName) {
		this.domainName = domainName;
	}

	public String getOriginalPrintingId() {
		return originalPrintingId;
	}

	public void setOriginalPrintingId(String originalPrintingId) {
		this.originalPrintingId = originalPrintingId;
	}

	public String getOriginalTransactionNumber() {
		return originalTransactionNumber;
	}

	public void setOriginalTransactionNumber(String originalTransactionNumber) {
		this.originalTransactionNumber = originalTransactionNumber;
	}

	public String getPrintFormId() {
		return printFormId;
	}

	public void setPrintFormId(String printFormId) {
		this.printFormId = printFormId;
	}

	public String getPrintingId() {
		return printingId;
	}

	public void setPrintingId(String printingId) {
		this.printingId = printingId;
	}

	public String getStornoFlag() {
		return stornoFlag;
	}

	public void setStornoFlag(String stornoFlag) {
		this.stornoFlag = stornoFlag;
	}

	public Timestamp getTransactionCalendarDate() {
		return transactionCalendarDate;
	}

	public void setTransactionCalendarDate(Timestamp transactionCalendarDate) {
		this.transactionCalendarDate = transactionCalendarDate;
	}

	public String getTransactionCode() {
		return transactionCode;
	}

	public void setTransactionCode(String transactionCode) {
		this.transactionCode = transactionCode;
	}

	public String getTransactionCodeDescription() {
		return transactionCodeDescription;
	}

	public void setTransactionCodeDescription(String transactionCodeDescription) {
		this.transactionCodeDescription = transactionCodeDescription;
	}

	public String getTransactionNumber() {
		return transactionNumber;
	}

	public void setTransactionNumber(String transactionNumber) {
		this.transactionNumber = transactionNumber;
	}

	public String getInputXml() {
		return inputXml;
	}

	public void setInputXml(String inputXml) {
		this.inputXml = inputXml;
	}

	public String getDenominationValue() {
		return denominationValue;
	}

	public void setDenominationValue(String denominationValue) {
		this.denominationValue = denominationValue;
	}

	public String getDenominationCurrency() {
		return denominationCurrency;
	}

	public void setDenominationCurrency(String denominationCurrency) {
		this.denominationCurrency = denominationCurrency;
	}

	public String getDenominationWay() {
		return denominationWay;
	}

	public void setDenominationWay(String denominationWay) {
		this.denominationWay = denominationWay;
	}

	@Override
	public String toString() {
		return "Digital [id=" + id + ", clientId=" + clientId + ", clientSystem=" + clientSystem + ", operaterId="
				+ operaterId + ", operaterUsername=" + operaterUsername + ", operaterName=" + operaterName
				+ ", operaterMachine=" + operaterMachine + ", dataType=" + dataType + ", data=" + data + ", status="
				+ status + ", tsaResponse=" + tsaResponse + ", guid=" + guid + ", startDate=" + startDate
				+ ", modifyDate=" + modifyDate + ", endDate=" + endDate + ", branchCity=" + branchCity + ", branchCode="
				+ branchCode + ", branchName=" + branchName + ", branchStreet=" + branchStreet + ", cashDeskId="
				+ cashDeskId + ", currentBankingDate=" + currentBankingDate + ", documentNumber=" + documentNumber
				+ ", domainName=" + domainName + ", originalPrintingId=" + originalPrintingId
				+ ", originalTransactionNumber=" + originalTransactionNumber + ", printFormId=" + printFormId
				+ ", printingId=" + printingId + ", stornoFlag=" + stornoFlag + ", transactionCalendarDate="
				+ transactionCalendarDate + ", transactionCode=" + transactionCode + ", transactionCodeDescription="
				+ transactionCodeDescription + ", transactionNumber=" + transactionNumber + ", inputXml=" + inputXml
				+ ", denominationValue=" + denominationValue + ", denominationCurrency=" + denominationCurrency
				+ ", denominationWay=" + denominationWay + "]";
	}
}
