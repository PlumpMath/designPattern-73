 package com.designPattern.factory.abstractFactory;
 public class MagicFactory extends AbstractFactory {

	@Override
	public Food creatFood() {
		return new Mushroom();

	}

	@Override
	public Vehicle createVehicle() {
		return new Broom();

	}

	@Override
	public Weapon createWeapon() {
		return new MagicStick();

	}

}

 