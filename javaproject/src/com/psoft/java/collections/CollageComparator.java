package com.psoft.java.collections;

import java.util.Comparator;

public class CollageComparator implements Comparator<Students> {

    @Override
    public int compare(Students s1, Students s2) {
        return s1.getCollage().compareTo(s2.getCollage());
    }
}
