package com.vacations.records.backend.payload.response;

public class LoginMessage {

	private String msg;
	private Boolean isLogged;
	
	public LoginMessage(String msg, Boolean isLogged) {
		super();
		this.msg = msg;
		this.isLogged = isLogged;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Boolean getIsLogged() {
		return isLogged;
	}

	public void setIsLogged(Boolean isLogged) {
		this.isLogged = isLogged;
	}
	
	
	
}
