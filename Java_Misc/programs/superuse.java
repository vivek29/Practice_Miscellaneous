package com.practice.vivek;

class vehicle {

	public void move () {
        System.out.println ("Vehicles are used for moving from one place to another ");
   }
}

class Car extends vehicle {
   public void move () {				// the super must be on 1st line
     super. move (); 					// invokes the super class method
     System.out.println ("Car is a good medium of transport ");
   }
}

public class superuse {
   public static void main (String args []){
       vehicle b = new Car (); 				// superuse reference but Car object
       b.move (); 								//Calls the method in Car class
   }
	
}
