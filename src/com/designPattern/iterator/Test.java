 package com.designPattern.iterator;
 public class Test {

	 @org.junit.Test
	 public void testArrayList(){
		 ArrayList list = new ArrayList();
		 for (int i = 0; i < 15; i++){
			 Integer integer = new Integer(i);
			 list.add(integer);
		 }
		 
		 Iterator iterator = list.getIterator();
		 while(iterator.hasNext()){
			 System.out.println(iterator.next());
		 }
		 
	 }
	 
	 @org.junit.Test
	 public void testLinkedList(){
		 LinkedList list = new LinkedList();
		 for (Integer i = 0; i < 15; i++){
			 Integer integer = new Integer(i);
			 list.add(integer);
		 }
		 
		 Iterator iterator = list.getIterator();
		 while(iterator.hasNext()){
			 System.out.println(iterator.next());
		 }
	 }
}

 