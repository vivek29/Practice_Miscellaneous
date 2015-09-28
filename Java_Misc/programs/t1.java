package com.practice.vivek;

public class t1 {

	private String girlName;
	
	public String getName(){
		
		return girlName;
	}
	
	
	public void saying(){
		
		System.out.printf("First gf was %s\n",getName());
	}
	
	// for constructor
	
	public t1(String name){
		girlName=name;
		
	}
	
}
