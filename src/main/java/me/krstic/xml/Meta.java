package me.krstic.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Meta")
@XmlAccessorType(XmlAccessType.FIELD)
public class Meta {

	@XmlElement(name = "BranchCity")
	private String branchCity;
	@XmlElement(name = "BranchCode")
	private String branchCode;
	@XmlElement(name = "BranchName")
	private String branchName;
	@XmlElement(name = "BranchStreet")
	private String branchStreet;
	@XmlElement(name = "CashDeskID")
	private String cashDeskID;
	@XmlElement(name = "CurrentBankingDate")
	private String currentBankingDate;
	@XmlElement(name = "DocumentNumber")
	private String documentNumber;
	@XmlElement(name = "DomainName")
	private String domainName;
	@XmlElement(name = "OriginalPrintingID")
	private String originalPrintingID;
	@XmlElement(name = "OriginalTransactionNumber")
	private String originalTransactionNumber;
	@XmlElement(name = "PrintFormID")
	private String printFormID;
	@XmlElement(name = "PrintingID")
	private String printingID;
	@XmlElement(name = "StornoFlag")
	private String stornoFlag;
	@XmlElement(name = "TransactionCalendarDate")
	private String transactionCalendarDate;
	@XmlElement(name = "TransactionCode")
	private String transactionCode;
	@XmlElement(name = "TransactionCodeDescription")
	private String transactionCodeDescription;
	@XmlElement(name = "TransactionNumber")
	private String transactionNumber;
	@XmlElement(name = "ClientUserID")
	private String clientUserID;
	@XmlElement(name = "UserName")
	private String userName;
	@XmlElement(name = "WindowsUserID")
	private String windowsUserID;
	@XmlElement(name = "WorkstationID")
	private String workstationID;
	
	public Meta() {
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

	public String getCashDeskID() {
		return cashDeskID;
	}

	public void setCashDeskID(String cashDeskID) {
		this.cashDeskID = cashDeskID;
	}

	public String getCurrentBankingDate() {
		return currentBankingDate;
	}

	public void setCurrentBankingDate(String currentBankingDate) {
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

	public String getOriginalPrintingID() {
		return originalPrintingID;
	}

	public void setOriginalPrintingID(String originalPrintingID) {
		this.originalPrintingID = originalPrintingID;
	}

	public String getOriginalTransactionNumber() {
		return originalTransactionNumber;
	}

	public void setOriginalTransactionNumber(String originalTransactionNumber) {
		this.originalTransactionNumber = originalTransactionNumber;
	}

	public String getPrintFormID() {
		return printFormID;
	}

	public void setPrintFormID(String printFormID) {
		this.printFormID = printFormID;
	}

	public String getPrintingID() {
		return printingID;
	}

	public void setPrintingID(String printingID) {
		this.printingID = printingID;
	}

	public String getStornoFlag() {
		return stornoFlag;
	}

	public void setStornoFlag(String stornoFlag) {
		this.stornoFlag = stornoFlag;
	}

	public String getTransactionCalendarDate() {
		return transactionCalendarDate;
	}

	public void setTransactionCalendarDate(String transactionCalendarDate) {
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

	public String getClientUserID() {
		return clientUserID;
	}

	public void setClientUserID(String clientUserID) {
		this.clientUserID = clientUserID;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getWindowsUserID() {
		return windowsUserID;
	}

	public void setWindowsUserID(String windowsUserID) {
		this.windowsUserID = windowsUserID;
	}

	public String getWorkstationID() {
		return workstationID;
	}

	public void setWorkstationID(String workstationID) {
		this.workstationID = workstationID;
	}

	@Override
	public String toString() {
		return "Meta [branchCity=" + branchCity + ", branchCode=" + branchCode + ", branchName=" + branchName
				+ ", branchStreet=" + branchStreet + ", cashDeskID=" + cashDeskID + ", currentBankingDate="
				+ currentBankingDate + ", documentNumber=" + documentNumber + ", domainName=" + domainName
				+ ", originalPrintingID=" + originalPrintingID + ", originalTransactionNumber="
				+ originalTransactionNumber + ", printFormID=" + printFormID + ", printingID=" + printingID
				+ ", stornoFlag=" + stornoFlag + ", transactionCalendarDate=" + transactionCalendarDate
				+ ", transactionCode=" + transactionCode + ", transactionCodeDescription=" + transactionCodeDescription
				+ ", transactionNumber=" + transactionNumber + ", clientUserID=" + clientUserID + ", userName="
				+ userName + ", windowsUserID=" + windowsUserID + ", workstationID=" + workstationID + "]";
	}
}
