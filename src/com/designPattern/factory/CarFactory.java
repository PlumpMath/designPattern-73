 package com.designPattern.factory;
 public class CarFactory extends VehicleFactory {

	@Override
	public Moveable create() {
		return new Car();

	}

}

 