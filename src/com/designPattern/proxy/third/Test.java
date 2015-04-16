 package com.designPattern.proxy.third;

 public class Test {
	 
	 @org.junit.Test
	 public void test(){
		 Tank tank = new Tank();
		 
		 TankLogProxy tlp = new TankLogProxy(tank);
		 Moveable m = tlp;
		 m.move();
	 }
	 
	 @org.junit.Test
	 public void test01() throws Exception{
		 Moveable m = (Moveable) Proxy.newInstance(Moveable.class);
		 m.move();
	 }
	 
	 @org.junit.Test
	 public void testProxy() throws Exception{
		 Proxy.newInstance(Moveable.class);
	 }
}

 