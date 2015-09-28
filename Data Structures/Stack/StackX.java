package com.practice.Stack;
				// push, pop, peek  -- 3 operations

public class StackX {

	private int maxSize; 
	private long[] stackArray;
	private int top; 
	
	public StackX(int s) {
		maxSize = s; // set array size
		stackArray = new long[maxSize]; // create array
		top = -1; // no items yet
	}

	public void push(long j){
		stackArray[++top] = j;			// increment first than insert
	}
	
	public long pop(){
		return stackArray[top--];		// access item first than decrement top
	}
	
	public long peek(){
		return stackArray[top];			// peek returns the top item	
	}
	
	public boolean isEmpty(){
		return (top==-1);
	}

	public boolean isFull(){
		return (top==maxSize-1);
	}
}

class StackXMain {
	
	public static void main(String[] args) {
		StackX theStack = new StackX(3); // make new stack
		try{
		if(!theStack.isFull()) {
			theStack.push(20); // push items onto stack
			theStack.push(40);
			theStack.push(60);
			theStack.push(80);
		}
		
		while( !theStack.isEmpty() ) {
			long value = theStack.pop();
			System.out.print(value); // display it
			System.out.print(" ");
		} 
		System.out.println("");
		}
		
		catch(Exception e){
			System.out.print(e);
		}
	} 
}