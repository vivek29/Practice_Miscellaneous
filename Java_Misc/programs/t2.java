package com.practice.vivek;
import java.util.Scanner;

public class t2 {

	public static void main(String ae[]){
		
		Scanner sc = new Scanner(System.in);
	/*	
		t1 obj = new t1();
		
		//obj.saying();						// if used first,saying method initializes first 
											// and so o/p is: first gf was null
		System.out.println("Enter your gf name");
		String temp = sc.nextLine();
		
		obj.setName(temp);
		obj.saying();
		
	*/
		                           // With Constructor
		t1 obj = new t1("Alice");
		obj.saying();
												// other object has its own variables 
												// so can call the same method means
												// two diff objects work on 1 same method
		t1 obj2 = new t1("Niks");
		obj2.saying();
		
	}
		
}
