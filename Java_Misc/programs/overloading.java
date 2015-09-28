package com.practice.vivek;
								// OVERLOADING(in JAVA) or Function Overloading(in C++)
public class overloading {

	 overloading(){				// no return type for constructors
		System.out.println("This is default constructor");
	}
	
	 overloading(int a){
		System.out.println(a);
	}
	
	overloading(int a,int b){
		System.out.println(a + "\t"+ b);
	}
	overloading(int a,int b,int c){
		System.out.println(a+"\t"+ b + "\t"+c);
	}
	
	public static void main(String ar[]){	
		overloading obj = new overloading();   // here as the object gets initialized
											   // the default constructor is called
		overloading obj1 = new overloading(5);
		overloading obj2 = new overloading(6,7);
		overloading obj3 = new overloading(5,8,9);
		
	}
}
