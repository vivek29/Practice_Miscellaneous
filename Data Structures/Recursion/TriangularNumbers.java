package com.practice.Recursion;

import java.io.*;

public class TriangularNumbers {
	
	static int theNumber;
	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.print("Enter a number: ");
		String s = br.readLine();
		theNumber = Integer.parseInt(s);
		
		int theAnswer = triangle(theNumber);
		System.out.println("Triangle= "+theAnswer);
	}

	public static int triangle(int n) {
		if(n==1)
			return 1;
		else
			return( n + triangle(n-1) );
	}
}
