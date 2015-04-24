 package com.designPattern.chainOfResponsibility.web;

import org.junit.Test;
 public class TestClass {

	 @Test
	 public void test01() {
		 String message = "This is test :),<script> label,this is forbidden,this is sensible.";
		 Request request = new Request(message);
		 Response response = new Response("response");
		 FilterChain filterChain = new FilterChain();
		 filterChain.addFilter(new HTMLFilter()).addFilter(new SensitiveFilter()).addFilter(new FaceFilter());
		 filterChain.doFilter(request, response);
		 System.out.println(request.getRequestStr());
		 System.out.println(response.getResponseStr());
	}
	 
}

 