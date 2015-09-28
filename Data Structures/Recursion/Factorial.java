package com.practice.Recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factorial {

	static int theNumber;
	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.print("Enter a number: ");
		String s = br.readLine();
		theNumber = Integer.parseInt(s);
		
		int theAnswer = factorial(theNumber);
		System.out.println("Factorial= "+theAnswer);
	}

	// 2 diff from TriangularNumbers
		// 1. base condition is n==0, not n==1
		// 2. here, n * factorial(n-1) instead of n + triangle(n-1)    -  i.e. * instead of +
		
	public static int factorial(int n) {
		if(n==0)
			return 1;
		else
			return( n * factorial(n-1) );
	}
	
}
