 package com.designPattern.observer;
 public class ConcreteListener implements Listener {

	@Override
	public void update(String str) {
		System.out.println(str);
	}

}

 