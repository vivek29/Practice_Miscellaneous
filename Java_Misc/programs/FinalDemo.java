package com.practice.vivek;

public class FinalDemo {

	// In Java we can mark fields, methods and classes as final. Once marked as final, these items
	//cannot be changed.
	
	//Variables defined in an interface are implicitly final. You can’t change value of a final
	//variable (is a constant). A final class can’t be extended i.e., final class may not be
	//subclassed. This is done for security reasons with basic classes like String and Integer.
	//It also allows the compiler to make some optimizations, and makes thread safety a little
	//easier to achieve. A final method can’t be overridden when its class is inherited. Any 
	//attempt to override or hide a final method will result in a compiler error.
	
	final int a=10;
	int b=10;
	
	public static void main(String ar[]){
		
		FinalDemo obj = new FinalDemo();

		// obj.a=20;		-- gives a compile error, cann't change a final/constant variable
		obj.b=20;
		
		System.out.println(obj.a);
		System.out.println(obj.b);
		
	}
}
