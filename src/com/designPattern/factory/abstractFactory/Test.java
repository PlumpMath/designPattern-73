 package com.designPattern.factory.abstractFactory;
 public class Test {
	 
	 @org.junit.Test
	 public void test(){
	 
//		 AbstractFactory factory = new DefaultFactory();
		 AbstractFactory factory = new MagicFactory();
		 Food food = factory.creatFood();
		 food.printName();
		 Vehicle vehicle = factory.createVehicle();
		 vehicle.run();
		 Weapon weapon = factory.createWeapon();
		 weapon.shoot();
	 }
}

 