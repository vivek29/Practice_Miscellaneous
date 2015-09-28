package com.practice.Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Stack {

	private int maxSize; 
	private char[] stackArray;
	private int top; 
	
	public Stack(int s) {
		maxSize = s; // set array size
		stackArray = new char[maxSize]; // create array
		top = -1; // no items yet
	}

	public void push(char j){
		stackArray[++top] = j;			// increment first than insert
	}
	
	public char pop(){
		return stackArray[top--];		// access item first than decrement top
	}
	
	public char peek(){
		return stackArray[top];			// peek returns the top item	
	}
	
	public boolean isEmpty(){
		return (top==-1);
	}
}

class Reverse {

	private String input; // input string
	private String output; // output string

	public Reverse(String in) {
		input = in; 
	}
	
	public String doRev() {
		int stackSize = input.length(); // get max stack size
		Stack theStack = new Stack(stackSize); // make stack
		for(int j=0; j<input.length(); j++)	{
			char ch = input.charAt(j); // get a char from input
			theStack.push(ch); // push it
		}
		output = "";
		while( !theStack.isEmpty() ) {
			char ch = theStack.pop(); // pop a char,
			output = output + ch; // append to output
		}
		return output;
	}	
}


class ReverseMain {
	
	public static void main(String[] args) throws IOException{
	
		String input, output;
		while(true)	{
			System.out.print("Enter a string: ");
			System.out.flush();
			input = getString(); // read a string from kbd
			if( input.equals("") ) // quit if [Enter]
			break;
			// make a Reverser
			Reverse theReverser = new Reverse(input);
			output = theReverser.doRev(); // use it
			System.out.println("Reversed: " + output);
		}
	}
		public static String getString() throws IOException {
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			String s = br.readLine();
			return s;
		}	
}