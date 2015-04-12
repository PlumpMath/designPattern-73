package com.designPattern.strategy;

public class Cat implements Comparable {
	private int age;
	private int height;
	//private Comparator comparator = new CatHeightComparator();
	private Comparator comparator = new CatAgeComparator();
	
	public Cat() {
		super();
	}

	public Cat(int age, int height) {
		super();
		this.age = age;
		this.height = height;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void setComparator(CatAgeComparator comparator) {
		this.comparator = comparator;
	}

	@Override
	public String toString() {
		return "Cat [age=" + age + ", height=" + height + "]";
	}

	@Override
	public int compareTo(Object object) {

		return comparator.compare(this, object);

	}

}
