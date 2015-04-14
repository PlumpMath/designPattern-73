package com.designPattern.factory.spring;

public class Car implements Moveable {

	@Override
	public void move() {
		System.out.println("Car running...");
	}

}
