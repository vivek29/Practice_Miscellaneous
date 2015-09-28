package com.practice.vivek;

public class composition2 {

	private String name;
	
	private composition3 birthday;			// reference to object of class composition3
	
	public composition2(String theName,composition3 theDate){		// in parameters one is String
																	// while the other is reference		
		name = theName;
		birthday = theDate;
		
	}
	
	public String toString(){
											//use of in-built java method - String.format
		return String.format("My name is %s,birthday is on %s", name, birthday);
		
	}
	
	
}
