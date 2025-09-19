package com.psoft.java.collections;


	
	import java.util.*;
	 
	/**
	* Main class to demonstrate Comparable and Comparator.
	*/
	public class ComparableDemo {
	    public static void main(String[] args) {
	        List<Laptop> laptops = new ArrayList<>();
	        laptops.add(new Laptop(3, "Dell", 8, 55000));
	        laptops.add(new Laptop(1, "HP", 16, 65000));
	        laptops.add(new Laptop(4, "Apple", 8, 120000));
	        laptops.add(new Laptop(2, "Lenovo", 12, 45000));
	 
	        System.out.println("Original List:");
	        for (Laptop l : laptops) {
	            System.out.println(l);
	        }
	 
	        // Scenario 1: Default Comparable (price)
	        Collections.sort(laptops);
	        System.out.println("\nSorted by Price (Comparable):");
	        for (Laptop l : laptops) {
	            System.out.println(l);
	        }
	 
	        // Scenario 2: Sort by Brand
	        Collections.sort(laptops, new BrandComparator());
	        System.out.println("\nSorted by Brand (Comparator):");
	        for (Laptop l : laptops) {
	            System.out.println(l);
	        }
	 
	        // Scenario 3: Sort by RAM
	        Collections.sort(laptops, new RamComparator());
	        System.out.println("\nSorted by RAM (Comparator):");
	        for (Laptop l : laptops) {
	            System.out.println(l);
	        }
	 
	         //Scenario 4: Sort by ID
	       Collections.sort(laptops, new IdComparator());
	        System.out.println("\nSorted by ID (Comparator):");
	        for (Laptop l : laptops) {
	           System.out.println(l);
	        
	       }
	    }

	}
