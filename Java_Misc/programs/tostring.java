package com.practice.vivek;	
public class tostring
{											
				//The toString() method returns the string representation of the object.
				//If you print any object, java compiler internally invokes the toString() method
				//on the object. So overriding the toString() method, returns the desired output,
				//it can be the state of an object etc. depends on your implementation.
				//without explicitly using toString
	
	// Implementing toString method in java is done by overriding the Object’s toString method.
	// The java toString() method is used when we need a string representation of an object.
	// It is defined in Object class. This method can be overridden to customize the String
	// representation of the Object. Below is a program showing the use of the Object’s Default
	// toString java method.
	
/*	 int rollno;  
	 String name;  
	 String city;  
	  
	 tostring(int rollno, String name, String city){  
	 this.rollno=rollno;  
	 this.name=name;  
	 this.city=city;  
	 }  
	  
	 public static void main(String args[]){  
	   tostring s1=new tostring(101,"Raj","lucknow");  
	   tostring s2=new tostring(102,"Vijay","ghaziabad");  
	     
	   System.out.println(s1);			//compiler writes here s1.toString()  
	   System.out.println(s2);			//compiler writes here s2.toString()
	   
							//printing s1 and s2 prints the hashcode values of the objects
	   						//but I want to print the values of these objects. Since java 
	   						//compiler internally calls toString() method, overriding this method
	   						//will return the specified values.
	   }
*/
// using toString	 
	 						//Implementing toString method in java is done by overriding the
							//Object’s toString method. The java toString() method is used when we
							//need a string representation of an object. It is defined in Object
							//class. This method can be overridden to customize the String
							//representation of the Object.
	 int rollno;  
	 String name;  
	 String city;  
	  
	 tostring(int rollno, String name, String city){  
	 this.rollno=rollno;  
	 this.name=name;  
	 this.city=city;  
	 }
	 
	 public String toString(){					//overriding the toString() method  
		  return rollno+" "+name+" "+city;  
		 }
	 
	 public static void main(String args[]){  
	   tostring s1=new tostring(101,"Raj","lucknow");  
	   tostring s2=new tostring(102,"Vijay","ghaziabad");  
	 
	   System.out.println(s1);					//compiler writes here s1.toString()  
	   System.out.println(s2);					//compiler writes here s2.toString()
	 
	 } 
}
