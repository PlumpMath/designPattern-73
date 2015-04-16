 package com.designPattern.proxy.fourth;

import java.lang.reflect.Method;
 public class TimeHandler implements InvocationHandler {

	 private Object target;
	 
	 public TimeHandler(Object target) {
		 super();
		 this.target = target;
	}
	 
	@Override
	public void invoke(Object object,Method method) {
		long start = System.currentTimeMillis();
		System.out.println("Start time:"+start);
		try {
			method.invoke(target, new Object[]{});
		} catch (Exception e) {
			 e.printStackTrace();			 
		} 
		long end = System.currentTimeMillis();
		System.out.println("Run time:"+(end-start));
	}

}

 