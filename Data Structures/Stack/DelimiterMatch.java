package com.practice.Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

		// use class Stack from Reverse class

public class DelimiterMatch {

	private String input; // input string
	public DelimiterMatch(String in) {
		input = in; 
	}
	
	public void check() {
		int stackSize = input.length(); // get max stack size
		Stack theStack = new Stack(stackSize); // make stack
		for(int j=0; j<input.length(); j++) {
			char ch = input.charAt(j); // get char
			switch(ch) {
				case '{': // opening symbols
				case '[':
				case '(':
					theStack.push(ch); // push them
				break;
				
				case '}': // closing symbols
				case ']':
				case ')':
					if( !theStack.isEmpty() ) // if stack not empty,
					{
						char chx = theStack.pop(); // pop and check
						if( (ch=='}' && chx!='{') || (ch==']' && chx!='[') || (ch==')' && chx!='(') ){
							System.out.println("Error: "+ch+" at "+j);
						}						
					}
					else // prematurely empty
					System.out.println("Error: "+ch+" at "+j);
				break;
				default: // no action on other characters
				break;
			} // end switch
		} // end for

		// at this point, all characters have been processed
		if( !theStack.isEmpty() )
		System.out.println("Error: missing right delimiter");
		else
			System.out.println("Correct string..");
	}
}

class DelimiterMatchMain {
	
	public static void main(String[] args) throws IOException {
		String input;
		while(true)	{
			System.out.print("Enter string containing delimiters: ");
			System.out.flush();
			input = getString(); 
			if( input.equals("") )
				break;
			
			DelimiterMatch theChecker = new DelimiterMatch(input);
			theChecker.check(); // check brackets
		} // end while
	} // end main()

	public static String getString() throws IOException	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String s = br.readLine();
		return s;
	}
}