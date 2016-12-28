package me.krstic.xml;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "TxDenomination")
@XmlAccessorType(XmlAccessType.FIELD)
public class TxDenominationInfoTxDenomination {

	@XmlElement(name = "DenominationInfo")
	private List<DenominationInfo> denominationInfos;
	
	public TxDenominationInfoTxDenomination() {
	}

	public List<DenominationInfo> getDenominationInfo() {
		return denominationInfos;
	}

	public void setDenominationInfo(List<DenominationInfo> denominationInfos) {
		this.denominationInfos = denominationInfos;
	}

	@Override
	public String toString() {
		return "TxDenominationInfoTxDenomination [denominationInfos=" + denominationInfos + "]";
	}

}
