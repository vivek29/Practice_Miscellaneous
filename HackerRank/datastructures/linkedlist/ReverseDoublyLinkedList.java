package datastructures.linkedlist;

public class ReverseDoublyLinkedList {

	// Recursive solution
/*	

	Node Reverse(Node head){

 	// If empty list, return
		if(head==null)
		return head;

	// Otherwise, swap the next and prev	
		Node temp = head.next; 	
		head.next = head.prev;
		head.prev = temp;	
	
	//  If the prev is now NULL, the list
  	//  has been fully reversed	
		
		if(head.prev==null){
			return head;
		}
		
		// Otherwise, keep going
		return Reverse(head.prev);	
	}
*/

	// get the tail node and swap the next and prev pointers while iterating backwards

	DoublyListNode Reverse(DoublyListNode head) {
		if (head == null) {
			return null;
		}
		DoublyListNode curr = head;
		DoublyListNode temp = null;

		while(curr.next !=null){
			curr = curr.next;
		}
		head = curr;
		while (curr != null) {      
			temp = curr.prev;
			curr.prev = curr.next;
			curr.next = temp;
			curr = curr.next;
		}
		return head;
	}

}
