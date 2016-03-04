package datastructures.LinkedList;

/* Implement an algorithm to delete a node in the middle of a singly linked list, given
only access to that node.	*/

// Just copy the data from the next node to he current node and delete the next node

public class DeleteMiddleNode {

	boolean deleteNode(LinkedListNode n){
		if(n==null || n.next==null)
			return false;
		LinkedListNode next = n.next;
		n.data = next.data;
		n.next = next.next;
		next.next=null;		// make next node point to null 
		return true;
	}
	
}
