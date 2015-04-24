 package com.designPattern.chainOfResponsibility.web;
 public class HTMLFilter implements Filter {

	@Override
	public void doFilter(Request request, Response response) {

		request.setRequestStr(request.getRequestStr().replace("<", "[").replace(">", "]")+"---HTMLFilter");
		
		response.setResponseStr(response.getResponseStr()+"---HTMLFilter");
		 
	}

}

 