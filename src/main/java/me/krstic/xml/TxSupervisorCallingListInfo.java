package me.krstic.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "TxSupervisorCallingListInfo")
@XmlAccessorType(XmlAccessType.FIELD)
public class TxSupervisorCallingListInfo {

	@XmlElement(name = "DomainId")
	private String domainId;
	@XmlElement(name = "UserId")
	private String userId;
	@XmlElement(name = "UserProcessId")
	private String userProcessId;
	@XmlElement(name = "MessageText")
	private String messageText;
	@XmlElement(name = "MessageType")
	private String messageType;
	@XmlElement(name = "Source")
	private String source;
	@XmlElement(name = "IsSupervisorMessageDisplayed")
	private String isSupervisorMessageDisplayed;
	
	public TxSupervisorCallingListInfo() {
	}

	public String getDomainId() {
		return domainId;
	}

	public void setDomainId(String domainId) {
		this.domainId = domainId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserProcessId() {
		return userProcessId;
	}

	public void setUserProcessId(String userProcessId) {
		this.userProcessId = userProcessId;
	}

	public String getMessageText() {
		return messageText;
	}

	public void setMessageText(String messageText) {
		this.messageText = messageText;
	}

	public String getMessageType() {
		return messageType;
	}

	public void setMessageType(String messageType) {
		this.messageType = messageType;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getIsSupervisorMessageDisplayed() {
		return isSupervisorMessageDisplayed;
	}

	public void setIsSupervisorMessageDisplayed(String isSupervisorMessageDisplayed) {
		this.isSupervisorMessageDisplayed = isSupervisorMessageDisplayed;
	}

	@Override
	public String toString() {
		return "TxSupervisorCallingListInfo [domainId=" + domainId + ", userId=" + userId + ", userProcessId="
				+ userProcessId + ", messageText=" + messageText + ", messageType=" + messageType + ", source=" + source
				+ ", isSupervisorMessageDisplayed=" + isSupervisorMessageDisplayed + "]";
	}
}
