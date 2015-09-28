package com.practice.vivek;

// The compareTo method is used when we need to determine the order of Strings lexicographically.
// It compares char values similar to the equals method. The compareTo method returns a negative
// integer if the first String object precedes the second string. It returns zero if the 2
// strings being compared are equal. It returns a positive integer if the first String object 
// follows the second string.


public class StringComparison2 {

	public static void main(String[] args) {
		String name1 = "bob";
		String name2 = new String("cob");
		String name3 = "Bob";

		// 1st case
		if (name1.compareTo(name2) == 0) {
			System.out.println("The strings are equal.");
		} else if (name1.compareTo(name2) < 0) {
			System.out.println("name2 follows name1");
		} else {
			System.out.println("name1 follows name2");
		}
		
		// 2nd case. Comparing Ascii Uppercase will be smaller then Lower Case
		// A=65 to Z=90
		// a=97 to z=122			0-48 to 9-57 
		
		
		if (name1.compareTo(name3) == 0) {
			System.out.println("The strings are equal.");
		} else if (name1.compareTo(name3) < 0) {
			System.out.println("name3 follows name1");
		} else {
			System.out.println("name1 follows name3");
		}
	}
}
