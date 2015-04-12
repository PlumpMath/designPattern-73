 package com.designPattern.iterator;
 public class ArrayList implements Collection{
	 Object[] objects = new Object[10];
	 private int index=0;
	 @SuppressWarnings("unused")
	private Iterator iterator;
	 
	 public Iterator getIterator() {
		return new ArrayListIterator();
	}

	@Override
	 public void add (Object object){
		 if (index >= objects.length){
			 Object[] newObjects = new Object[objects.length * 2];
			 System.arraycopy(objects, 0, newObjects, 0, objects.length);
			 objects = newObjects;
		 }
		 objects[index] = object;
		 index ++;
	 }
	 
	@Override
	 public int size(){
		 return index;
	 }
	 
	 private class ArrayListIterator implements Iterator{

		private int currentIndex = 0;
		 
		@Override
		public boolean hasNext() {
			if (currentIndex >= index) return false;
			return true;
			 
		}

		@Override
		public Object next() {
			Object object = objects[currentIndex];
			currentIndex++;
			return object;
			 
		}
		 
	 }
}

 