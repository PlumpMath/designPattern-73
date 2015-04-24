 package com.designPattern.chainOfResponsibility;
 public class SensitiveFilter implements Filter {

	@Override
	public String doFilter(String msg) {
		String result = msg.replace("forbidden", "hidden").
				replace("sensible", "hidden");
		return result;

	}

}

 