package com.practice.vivek;

interface democlass1{
	
	final int a=5;
	
	void test();			// default - public static

	String test1();			//  default - public static
}

interface democlass2 extends democlass1{
	
	int test2();			//  default - public static
}

class democlass3 implements democlass2{
	
	public void test(){}			// necessary to declare public
	
	public String test1(){			// necessary to declare public
		return("Hello");	
	}
	
	public int test2(){				// necessary to declare public
//	int a=10;				-- error, bcoz a is final, so cannt change
		return a;
	}
}

public class InterfaceDemo1 {

	public static void main(String sr[]){
		
		democlass3 obj = new democlass3();
		obj.test();								// no return -- blank

		System.out.println(obj.test1());		
		System.out.print(obj.test2());

	}
	
}
