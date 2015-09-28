package com.practice.vivek;
import java.util.*;

public class exc {

	public static void main(String ar[]){
		
		Scanner obj = new Scanner(System.in);

		int x=1;
		
	do{
		try{											// code comes in try
			
			System.out.println("Enter 1st no: ");
			int n1 = obj.nextInt();
			
			System.out.println("Enter 2nd no: ");
			int n2 = obj.nextInt();
			
			int div = n1/n2;							// this is where the exception occurs 
									// throws the exception to catch..by default
			System.out.println(div);
		
			x=2;	// if there comes an exception, this won't execute..
		}
		
		catch(Exception e){					// the Exception class object catches the exception
			
			System.out.println("You cann't do that..!!!");	
			System.out.println(e.getMessage());			// displays-- / by zero
		}
}	while(x==1);	
		
	}
	
	
}
