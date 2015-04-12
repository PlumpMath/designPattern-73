 package com.designPattern.strategy;
 public class CatAgeComparator implements Comparator {

	@Override
	public int compare(Object a, Object b) {
		
		Cat aCat = (Cat) a;
		Cat bCat = (Cat) b;
		
		if (aCat.getAge() > bCat.getAge()) return 1;
		else if (aCat.getAge() < bCat.getAge()) return -1;
		return 0;

	}

}

 