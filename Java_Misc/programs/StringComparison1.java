package com.practice.vivek;

// The == operator is used when we have to compare the String object references. If two String
// variables point to the same object in memory, the comparison returns true. Otherwise,
// the comparison returns false. Note that the ‘==’ operator does not compare the content
// of the text present in the String objects. It only compares the references the 2 Strings
// are pointing to.


public class StringComparison1 {

	public static void main(String[] args) {
		
		String name1 = "Bob";
		String name2 = new String("Bob");
		String name3 = "Bob";
		String name4 = "Bob1";
		
		// 1st case
		if (name1 == name2) {
			System.out.println("The strings are equal.");
		} else {
			System.out.println("The strings are unequal.");
		}
		
		// 2nd case
		if (name1 == name3) {
			System.out.println("The strings are equal.");
		} else {
			System.out.println("The strings are unequal.");
		}
	
// The equals method is used when we need to compare the content of the text present in the
// String objects. This method returns true when two String objects hold the same content
// (i.e. the same values). The following Program would print “The strings are unequal” In the
// first case and “The strings are equal” in the second case.
		
		// 1st case
				if (name1.equals(name4)) {
					System.out.println("The strings are equal.");
				} else {
					System.out.println("The strings are unequal.");
				}
				// 2nd case
				if (name1.equals(name3)) {
					System.out.println("The strings are equal.");
				} else {
					System.out.println("The strings are unequal.");
				}
	
	}
}
