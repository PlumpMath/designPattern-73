 package com.designPattern.proxy.first;

 public class Test {
	 
	 @org.junit.Test
	 public void test(){
		 Tank tank = new Tank();
		 Moveable m = new Tank3(tank);
		 m.move();
	 }
}

 