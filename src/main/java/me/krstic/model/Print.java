package me.krstic.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Print {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO, generator="printSequence")
	@SequenceGenerator(name="printSequence", sequenceName="print_sequence")
	private Long id;
	@ManyToOne
	@JoinColumn(name="DIGITAL_ID")
	private Digital digital;
	private String tag;
	private String value;
	@Temporal(TemporalType.TIMESTAMP)
	private Date modifiedOn;
	
	public Print() {
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

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Date getModifiedOn() {
		return modifiedOn;
	}

	public void setModifiedOn(Date modifiedOn) {
		this.modifiedOn = modifiedOn;
	}

	@Override
	public String toString() {
		return "PrintBusinessData [id=" + id + ", digital=" + digital + ", tag=" + tag + ", value=" + value
				+ ", modifiedOn=" + modifiedOn + "]";
	}
}
