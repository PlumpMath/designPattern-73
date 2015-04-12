 package com.designPattern.strategy;
 public class Sort {
	 
	 
	 public static void sort(Object[] objects){
		 for (int i = objects.length; i > 0; i--){
			 for (int j = 0; j < i-1; j++){
				 Comparable a = (Comparable) objects[j];
				 Comparable b = (Comparable) objects[j+1];
				 if (a.compareTo(b)==1) swap(objects, j, j+1);
			 }
		 }
	 }

	private static void swap(Object[] objects, int x, int y) {
		Object temp = objects[x];
		objects[x] = objects[y];
		objects[y] = temp;
	}
}

 