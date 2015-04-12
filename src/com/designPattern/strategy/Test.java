 package com.designPattern.strategy;
 public class Test {

	@org.junit.Test
	 public void test01() {
		Cat[] cats = {new Cat(5,7),new Cat(4,4),new Cat(7,3),new Cat(1,1)};
		Sort.sort(cats);
		for (Cat cat : cats) {
			System.out.print(cat + " ");
		}
	}

}

 