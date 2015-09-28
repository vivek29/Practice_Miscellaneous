package com.practice.vivek;
										// MAIN Class
public class composition1 {

	public static void main(String ar[]){
		
		composition3 obj = new composition3(4,5,6);				// initialize constructor
		
		composition2 obj1 = new composition2("Alice",obj);		// a name is passed plus the 
																// reference of other obj is passed

		System.out.println(obj1);
		
	}
	
	
}
