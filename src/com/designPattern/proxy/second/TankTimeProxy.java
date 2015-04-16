 package com.designPattern.proxy.second;
 public class TankTimeProxy implements Moveable {

	 Moveable t;
	 
	public TankTimeProxy(Moveable t) {
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

 