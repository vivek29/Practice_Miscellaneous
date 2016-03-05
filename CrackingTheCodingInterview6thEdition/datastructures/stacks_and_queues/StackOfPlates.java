package datastructures.stacks_and_queues;

import java.util.*;

/* Imagine a (literal) stack of plates. If the stack gets too high, it migh t topple. Therefore,
in real life, we would likely start a new stack when the previous stack exceeds some
threshold. Implement a data structure SetOfStacks that mimics this. SetOf-
Stacks should be composed of several stacks and should create a new stack once
the previous one exceeds capacity. SetOfStacks.push() and SetOfStacks.
pop () should behave identically to a single stack (that is, pop () should return the
same values as it would if there were just a single stack).		*/

public class StackOfPlates {

	ArrayList<Stack> stacks = new ArrayList<Stack>();	
	public int capacity;

	public StackOfPlates(int capacity){
		this.capacity = capacity;
	}

	public void push(int value){
		Stack last = getLastStack();
		if(last!=null && !last.isFull()){
			last.push(value);
		}
		else{				// must create a new stack
			Stack stack = new Stack(capacity);
			stack.push(value);
			stacks.add(stack);
		}
	}
	
	int pop(){
		Stack last = getLastStack();
		if(last==null)
			throw new EmptyStackException();
		int value = last.pop();
		if(last.top==-1)
			stacks.remove(stacks.size()-1);
		return value;
	}

	private Stack getLastStack() {
		if(stacks.size()==0)
			return null;
		return stacks.get(stacks.size()-1);
	}

}

class Stack {

	private int capacity; 
	private int[] stackArray;
	public int top;

	public Stack(int s) {
		capacity = s; // set array size
		stackArray = new int[capacity]; // create array
		top = -1; // no items yet
	}

	public void push(int j){
		stackArray[++top] = j;			// increment first than insert
	}

	public int pop(){
		return stackArray[top--];		// access item first than decrement top
	}

	public int peek(){
		return stackArray[top];			// peek returns the top item
	}

	public boolean isEmpty(){
		return (top==-1);
	}

	public boolean isFull(){
		return (top==capacity-1);
	}

}
