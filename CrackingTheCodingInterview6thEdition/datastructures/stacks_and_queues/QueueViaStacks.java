package datastructures.stacks_and_queues;

/* Implement a queue using 2 stacks	*/

import java.util.Stack;

// stackOld has the oldest elements on the top, while stackNew has the new elements on top

public class QueueViaStacks {

	Stack<Integer> stackNew,stackOld;

	public QueueViaStacks(){
		stackNew = new Stack<Integer>();
		stackOld = new Stack<Integer>();
	}
	
	 public void add (int value){
		 // Push onto new Stack
		 stackNew.push(value);
	 }
	
	 public void shiftStacks(){
		 if(stackOld.isEmpty()){
			 while(!stackNew.isEmpty()){
				 stackOld.push(stackNew.pop());
			 }
		 }
	 }
	 
	 public int peek(){
		 shiftStacks();
		 return stackOld.peek();
	 }
	 
	 public int pop(){
		 shiftStacks();
		 return stackOld.pop();
	 }
	 
}
