 package com.designPattern.proxy.first;
 public class Tank2 extends Tank {

	@Override
	public void move() {
		long start = System.currentTimeMillis();
		super.move();
		long end = System.currentTimeMillis();
		System.out.println("Run time:"+(end-start)); 
	}
	 
}

 