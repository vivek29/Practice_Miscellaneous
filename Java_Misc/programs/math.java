package com.practice.vivek;
import java.util.Scanner;			
														// Math operators
public class math {

	public static void main(String ar[])
	{
		
		int a,b,c;
		
		a=15;
		b=3;
		c= a/b;						// divide
		System.out.println(c);
		
		c=a%b;						//	remainder
		System.out.println(c);
						
															// take from user
		double d,e,f,g=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first no");
		d=sc.nextDouble();								// here the method is nextDouble
		
		System.out.println("Enter second no");
		e=sc.nextDouble();
		
		System.out.println("Enter choice: 1.Add, 2. Multiply, 3. Divide, 4. Remainder 5. Subtract");
		f=sc.nextDouble();
		
		if(f==1)
			g=d+e;
		
		else if(f==2)
			g=d*e;
		
		else if(f==3)
			g=d/e;
		
		else if(f==4)
			g=d%e;
		
		else if(f==5)
			g=d-e;
		
		System.out.println("The answer is "+g);
			
		
		
		
		
		
		
		
		
	}
}
