package com.practice.vivek;

import java.util.Scanner;   			// Sum of 2 no

public class test3 {

public static void main(String ar[])
	
	{
		
		Scanner sc = new Scanner(System.in);

		double fn,sn,ans;
		
		System.out.println("Enter first no");
		fn=sc.nextDouble();								// here the method is nextDouble
		
		System.out.println("Enter second no");
		sn=sc.nextDouble();
		
		ans=fn+sn;
	
		System.out.println("Sum is  "+ans);
	}
}