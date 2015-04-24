 package com.designPattern.chainOfResponsibility.webSequence;
 public class Request {

	 public Request(String requestStr) {
		super();
		this.requestStr = requestStr;
	}

	String requestStr;

	public String getRequestStr() {
		return requestStr;
	}

	public void setRequestStr(String requestStr) {
		this.requestStr = requestStr;
	}
}

 