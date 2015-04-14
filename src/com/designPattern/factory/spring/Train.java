package com.designPattern.factory.spring;

public class Train implements Moveable {

	@Override
	public void move() {
		System.out.println("train runnig...");
	}

}
