package com.practice.vivek;

// It is possible to use this() construct, to implement local chaining of constructors in a class.
// The this() call in a constructor invokes the another constructor with the corresponding
// parameter list within the same class. Calling the default constructor to create a Cube object
// results in the second and third parameterized constructors being called as well.
// Java requires that any this() call must occur as the first statement in a constructor.

public class ConstructorDemo1 {

		int length;
		int breadth;
		int height;
		public int getVolume() {
			return (length * breadth * height);
		}
		ConstructorDemo1() {
			this(10, 10);				// begins the local chaining in constructors
										// it searches for constructor with 2 parameters
										// and jumps to it.
			System.out.println("Finished with Default Constructor");
		}
		ConstructorDemo1(int l, int b) {		// above call comes here
			this(l, b, 10);						// this further searches for constructor with
												// 3 parameters and jumps to that.
			System.out.println("Finished with Parameterized Constructor having 2 params");
		}
		ConstructorDemo1(int l, int b, int h) {	// above calls come here than
			length = l;
			breadth = b;
			height = h;
									// so this gets printed/executed first. 
			System.out.println("Finished with Parameterized Constructor having 3 params");
		}
		public static void main(String[] args) {
			
			ConstructorDemo1 obj1, obj2;
			obj1 = new ConstructorDemo1();	// calls default constructor (without any parameters)
			obj2 = new ConstructorDemo1(10, 20, 30);
			
			System.out.println("Volume of Cube1 is : " + obj1.getVolume());
			System.out.println("Volume of Cube2 is : " + obj2.getVolume());

		}
	}

