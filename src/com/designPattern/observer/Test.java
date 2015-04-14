 package com.designPattern.observer;
 public class Test {
	 @org.junit.Test
	 public void test(){
		 Listened button = new ConcreteListened();
		 Listener first = new ConcreteListener();
		 Listener second = new ConcreteListener();
		 Listener third = new ConcreteListener();
		 button.addListener(first);
		 button.addListener(second);
		 button.addListener(third);
		 button.notifyListeners("hi...");
	 }
	 
}

 