 package datastructures.linkedlist;

public class GetNode {

	int GetNode(Node head,int n) {

		int index = 0;
		Node current = head;
		Node result = head;
		while(current!=null) {
			current=current.next;
			if (index++>n) {
				result=result.next;
			}
		}
		return result.data;
	}
	
//  so we have two pointers. one is a iteration pointer and the other will be behind it
//	by requested number of elements. so for example lets say we need to get value of 
//	3rd element from tail. we start incrementing second pointer after 3rd element 
//	alongside with iteration pointer. When iteration pointer gets to the end(tail) 
//	second pointer is going to be pointing to 3rd element from it. which is the answer.	
	
}
