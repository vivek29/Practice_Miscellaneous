package datastructures.stacks_and_queues;

/* How would you design a stack which, in addition to push and pop, also has a
function min which returns the minimum element? Push, pop and min should all
operate in 0(1) time.	*/

// Use an additional stack which keeps the track of the min's.

import java.util.Stack;

public class StackMin extends Stack<Integer> {

	Stack<Integer> stack2;

	public StackMin() {
		stack2 = new Stack<Integer>();
	}
	
	public void push(int value){
		if(value<= min())
			stack2.push(value);
		super.push(value);
	}
	
	public Integer pop(){
		int value = super.pop();
		if(value == min())
			stack2.pop();
		return value;
	}
	
	public int min(){
		if(stack2.isEmpty())
			return Integer.MAX_VALUE;
		else
			return stack2.peek();	
	}	
}
