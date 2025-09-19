package com.psoft.java.collections;

import java.util.Comparator;

public class BrandComparator implements Comparator <Laptop>{

	@Override
	public int compare(Laptop o1, Laptop o2) {
		// TODO Auto-generated method stub
		return o1.getBrand().compareTo(o2.getBrand());
		
	}
}
