package com.practice.vivek;

public class composition3 {

	private int month;
	private int day;
	private int year;
	
	public composition3(int m, int d, int y){		//constructor
		
		month=m;
		day=d;
		year=y;
		
		System.out.printf("The constructor for this is %s\n",this);	  // here, this is a reference
	}																  // to whatever object we just
												// built, whenever we call this class

	public String toString(){
		return String.format("%d/%d/%d",month,day,year);			// it describes the format
																	// like here M/D/Y
	}
	
}
