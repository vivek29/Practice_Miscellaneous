package com.practice.vivek;

public class enhancedfor {

	public static void main(String ar[]){
	
	int a[]={2,4,6,8,10};
			/*								// simple for loop to print array elements
	for(int i =0;i<a.length;i++){
		
		System.out.println(a[i]);
		
	}
	*/
											// enhanced for loop
						// it means take/read int values in array a
/*
	for (int b : a) {
	    System.out.println(b);
	}
	*/
							//	OR -- Add array values using enhanced for loop
	
	int t=0;
							// take elements from a
	for(int c: a){
		
		t+=c;				// t=t+c
	}
	
	System.out.println(t);

	}	
	
}
