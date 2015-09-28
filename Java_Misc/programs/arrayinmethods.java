package com.practice.vivek;

public class arrayinmethods {

	public static void main(String ar[]){
		
		int a[]={1,3,5,7,9};
		change(a);								// method calling
												// methodname(arrayname)
												// that is pass the reference of array
												// where it is starting(base address)

		for(int d: a){					//	enhancedfor--takes all values from the array a
			
			
			System.out.println(d);		// prints all the values while taking 1 value at a time
		}								// from the array(integer type--here)		
		
	}
											// outside main but in the class

	public static void change(int x[]){					// takes an array as a parameter
														// and stores it in another int array(x)
		for(int c=0;c<x.length;c++){
			
			x[c]+=5;
		}
		
	}
	
}
