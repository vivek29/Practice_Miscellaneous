package algorithms.implementation;

import java.util.Scanner;
import java.math.*;

public class Encryption {

	public static void main(String[] args){
	
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		
		int input_length = input.length();
		int rows, columns;
		
		rows = (int) Math.floor(Math.sqrt(input_length));				//ex-  3.7 --> 3
		columns = (int) Math.ceil(Math.sqrt(input_length));				// 3.7 --> 4
	
																	// haveainc
		
	}
}