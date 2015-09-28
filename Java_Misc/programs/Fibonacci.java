package com.practice.vivek;

public class Fibonacci {

	public static void main(String args[]) {
		System.out.println("Printing Limited set of Fibonacci Sequence");
		
		double fib1 = 0;
		double fib2 = 1;
		double temp = 0;
		System.out.println(fib1);
		System.out.println(fib2);
		
		do {
			temp = fib1 + fib2;
			System.out.println(temp);
		
			fib1 = fib2;	 	// Replace 2nd with first number
			fib2 = temp; 		// Replace temp number with 2nd number
		
		} while (fib2 < 5000);
	}
}