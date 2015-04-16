 package com.designPattern.proxy.fourth;

 public class Test {
	 
	 @org.junit.Test
	 public void test() throws Exception{
		 Moveable m = (Moveable)Proxy.newInstance(Moveable.class, new LogHandler(new Tank()));
		 m.move();
	 }
	 
	 @org.junit.Test
	 public void test01() throws Exception{
		 
		 Moveable m = (Moveable) Proxy.newInstance(Moveable.class,new TimeHandler(new Tank()));
		 m.move();
	 }
	 
	 @org.junit.Test
	 public void testProxy() throws Exception{
		 Proxy.newInstance(Moveable.class,new TimeHandler(new Tank()));
	 }
}

 