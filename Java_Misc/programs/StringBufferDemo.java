package com.practice.vivek;

// StringBuffer class is a mutable class unlike the String class which is immutable. Both the
// capacity and character string of a StringBuffer Class. StringBuffer can be changed
// dynamically. String buffers are preferred when heavy modification of character strings is
// involved (appending, inserting, deleting, modifying etc).

// Strings can be obtained from string buffers. Since the StringBuffer class does not override
// the equals() method from the Object class, contents of string buffers should be converted to
// String objects for string comparison.

// A StringIndexOutOfBoundsException is thrown if an index is not valid when using wrong index
// in String Buffer manipulations

public class StringBufferDemo {

	public static void main(String[] args) {
		//    	Examples of Creation of Strings
		
		StringBuffer strBuf1 = new StringBuffer("Bobiouu");
		StringBuffer strBuf2 = new StringBuffer(100); 		// With capacity 100
		StringBuffer strBuf3 = new StringBuffer(); 			// Default Capacity 16
		System.out.println("strBuf1 : " + strBuf1);
		
		System.out.println("strBuf2 capacity : " + strBuf1.capacity());
		System.out.println("strBuf2 capacity : " + strBuf2.capacity());
		System.out.println("strBuf3 capacity : " + strBuf3.capacity());
	
	}
}

