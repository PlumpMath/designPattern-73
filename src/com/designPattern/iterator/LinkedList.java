 package com.designPattern.iterator;
 public class LinkedList implements Collection{
	 private Node head = null;
	 private Node tail = null;
	 private int index = 0;
	 @SuppressWarnings("unused")
	private Iterator iterator;
	 
	 public Iterator getIterator() {
		return new LinkedListIterator();
	}

	@Override
	 public void add(Object o){
		Node node = new Node(o); 
		if (head == null) {
			 head = node;
			 tail = node;
		 }
		 tail.setNext(node);
		 tail = node;
		 index ++;
	 }
	 
	@Override 
	public int size(){
		 return index;
	 }
	 
	 private class LinkedListIterator implements Iterator{

		 private int currentIndex = 0;
		 
		@Override
		public boolean hasNext() {
			if (currentIndex >= index) return false; 
			return true;
			 
		}

		@Override
		public Object next() {
			Node node = null;
			for (int i = 0; i <= currentIndex; i++) {
				if (i == 0) {
					node = head;
				} else {
					node = node.getNext();
				}
			}
			currentIndex ++;
			return node.getValue();
			 
		}
		 
	 }
}

 