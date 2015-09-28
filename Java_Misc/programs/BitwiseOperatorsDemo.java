package com.practice.vivek;
							//Operator Precedence starting with the highest is -> |, ^, &

public class BitwiseOperatorsDemo { 
	  public BitwiseOperatorsDemo() { 
	    int x = 0xFAEF; 	//1 1 1 1 1 0 1 0 1 1 1 0 1 1 1 1 
	    int y = 0xF8E9; 	//1 1 1 1 1 0 0 0 1 1 1 0 1 0 0 1 
	    
	    
	    System.out.println("x & y : " + (x & y)); 			// And
	    System.out.println("x | y : " + (x | y)); 			// Or
	    System.out.println("x ^ y : " + (x ^ y)); 			// Exclusive Or
	    System.out.println("~x : " + (~x)); 				// Complement
	    System.out.println("x << y : " + (x << y)); 		// Left shift
	    System.out.println("x >> y : " + (x >> y));			// signed right shift
	    System.out.println("x >>> y : " + (x >>> y)); 		// unsigned right shift
	    //There is no unsigned left shift operator
	    } 

	  public static void main(String args[]) {
	     new BitwiseOperatorsDemo(); 

	   }
}