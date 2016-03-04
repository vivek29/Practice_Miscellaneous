package datastructures.LinkedList;

/* Implement an algorithm to find the kth to last element of a singly linked list. */

public class KthElementToLast {
	
	// Time - O(N), Space - O(1)
	LinkedListNode kthTolast(LinkedListNode head, int k){
		
		LinkedListNode p1=head,p2=head;
		// Move p1 k nodes into the list
		for(int i=0;i<k;i++){
			if(p1==null)
				return null;			// out of bounds
			p1 = p1.next;
		}
		// Move them at same pace. When p1 hits the end, p2 points to kth element from last
		while(p1!=null){
			p1=p1.next;
			p2=p2.next;
		}
		return p2;
	}
}
