package com.practice.vivek;

public class polyargmain {

	public static void main(String ar[]){
		
		polyarg1 object = new polyarg1();			// 1st class object
		
		
		polyarg2 pa3 = new polyarg2();				// object of 2nd class
		
		polyarg2 pa4 = new polyarg3();				// 3rd class object through the base class
													// ie derived class through base class
		
		polyarg2 pa5 = new polyarg4();				// 4th class object through the base class
													// ie derived class through base class
		
		object.digest(pa3);						// the digest method takes an object as parameter
											
		object.digest(pa4);
		
		object.digest(pa5);
	
	}
	
	
}
