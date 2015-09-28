package com.practice.vivek;
import java.util.*;
public class compound {

	public static void main(String ar[]){
		
		double amount;
		double principal= 10000;
		double rate= 0.05;
		
		for(int month=1;month<=12;month++)
		{
			amount=principal*Math.pow(1+rate, month);			// A=P(1+R)^n
																// pow takes 2 arguments
																// like if x^y than pow(x,y);
			System.out.println(month+ "   "+amount);
		}
	
	/*	Scanner sc=new Scanner(System.in);
		System.out.println("Enter the month");
		int month = sc.nextInt();
			
		while(month<=12){
			
			amount=principal*Math.pow(1+rate, month);			// A=P(1+R)^n
																// pow takes 2 arguments
																// like if x^y than pow(x,y);
			System.out.println(month+ "   "+amount);
			month++;
		}
		*/
		
		}
	}
	
