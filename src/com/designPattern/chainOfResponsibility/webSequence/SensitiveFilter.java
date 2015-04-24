 package com.designPattern.chainOfResponsibility.webSequence;
 public class SensitiveFilter implements Filter {

	@Override
	public void doFilter(Request request, Response response, FilterChain filterChain) {
		
		request.setRequestStr(request.getRequestStr().replace("forbidden", "hidden").
				replace("sensible", "hidden") + "---SensitiveFilter");
		
		filterChain.doFilter(request, response, filterChain);
		
		response.setResponseStr(response.getResponseStr() + "---SensitiveFilter");
		 
	}

}

 