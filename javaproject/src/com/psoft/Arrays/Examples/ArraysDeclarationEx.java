package com.psoft.Arrays.Examples;

public class ArraysDeclarationEx {
	
	    public static void main(String[] args) {
	        
	        // 1. Declaration and then initialization
	        int[] marks;        // declaring array
	        marks = new int[5]; // allocating memory for 5 integers

	        // Assign values
	        marks[0] = 90;
	        marks[1] = 80;
	        marks[2] = 70;
	        marks[3] = 85;
	        marks[4] = 95;

	        // 2. Declaration + Initialization in single line
	        int[] numbers = {10, 20, 30, 40, 50};

	        // Printing first array
	        System.out.println("Marks array elements:");
	        for (int i = 0; i < marks.length; i++) {
	            System.out.println("marks[" + i + "] = " + marks[i]);
	        }

	        // Printing second array
	        System.out.println("\nNumbers array elements:");
	        for (int i = 0; i < numbers.length; i++) {
	            System.out.println("numbers[" + i + "] = " + numbers[i]);
	        }
	    }
	}

