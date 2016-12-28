package me.krstic.model;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Denomination {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO, generator="denominationSequence")
	@SequenceGenerator(name="denominationSequence", sequenceName="denomination_sequence", initialValue=1)
	private Long id;
	@ManyToOne
	@JoinColumn(name="DIGITAL_ID")
	private Digital digital;
	private String denominationIn;
	private String denominationOut;
	private String denominationType;
	private String denominationUnit;
	private String stock;
	private Timestamp modifiedOn;
	
	public Denomination() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Digital getDigital() {
		return digital;
	}

	public void setDigital(Digital digital) {
		this.digital = digital;
	}

	public String getDenominationType() {
		return denominationType;
	}

	public void setDenominationType(String denominationType) {
		this.denominationType = denominationType;
	}

	public String getDenominationUnit() {
		return denominationUnit;
	}

	public void setDenominationUnit(String denominationUnit) {
		this.denominationUnit = denominationUnit;
	}

	public String getStock() {
		return stock;
	}

	public void setStock(String stock) {
		this.stock = stock;
	}

	public Timestamp getModifiedOn() {
		return modifiedOn;
	}

	public void setModifiedOn(Timestamp modifiedOn) {
		this.modifiedOn = modifiedOn;
	}

	public String getDenominationIn() {
		return denominationIn;
	}

	public void setDenominationIn(String denominationIn) {
		this.denominationIn = denominationIn;
	}

	public String getDenominationOut() {
		return denominationOut;
	}

	public void setDenominationOut(String denominationOut) {
		this.denominationOut = denominationOut;
	}

	@Override
	public String toString() {
		return "Denomination [id=" + id + ", digital=" + digital + ", denominationIn=" + denominationIn
				+ ", denominationOut=" + denominationOut + ", denominationType=" + denominationType
				+ ", denominationUnit=" + denominationUnit + ", stock=" + stock + ", modifiedOn=" + modifiedOn + "]";
	}
}
