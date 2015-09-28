package com.practice.vivek;

//  Classes Honda and Ford are Siblings in the class Hierarchy. Both these classes are subclasses
// of Class Car. Both Car and HeavyVehicle Class extend Object Class. Any class that does not
// explicitly extend some other class will automatically extends the Object by default. This
// code instantiates an object of the class Ford and assigns the object’s reference to a
// reference variable of type Car. This assignment is allowed as Car is a superclass of Ford.
// In order to use a reference of a class type to invoke a method, the method must be defined
// at or above that class in the class hierarchy. Hence an object of Class Car cannot invoke a
// method present in Class Ford, since the method fordMethod is not present in Class Car or any
// of its super classes. Hence this problem can be solved by a simple downcast by casting the Car
// object reference to the Ford Class Object reference as done in the program. Also an attempt
// to cast an object reference to its Sibling Object reference produces a ClassCastException at
// runtime, although compilation happens without any error.


class Car8 extends Object {

	void carMethod() {
		
		System.out.println("This is carMethod of class Car8");
	}
}


class HeavyVehicle extends Object {
}


class Ford extends Car8 {

	void fordMethod() {
		System.out.println("I am fordMethod defined in Class Ford");
	}
}


class Honda extends Car8 {

	void fordMethod() {
		System.out.println("I am fordMethod defined in Class Honda");
	}
}

public class ObjectCastingEx {

	public static void main(String[] args) {

		Car8 obj = new Ford();				// object reference for Ford
				
		Car8 obj1 = new Honda();			// object reference for Honda
		
		//    Following will result in compilation error
		//    obj.fordMethod();	
					//As the method fordMethod is undefined for the Car Type


		Ford fobj = new Ford();				// ford class object reference
		fobj.carMethod();			// can call superclass method using derived class object
									// i.e upcasting can be done
// Similarly, 
		Honda hobj = new Honda();
		hobj.carMethod();
							// but we cann't call a derived class method using an super class
							// object.. no downcast	than.
		
		//  Following will result in compilation error
		// ((HeavyVehicle)obj).fordMethod();
					//fordMethod is undefined in the HeavyVehicle Type
		  
		 ((Ford) obj).fordMethod();		// object of Ford
		 			// this will work as fordMethod is a method of class Ford
		
		 ((Honda) obj1).fordMethod();		// object of Honda
		 			// this will work as fordMethod is a method of class Honda

		 //	Honda hondaObj = (Ford)obj;
		 			// Cannot convert as they are siblings
	
	
	
	}
}
