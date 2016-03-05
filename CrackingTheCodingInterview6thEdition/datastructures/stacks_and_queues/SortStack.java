package datastructures.stacks_and_queues;

import java.util.Stack;

/* Sort a stack such that smallest items are on top. You can use a additional stack but not 
 any other data structure. 	*/

// Time - O(N^2) and Space - O(N)

public class SortStack {

	static Stack<Integer> sort(Stack<Integer> s1){
		
		Stack<Integer> s2 = new Stack<Integer>();
		
		while(!s1.isEmpty()){
			int temp = s1.pop();
			while(!s2.isEmpty() && s2.peek()<temp){
				s1.push(s2.pop());
			}
			s2.push(temp);
		}
		return s2;
	}
	
	public static void main(String args[]){
		
		Stack<Integer> s1 = new Stack<Integer>();
		s1.add(7);
		s1.add(10);
		s1.add(5);
		s1.add(12);
		s1.add(3);
		s1.add(1);
		s1.add(8);

		Stack<Integer> s2 = sort(s1);		
		while(!s2.isEmpty()){
			System.out.println(s2.pop());
		}
	}
}