 package com.designPattern.strategy;
 public class Dog implements Comparable{
	 private int height;

	public Dog() {
		super();		 
	}

	@Override
	public String toString() {
		return "Dog [height=" + height + "]";
	}

	public Dog(int height) {
		super();
		this.height = height;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public int compareTo(Object object) {
		 return 0;
		 
	}
}

 