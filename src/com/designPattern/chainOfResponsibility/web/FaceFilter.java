 package com.designPattern.chainOfResponsibility.web;
 public class FaceFilter implements Filter {

	@Override
	public void doFilter(Request request, Response response) {
		request.setRequestStr(request.getRequestStr().replace(":)", "v_v") + "---FaceFilter");
		
		response.setResponseStr(response.getResponseStr() + "---FaceFilter");
		 
	}

}

 