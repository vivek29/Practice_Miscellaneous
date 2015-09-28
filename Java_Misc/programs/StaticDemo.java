package com.practice.vivek;


class Cube {

	static int a=5;								
	//static, so only a single instance of the associated variable is created common to all
	//the objects of that class. Hence when one object changes the value of a class variable, it 
	// affects all objects of the class. We can access a class variable by using the name of the
	//class, and not necessarily using a reference to an individual object within the class.
	//Static variables can be accessed even though no objects of that class exist.
	
	int b=10;	
	
	public static int test(){
		
		return a;
			// return b;       cann't compile bcoz b is a non static variable
							// and all members in a static method ust be static.
		//Class methods, similar to Class variables can be invoked without having an instance of
		//the class. Class methods are often used to provide global functions for Java programs.
		//For example, methods in the java.lang.Math package are class methods. You cannot call
		//non-static methods from inside a static method.
	}
	
}

public class StaticDemo extends Cube {

	public static void main(String args[]) {
	
	StaticDemo obj = new StaticDemo();
	StaticDemo obj1 = new StaticDemo();
	
	obj.a=15;
	obj1.a=25;
	
	obj.b=20;
	obj1.b=30;
	
	System.out.println("  " +a);			// called directly, without any object reference
	System.out.println("  " +StaticDemo.a); // called via the class name
	System.out.println("  " +obj.a);		// called via instance/object reference
	System.out.println("  " +obj1.a);		// called via object reference
	
	// BUT all the above prints the same value, since variable is static
	
	System.out.println("  " +obj.b);
	System.out.println("  " +obj1.b);
	
											// call a static method directly using class name
	System.out.println(StaticDemo.test());  // calling without any object reference
	
	}
}