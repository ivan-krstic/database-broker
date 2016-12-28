package me.krstic.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name = "TxDenominationInfo")
@XmlAccessorType(XmlAccessType.FIELD)
public class TxDenominationInfo {

	@XmlElement(name = "TxDenominationCurrency")
	private String txDenominationCurrency;
	@XmlElement(name = "TxDenominationAmount")
	private String txDenominationAmount;
	@XmlElement(name = "TxDenominationWay")
	private String txDenominationWay;
	@XmlElement(name = "IsDenominated")
	private String isDenominated;
	@XmlElement(name = "TxDenomination")
	private TxDenominationInfoTxDenomination txDenomination;
	@XmlElement(name = "IsAktOrderingAffected")
	private String isAktOrderingAffected;
	
	public TxDenominationInfo() {
	}

	public String getTxDenominationCurrency() {
		return txDenominationCurrency;
	}

	public void setTxDenominationCurrency(String txDenominationCurrency) {
		this.txDenominationCurrency = txDenominationCurrency;
	}

	public String getTxDenominationAmount() {
		return txDenominationAmount;
	}

	public void setTxDenominationAmount(String txDenominationAmount) {
		this.txDenominationAmount = txDenominationAmount;
	}

	public String getTxDenominationWay() {
		return txDenominationWay;
	}

	public void setTxDenominationWay(String txDenominationWay) {
		this.txDenominationWay = txDenominationWay;
	}

	public String getIsDenominated() {
		return isDenominated;
	}

	public void setIsDenominated(String isDenominated) {
		this.isDenominated = isDenominated;
	}

	public TxDenominationInfoTxDenomination getTxDenomination() {
		return txDenomination;
	}

	public void setTxDenomination(TxDenominationInfoTxDenomination txDenomination) {
		this.txDenomination = txDenomination;
	}

	public String getIsAktOrderingAffected() {
		return isAktOrderingAffected;
	}

	public void setIsAktOrderingAffected(String isAktOrderingAffected) {
		this.isAktOrderingAffected = isAktOrderingAffected;
	}

	@Override
	public String toString() {
		return "TxDenominationInfo [txDenominationCurrency=" + txDenominationCurrency + ", txDenominationAmount="
				+ txDenominationAmount + ", txDenominationWay=" + txDenominationWay + ", isDenominated=" + isDenominated
				+ ", txDenomination=" + txDenomination + ", isAktOrderingAffected=" + isAktOrderingAffected + "]";
	}
}
