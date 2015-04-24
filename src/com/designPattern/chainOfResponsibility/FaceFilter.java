 package com.designPattern.chainOfResponsibility;
 public class FaceFilter implements Filter {

	@Override
	public String doFilter(String msg) {

		String result = msg.replace(":)", "v_v");
		return result;

	}

}

 