package com.practice.vivek;

public class variablearguments {
												// No of variable arguments are nt fixed
public static void main(String ar[]){
	
	System.out.println(average(23,77,89,45,33,67,67,55,33,5,77,85,44));  // here, the arguments 
																		//	can vary.
	
}
	
	public static int average(int... numbers)		// use ...(3 dots) to take variable arguments
	{
		int t=0;
	for(int b: numbers)
		t+=b;
		
		return t/numbers.length;
	
}	
	
	
}
