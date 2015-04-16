 package com.designPattern.proxy.first;
 public class Tank3 implements Moveable {

	 Tank t;
	 
	public Tank3(Tank t) {
		super();
		this.t = t;
	}

	@Override
	public void move() {
		long start = System.currentTimeMillis();
		t.move();
		long end = System.currentTimeMillis();
		System.out.println("Run time:"+(end-start));
	}

}

 