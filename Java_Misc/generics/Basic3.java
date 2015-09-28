package com.practice.generics;

public class Basic3<T> {

	public < T > void printArray( T[] inputArray )
	   {
			// Display array elements              
	         for ( T element : inputArray )
	         {        
	            System.out.print(element+ "\t");
	         }
	         System.out.println();
	    }
	
	 public static void main( String args[] )
	    {

		 Basic3<String> l = new Basic3<>();
				
		 	Integer[] intArray = { 1, 2, 3, 4, 5 };
	        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
	        Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };
		 
	        l.printArray(intArray);
	        l.printArray(doubleArray);
	        l.printArray(charArray);
	    
	    }
	
}
