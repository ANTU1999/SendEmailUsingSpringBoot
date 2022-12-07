package com.email.send.entity;



public class Email {

	
	private String to;
	private String sub;
	private String message;
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getSub() {
		return sub;
	}
	public void setSub(String sub) {
		this.sub = sub;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "Email [to=" + to + ", sub=" + sub + ", message=" + message + "]";
	}
	
	
}
