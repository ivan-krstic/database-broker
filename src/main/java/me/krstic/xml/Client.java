package me.krstic.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name = "DigitalInfo")
@XmlAccessorType(XmlAccessType.FIELD)
public class Client {
	
	@XmlElement(name = "TxDenomination")
	private TxDenomination txDenomination;
	@XmlElement(name = "Meta")
	private Meta meta;
	@XmlElement(name = "Validator")
	private Validator validator;
	@XmlElement(name = "PrintBusinessData")
	private PrintBusinessData printBusinessData;
	
	public Client() {
	}
	
	public TxDenomination getTxDenomination() {
		return txDenomination;
	}

	public void setTxDenomination(TxDenomination txDenomination) {
		this.txDenomination = txDenomination;
	}

	public Meta getMeta() {
		return meta;
	}

	public void setMeta(Meta meta) {
		this.meta = meta;
	}

	public Validator getValidator() {
		return validator;
	}

	public void setValidator(Validator validator) {
		this.validator = validator;
	}

	public PrintBusinessData getPrintBusinessData() {
		return printBusinessData;
	}

	public void setPrintBusinessData(PrintBusinessData printBusinessData) {
		this.printBusinessData = printBusinessData;
	}

	@Override
	public String toString() {
		return "DigitalInfo [txDenomination=" + txDenomination + ", meta=" + meta + ", validator=" + validator
				+ ", printBusinessData=" + printBusinessData + "]";
	}
}
