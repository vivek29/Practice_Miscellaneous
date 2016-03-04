package datastructures.linkedlist;

public class RemoveDuplicatesSortedList {

	Node RemoveDuplicates(Node head) {
		Node temp1=head;
		while(temp1!=null){
			while(temp1.next!=null){
				if(temp1.data == temp1.next.data)
					temp1.next=temp1.next.next;
				else 
					break;
			}
			temp1 = temp1.next;
		}
		return head;
	}
}
						// Recursive Solution
/*
Node RemoveDuplicates(Node head) {
	  if ( head == null ) return null;
	  Node nextItem = head.next;
	  while ( nextItem != null && head.data == nextItem.data ) {
	    nextItem = nextItem.next;
	  }
	  head.next = RemoveDuplicates( nextItem );
	  return head;
	}
*/
