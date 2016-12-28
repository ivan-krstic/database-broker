package me.krstic.vo;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ServiceResponse {

	private Integer code;
	private String message;
	private Number id;
	
	public ServiceResponse() {
	}

	public ServiceResponse(Integer code, String message, Number id) {
		this.code = code;
		this.message = message;
		this.id = id;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Number getId() {
		return id;
	}

	public void setId(Number id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Response [code=" + code + ", message=" + message + ", id=" + id + "]";
	}
}
