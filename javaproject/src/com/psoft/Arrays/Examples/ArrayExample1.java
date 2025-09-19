package com.psoft.Arrays.Examples;

public class ArrayExample1 {
	
	    public static void main(String[] args) {
	        
	        // Declare and initialize an array
	        int[] numbers = {100, 200, 300, 400, 500};

	        // Print array elements using for loop
	        System.out.println("Array elements are:");
	        for (int i = 0; i < numbers.length; i++) {
	            System.out.println("Element at index " + i + " = " + numbers[i]);
	        }

	        // Sum of array elements
	        int sum = 0;
	        for (int num : numbers) {  // for-each loop
	            sum += num;
	        }
	        System.out.println("Sum of array elements = " + sum);
	    }
	}

