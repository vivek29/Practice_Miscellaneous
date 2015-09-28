package com.practice.vivek;

public class multiarray {
	public static void main(String ar[]){
		
		int first[][]={{1,2,3,4},{5,6,7,8,9}};			// a[rows][columns]
/*													
		System.out.println(first[0][0]);
		System.out.println(first[0][1]);
		System.out.println(first[0][2]);
		System.out.println(first[0][3]);
		
		System.out.println(first[1][0]);
		System.out.println(first[1][1]);
		System.out.println(first[1][2]);
		System.out.println(first[1][3]);
		System.out.println(first[1][4]);
	*/	
														// calling a method with multi array as 
														// a parameter.
		int second[][]={{11,12,1,3},{4,5},{5,7,8,9,0}};
		
		System.out.println("This is 1st array");
		display(first);
	
		System.out.println("This is 2nd array");
		display(second);
		
	}

	public static void display(int b[][]){
			
		for(int row=0;row<b.length;row++){					// for row until array length
				
			for(int column=0;column<b[row].length;column++){   		// until row's array length
					
					System.out.print(b[row][column] + "\t");
					
				}
			
				System.out.println();
			}
			
			
		}

	

}
