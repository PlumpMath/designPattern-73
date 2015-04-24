 package com.designPattern.chainOfResponsibility.web;
 public class Response {

	 public Response(String responseStr) {
		super();
		this.responseStr = responseStr;
	}

	String responseStr;

	public String getResponseStr() {
		return responseStr;
	}

	public void setResponseStr(String responseStr) {
		this.responseStr = responseStr;
	}
}

 