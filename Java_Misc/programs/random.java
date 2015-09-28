package com.practice.vivek;
import java.util.Random;

public class random {

	public static void main(String ar[]){
		
		Random dice=new Random();
		int number;
	/*	
		for(int i=1;i<=10;i++)
		{

//			number = dice.nextInt(6);				// this displays no from 0 to 5
			
			number = 1+ dice.nextInt(6);			// now from 1-6....10 times bcoz of for loop
					
			System.out.println(number);
			
		}
		
	*/	
											// array value can also be incremented
		int a[]={3,5,6,7};					// means through index/reference/address
	a[1]++;										
	++a[2];
	++a[3];
	System.out.println(a[1]);
	System.out.println(a[2]);
	System.out.println(a[3]);
	
	}
	
	
}
