 package com.designPattern.proxy.first;
 public class Tank implements Moveable {

	@Override
	public void move() {
		System.out.println("tank is moving...");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			 e.printStackTrace();			 
		}
	}

}

 