 package com.designPattern.factory;
 public class Test {
	 
	 @org.junit.Test
	 public void test(){
//		 VehicleFactory vehicleFactory = new PlaneFactory();
		 VehicleFactory vehicleFactory = new CarFactory();
		 Moveable moveable = vehicleFactory.create();
		 moveable.run();
	 }
}

 