 package com.designPattern.chainOfResponsibility;

import org.junit.Test;
 public class TestClass {

	 @Test
	 public void test01(){
		 String message = "This is test :),<script> label,this is forbidden,this is sensible.";
		 Filter htmlFilter = new HTMLFilter();
		 Filter sensitiveFilter = new SensitiveFilter();
		 Filter faceFilter = new FaceFilter();
		 String result = faceFilter.doFilter(sensitiveFilter.doFilter(htmlFilter.doFilter(message)));
		 System.out.println(result);
	 }
	 
	 @Test
	 public void test02(){
		 String message = "This is test :),<script> label,this is forbidden,this is sensible.";
		 Filter htmlFilter = new HTMLFilter();
		 Filter sensitiveFilter = new SensitiveFilter();
		 Filter faceFilter = new FaceFilter();
		 
		 FilterChain fc1 = new FilterChain();
		 fc1.addFilter(htmlFilter).addFilter(sensitiveFilter);
		 
		 FilterChain fc2 = new FilterChain();
		 fc2.addFilter(faceFilter);
		 
		 fc1.addFilter(fc2);
		 
		 String result = fc1.doFilter(message);
		 System.out.println(result);
		 
	 }
}

 