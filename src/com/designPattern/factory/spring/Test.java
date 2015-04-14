package com.designPattern.factory.spring;

public class Test {
	@org.junit.Test
	public void test(){
		try {
			BeanFactory beanFactory = new ClassPathXmlApplicationContext("com/designPattern/factory/spring/applicationContext.xml");
			Moveable m = (Moveable) beanFactory.getBean("train");
			m.move();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
