package com.psoft.Arrays.Examples;

public class Arrayexample {
	
	    public static void main(String[] args) {
	        // Array declaration and initialization
	        int[] numbers = {10, 20, 30, 40, 50};

	        // Printing array elements using for loop
	        System.out.println("Array elements:");
	        for (int i = 0; i < numbers.length; i++) {
	            System.out.println("Element at index " + i + " = " + numbers[i]);
	        }

	        // Printing array elements using for-each loop
	        System.out.println("\nUsing for-each loop:");
	        for (int num : numbers) {
	            System.out.println(num);
	        }
	    }
	}

