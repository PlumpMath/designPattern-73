 package com.designPattern.chainOfResponsibility.web;
 public class SensitiveFilter implements Filter {

	@Override
	public void doFilter(Request request, Response response) {
		
		request.setRequestStr(request.getRequestStr().replace("forbidden", "hidden").
				replace("sensible", "hidden") + "---SensitiveFilter");
		
		response.setResponseStr(response.getResponseStr() + "---SensitiveFilter");
		 
	}

}

 