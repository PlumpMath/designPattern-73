 package com.designPattern.chainOfResponsibility.webSequence;
 public class FaceFilter implements Filter {

	@Override
	public void doFilter(Request request, Response response, FilterChain filterChain) {
		request.setRequestStr(request.getRequestStr().replace(":)", "v_v") + "---FaceFilter");
		
		filterChain.doFilter(request, response, filterChain);
		
		response.setResponseStr(response.getResponseStr() + "---FaceFilter");
		 
	}

}

 