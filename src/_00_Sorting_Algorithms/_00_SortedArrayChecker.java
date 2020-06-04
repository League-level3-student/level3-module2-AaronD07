package _00_Sorting_Algorithms;

import java.util.function.BooleanSupplier;

public class _00_SortedArrayChecker {

	public static boolean intArraySorted(int[] unsorted) {
		// TODO Auto-generated method stub;
		int x = unsorted[0];
		boolean y = true;
		for (int i = 0; i < unsorted.length; i++) {
			if (unsorted[i] >= x) {
				x = unsorted[i];

			} else {
				y = false;
			}
		}
		return y;
	}
	// 1. Write a static method called intArraySorted.
	// This method takes in an array of integers
	// and it returns a boolean.
	// The method returns true if the integer
	// array is in ascending order and false otherwise

	public static boolean doubleArraySorted(double[] unsorted) {
		// TODO Auto-generated method stub
		double x = unsorted[0];
		boolean y = true;
		for (int i = 0; i < unsorted.length; i++) {
			if (unsorted[i] >= x) {
				x = unsorted[i];

			} else {
				y = false;
			}
		}
		return y;
		
	}

	public static boolean charArraySorted(char[] unsorted) {
		// TODO Auto-generated method stub
		int previous = unsorted[0];
		boolean sorted = true;
		for (int i = 0; i < unsorted.length; i++) {
			if (unsorted[i] < previous) {
				sorted = false;

			} 
			previous = unsorted[i];
		}
		return sorted;
		
	}

	public static boolean stringArraySorted(String[] sorted) {
		// TODO Auto-generated method stub

		String previous = sorted[0];
		boolean yeet = true;
		for (int i = 0; i < sorted.length; i++) {
			if (sorted[i].compareTo(previous)<0) {
				yeet = false;

			} 
			previous = sorted[i];
		}
		return yeet;
		
	}

	// 2. Write a static method called doubleArraySorted.
	// This method takes in an array of doubles
	// and it returns a boolean.
	// The method returns true if the double
	// array is in ascending order and false otherwise

	// 3. Write a static method called charArraySorted.
	// This method takes in an array of characters
	// and it returns a boolean.
	// The method returns true if the character
	// array is in alphabetical order and false otherwise
	// (You can compare characters just like integers)

	// 4. Write a static method called stringArraySorted.
	// This method takes in an array of Strings
	// and it returns a boolean.
	// The method returns true if the String
	// array is in alphabetical order and false otherwise
	// (Use the compareTo(String) method)

}
