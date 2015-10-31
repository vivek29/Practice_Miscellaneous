package algorithms.implementation;

import java.util.Scanner;

public class SherlockandSquares {

	public static void main(String[] args) {
        
		Scanner in = new Scanner(System.in);
        int t,low,high,low_sqrt,high_sqrt;
        t = in.nextInt();
        
        for(int i=0;i<t;i++) {
        	
        	int squares = 0;
        	low = in.nextInt();						
        	high = in.nextInt();					
        	low_sqrt = (int)Math.ceil(Math.sqrt(low));							// ceil - 4.1 --> 5
        	high_sqrt = (int)Math.floor(Math.sqrt(high));						// floor - 4.9 --> 4
        	
        	squares+=high_sqrt-low_sqrt+1;		// Count all integers found between the square roots given
        	
        	System.out.println(squares);
        }
    }	
}
