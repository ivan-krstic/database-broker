package me.krstic.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "DenominationInfo")
@XmlAccessorType(XmlAccessType.FIELD)
public class DenominationInfo {

	@XmlElement(name = "DenomAllowedDirection")
	private String denomAllowedDirection;
	@XmlElement(name = "DenomCrtID")
	private String denomCrtID;
	@XmlElement(name = "DenomDrwID")
	private String denomDrwID;
	@XmlElement(name = "DenomEms")
	private String denomEms;
	@XmlElement(name = "DenomPackage")
	private String denomPackage;
	@XmlElement(name = "DenomPcsIn")
	private String denomPcsIn;
	@XmlElement(name = "DenomPcsOut")
	private String denomPcsOut;
	@XmlElement(name = "DenomType")
	private String denomType;
	@XmlElement(name = "DenomUnit")
	private String denomUnit;
	@XmlElement(name = "Stock")
	private String stock;
	@XmlElement(name = "DenomPacket")
	private String denomPacket;
	
	public DenominationInfo() {
	}

	public String getDenomAllowedDirection() {
		return denomAllowedDirection;
	}

	public void setDenomAllowedDirection(String denomAllowedDirection) {
		this.denomAllowedDirection = denomAllowedDirection;
	}

	public String getDenomCrtID() {
		return denomCrtID;
	}

	public void setDenomCrtID(String denomCrtID) {
		this.denomCrtID = denomCrtID;
	}

	public String getDenomDrwID() {
		return denomDrwID;
	}

	public void setDenomDrwID(String denomDrwID) {
		this.denomDrwID = denomDrwID;
	}

	public String getDenomEms() {
		return denomEms;
	}

	public void setDenomEms(String denomEms) {
		this.denomEms = denomEms;
	}

	public String getDenomPackage() {
		return denomPackage;
	}

	public void setDenomPackage(String denomPackage) {
		this.denomPackage = denomPackage;
	}

	public String getDenomPcsIn() {
		return denomPcsIn;
	}

	public void setDenomPcsIn(String denomPcsIn) {
		this.denomPcsIn = denomPcsIn;
	}

	public String getDenomPcsOut() {
		return denomPcsOut;
	}

	public void setDenomPcsOut(String denomPcsOut) {
		this.denomPcsOut = denomPcsOut;
	}

	public String getDenomType() {
		return denomType;
	}

	public void setDenomType(String denomType) {
		this.denomType = denomType;
	}

	public String getDenomUnit() {
		return denomUnit;
	}

	public void setDenomUnit(String denomUnit) {
		this.denomUnit = denomUnit;
	}

	public String getStock() {
		return stock;
	}

	public void setStock(String stock) {
		this.stock = stock;
	}

	public String getDenomPacket() {
		return denomPacket;
	}

	public void setDenomPacket(String denomPacket) {
		this.denomPacket = denomPacket;
	}

	@Override
	public String toString() {
		return "DenominationInfo [denomAllowedDirection=" + denomAllowedDirection + ", denomCrtID=" + denomCrtID
				+ ", denomDrwID=" + denomDrwID + ", denomEms=" + denomEms + ", denomPackage=" + denomPackage
				+ ", denomPcsIn=" + denomPcsIn + ", denomPcsOut=" + denomPcsOut + ", denomType=" + denomType
				+ ", denomUnit=" + denomUnit + ", stock=" + stock + ", denomPacket=" + denomPacket + "]";
	}
}
