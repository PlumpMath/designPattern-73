 package com.designPattern.proxy.second;

 public class Test {
	 
	 @org.junit.Test
	 public void test(){
		 Tank tank = new Tank();
		 
		 TankLogProxy tlp = new TankLogProxy(tank);
		 TankTimeProxy ttp = new TankTimeProxy(tlp);
		 Moveable m = ttp;
		 m.move();
	 }
}

 