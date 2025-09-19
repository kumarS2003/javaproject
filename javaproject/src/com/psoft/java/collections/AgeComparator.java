package com.psoft.java.collections;

import java.util.Comparator;

public class AgeComparator implements Comparator<Students> {

	
	public int compare(Students k1 , Students k2 ) {
		return Integer.compare(k1.getAge(), k2.getAge());
		
	}

}
