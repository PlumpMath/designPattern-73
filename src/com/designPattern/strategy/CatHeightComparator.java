 package com.designPattern.strategy;
 public class CatHeightComparator implements Comparator {

	@Override
	public int compare(Object a, Object b) {

		Cat aCat = (Cat) a;
		Cat bCat = (Cat) b;
		
		if (aCat.getHeight() > bCat.getHeight()) return 1;
		else if (aCat.getHeight() < bCat.getHeight()) return -1;
		return 0;

	}

}

 