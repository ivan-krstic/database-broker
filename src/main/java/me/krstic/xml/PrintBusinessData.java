package me.krstic.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Printform")
@XmlAccessorType(XmlAccessType.FIELD)
public class PrintBusinessData {

	@XmlElement(name = "Printform")
	private PrintForm printForm;
	
	public PrintBusinessData() {
	}

	public PrintForm getPrintForm() {
		return printForm;
	}

	public void setPrintForm(PrintForm printForm) {
		this.printForm = printForm;
	}

	@Override
	public String toString() {
		return "PrintBusinessData [printForm=" + printForm + "]";
	}
}
