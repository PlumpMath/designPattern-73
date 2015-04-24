 package com.designPattern.chainOfResponsibility;
 public class HTMLFilter implements Filter {

	@Override
	public String doFilter(String msg) {
		String resultMsg = msg.replace("<", "[").replace(">", "]");
		return resultMsg;
	}

}

 