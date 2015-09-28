package com.practice.vivek;
									//	this class inherits in1
public class in2 extends in1 {

	public void eat(){				// has to be public, if private won't be able to override
		
		System.out.println("this is the eat method of in2 class");		// overriding method
															
			
										// overriding happens at rum time
		// overriding - same method name in diff class ie base class and derived class
				// of course inheritance is a must.
		
	}
}						// thus object at runtime decides which method to invoke
						// this is overriding.