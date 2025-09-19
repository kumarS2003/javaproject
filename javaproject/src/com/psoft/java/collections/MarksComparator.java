package com.psoft.java.collections;

import java.util.Comparator;

public class MarksComparator implements Comparator<Students> {

	@Override
	public int compare( Students o1 , Students o2) {
		// TODO Auto-generated method stub
		return Integer.compare(o1.getMarks(), o2.getMarks());
	}

}
