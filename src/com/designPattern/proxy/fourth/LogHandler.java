 package com.designPattern.proxy.fourth;

import java.lang.reflect.Method;
 public class LogHandler implements InvocationHandler {

	 Object target;
	 
	 public LogHandler(Object target) {
		 super();
		 this.target = target;
	}
	 
	@Override
	public void invoke(Object object,Method method) {
		System.out.println("Tank start...");
		try {
			method.invoke(target, new Object[]{});
		} catch (Exception e) {
			 e.printStackTrace();			 
		} 
		System.out.println("Tank stop...");
	}

}

 