 package com.designPattern.factory.abstractFactory;
 public class DefaultFactory extends AbstractFactory {

	@Override
	public Food creatFood() {
		return new Apple();

	}

	@Override
	public Vehicle createVehicle() {
		return new Car();

	}

	@Override
	public Weapon createWeapon() {
		return new AK47();

	}

}

 