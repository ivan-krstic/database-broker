package me.krstic.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "TxDenomination")
@XmlAccessorType(XmlAccessType.FIELD)
public class TxDenomination {

	@XmlElement(name = "TxDenominationInfo")
	private TxDenominationInfo txDenominationInfo;
	
	public TxDenomination() {
	}

	public TxDenominationInfo getTxDenominationInfo() {
		return txDenominationInfo;
	}

	public void setTxDenominationInfo(TxDenominationInfo txDenominationInfo) {
		this.txDenominationInfo = txDenominationInfo;
	}

	@Override
	public String toString() {
		return "TxDenomination [txDenominationInfo=" + txDenominationInfo + "]";
	}
}
