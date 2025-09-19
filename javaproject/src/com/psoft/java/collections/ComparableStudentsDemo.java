package com.psoft.java.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableStudentsDemo {
	
	public static void main(String[] args) {
		 
		List<Students> students = new ArrayList<>(); 
			
		students.add(new Students("kumar", "kcdc", 22, 800));
		students.add(new Students("jayasai", "vrc", 21, 700));
		students.add(new Students("chand", "svc", 23,750));
		students.add(new Students("haffez", "jagans", 24, 850));
		
		System.out.println("original values:");
			for(Students k : students){
			System.out.println(k);
			}
			
			//senorio 1 : compare (names)
			
			Collections.sort(students);
			System.out.println("\nSorted by names(comparator:");
			for (Students k : students) {
				System.out.println(k);
			}
			
			//senorio 2 : compare (collage)
			
			Collections.sort(students, new CollageComparator());
			System.out.println("\nSorted by collage (comparator):");
			for (Students k : students) {
			    System.out.println(k);
			}
		
			//senorio 3 : compare(age)
			Collections.sort(students, new AgeComparator() );
			System.out.println("\nSorted by age (compasator):");
			for (Students k : students) {
				System.out.println(k);
			}
			// senorio 4: compare (marks)
			
			Collections.sort(students, new MarksComparator());
			System.out.println("\nSorted by marks(comaparater):");
			for (Students s : students) {
				System.out.println(s);
			}
			
	}

}
