package com.practice.vivek;

class SingletonClass {

	private static SingletonClass singletonObject;
	/** A private Constructor prevents any other class from instantiating. */
	private SingletonClass() {
		//	 Optional Code
	}
	public static synchronized SingletonClass getSingletonObject() {
		if (singletonObject == null) {
			singletonObject = new SingletonClass();
		}
		return singletonObject;
	}
	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
}

public class SingletonObjectDemo {

	public static void main(String args[]) {
		//		SingletonClass obj = new SingletonClass();
             // Compilation error not allowed - bcoz constructor is made private
		
		SingletonClass obj = SingletonClass.getSingletonObject();
		
		System.out.println("Singleton object obtained");

	}
}

/*
4 steps - 

Step 1: Provide a default Private constructor

Step 2: Create a Method for getting the reference to the Singleton Object
	We write a public static getter or access method to get the instance of the Singleton
	Object at runtime. First time the object is created inside this method as it is null.
	Subsequent calls to this method returns the same object created as the object is globally
	declared (private) and the hence the same referenced object is returned.

Step 3: Make the Access method Synchronized to prevent Thread Problems.
	It could happen that the access method may be called twice from 2 different classes at the
	same time and hence more than one object being created. This could violate the design
	pattern principle. In order to prevent the simultaneous invocation of the getter method
	by 2 threads or classes simultaneously we add the synchronized keyword to the method
	declaration.

Step 4: Override the Object clone method to prevent cloning
	We can still be able to create a copy of the Object by cloning it using the Object’s clone
	method. This can be done as shown below -

	SingletonObjectDemo clonedObject = (SingletonObjectDemo) obj.clone();

This again violates the Singleton Design Pattern’s objective. So to deal with this we need to
override the Object’s clone method which throws a CloneNotSupportedException exception.

	public Object clone() throws CloneNotSupportedException {
	throw new CloneNotSupportedException();
	}

In Summary, the job of the Singleton class is to enforce the existence of a maximum of one
object of the same type at any given time. Depending on your implementation, your class and
all of its data might be garbage collected. Hence we must ensure that at any point there must
be a live reference to the class when the application is running.


*/