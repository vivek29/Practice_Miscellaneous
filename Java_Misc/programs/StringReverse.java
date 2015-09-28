package com.practice.vivek;

import java.util.*;

public class StringReverse {

	public static void main(String[] args) {
		String input = "beginner java tutorial";

		Stack stack = new Stack(); //A Stack is a Last In First Out Data Structure
		
		StringTokenizer stringTokenizer = new StringTokenizer(input);	// takes words as input not characters
		
		while (stringTokenizer.hasMoreTokens()) {
			stack.push(stringTokenizer.nextElement());		// push a complete word rather than characters
		}
		
		System.out.println("Original String: " + input);
		
		System.out.print("Reversed String by Words: ");
		
		while (!stack.empty()) {
			System.out.print(stack.pop());
			System.out.print(" ");
		}
		
		System.out.println();
		
		System.out.print("Reversed String by characters: ");
		StringBuffer rev = new StringBuffer(input).reverse();
		System.out.print(rev);
	}
}		


/*	The StringBuffer and StringBuilder classes are used when there is a necessity to make a lot of modifications to Strings of characters.

Unlike Strings objects of type StringBuffer and StringBuilder can be modified over and over again with out leaving behind a lot of new unused objects.

The StringBuilder class was introduced as of Java 5 and the main difference between the StringBuffer and StringBuilder is that StringBuilders methods are not thread safe(not Synchronised).

It is recommended to use StringBuilder whenever possible because it is faster than StringBuffer. However if thread safety is necessary the best option is StringBuffer objects.
*/