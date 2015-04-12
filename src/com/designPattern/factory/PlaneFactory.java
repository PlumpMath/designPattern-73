 package com.designPattern.factory;
 public class PlaneFactory extends VehicleFactory {

	@Override
	public Moveable create() {
		return new Plane();

	}

}

 