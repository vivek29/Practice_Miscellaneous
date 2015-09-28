package com.practice.vivek;
									// polymorphism - 1. method overloading 2. overriding
/*
 							Rules for Method Overloading

-- Overloading can take place in the same or in its sub-class.
-- Constructor in Java can be overloaded
-- Overloaded methods must have a different argument list.
-- Overloaded method should always be in part of the same class, with same name but different parameters.
-- The parameters may differ in their type or number, or in both.
-- They may have the same or different return types.
-- It is also known as compile time polymorphism.

							Rules for Method Overriding:

-- applies only to inherited methods
-- object type (NOT reference variable type) determines which overridden method will be used at runtime
-- Overriding methods must have the same return type
-- Overriding method must not have more restrictive access modifier
-- Abstract methods must be overridden
-- Static and final methods cannot be overridden
-- Constructors cannot be overridden
-- It is also known as Runtime polymorphism.

-- super keyword in Overriding:
When invoking a superclass version of an overridden method the super keyword is used.

 */

public class poly1 {

	void eat(){
		
		System.out.println("This is poly1 class eat method");
		
	}	
	
	public static void main(String ar[]){
		
		poly1 a[] = new poly1[3];
		
		a[0]= new poly1();
		a[1]= new poly2();
		a[2]= new poly3();
		
		for(int i=0;i<3;i++){
			
			a[i].eat();
			
		}
		
	}
	
}
