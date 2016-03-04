package algorithms.implementation;

import java.util.Scanner;

public class TaumAndBday {

  	 public static void main(String[] args) {
	
		 Scanner in = new Scanner(System.in);
	     int t = in.nextInt();
	  	 
	  	 long B,W,X,Y,Z;
	  	 
	  	 for(int i=0;i<t;i++){
	  		 
	  		 B = in.nextInt();
	  		 W = in.nextInt();
	  		 X = in.nextInt();
	  		 Y = in.nextInt();
	  		 Z = in.nextInt();
	  		 
	  		 System.out.println(B*Math.min(X, Y+Z) + W*Math.min(Y, X+Z)); 		 
	  	 }
  	 }
}
