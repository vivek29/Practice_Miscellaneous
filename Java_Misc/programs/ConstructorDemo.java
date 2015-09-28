package com.practice.vivek;

// A java constructor has the same name as the name of the class to which it belongs.
// Constructor’s syntax does not include a return type, since constructors never return a value.

// Constructors may include parameters of various types. When the constructor is invoked using
// the new operator, the types must match those that are specified in the constructor definition.

// Java provides a default constructor which takes no arguments and performs no special actions or
// initializations, when no explicit constructors are provided.

// The only action taken by the implicit default constructor is to call the superclass
// constructor using the super() call. Constructor arguments provide you with a way to provide
// parameters for the initialization of an object.

public class ConstructorDemo {

		int length;
		int breadth;
		int height;
		public int getVolume() {
			return (length * breadth * height);
		}
		ConstructorDemo() {
			length = 10;
			breadth = 10;
			height = 10;
		}
		ConstructorDemo(int l, int b, int h) {
			length = l;
			breadth = b;
			height = h;
		}
		public static void main(String[] args) {

			ConstructorDemo	obj1 = new ConstructorDemo();
			ConstructorDemo obj2 = new ConstructorDemo(10, 20, 30);
			System.out.println("Volume of Cube1 is : " + obj1.getVolume());
			System.out.println("Volume of Cube1 is : " + obj2.getVolume());
		}
	}

