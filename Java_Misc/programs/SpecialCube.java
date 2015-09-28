package com.practice.vivek;

// The super() construct as with this() construct: if used, must occur as the first statement in
// a constructor, and it can only be used in a constructor declaration. This implies that this()
// and super() calls cannot both occur in the same constructor. Just as the this() construct
// leads to chaining of constructors in the same class, the super() construct leads to chaining of
// subclass constructors to superclass constructors.
// if a constructor has neither a this() nor a super() construct as its first statement, then a
// super() call to the default constructor in the superclass is inserted.

class Cube1 {

	int length;
	int breadth;
	int height;
	public int getVolume() {
		return (length * breadth * height);
	}
	/*Cube1(){		// default constructor -- if used than no need to call super explicitly
				// but for non default constructor, you have to call the super explicitly 
	}	*/
	
	Cube1(int l, int b, int h) {
		length = l;
		breadth = b;
		height = h;
		System.out.println("Finished with Parameterized Constructor having 3 params of Cube");
	}
}

public class SpecialCube extends Cube1 {

	int weight;
	SpecialCube() {
		
		super(10, 20, 30); 	// Will Give a Compilation Error without this line

		weight = 10;
	}
	
	public static void main(String[] args) {
	
		SpecialCube specialObj1 = new SpecialCube();
		System.out.println("Volume of SpecialCube is : "+ specialObj1.getVolume());
	
	}
}