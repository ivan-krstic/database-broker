package me.krstic.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Validator")
@XmlAccessorType(XmlAccessType.FIELD)
public class Validator {

	@XmlElement(name = "TxSupervisorCallingListInfo")
	private TxSupervisorCallingListInfo txSupervisorCallingListInfo;
	
	public Validator() {
	}

	public TxSupervisorCallingListInfo getTxSupervisorCallingListInfo() {
		return txSupervisorCallingListInfo;
	}

	public void setTxSupervisorCallingListInfo(TxSupervisorCallingListInfo txSupervisorCallingListInfo) {
		this.txSupervisorCallingListInfo = txSupervisorCallingListInfo;
	}

	@Override
	public String toString() {
		return "Validator [txSupervisorCallingListInfo=" + txSupervisorCallingListInfo + "]";
	}
}
