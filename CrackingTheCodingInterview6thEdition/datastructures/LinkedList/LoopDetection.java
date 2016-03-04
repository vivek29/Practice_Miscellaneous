package datastructures.LinkedList;

/* Given a circular linked list, implement an algorithm which returns the node at the
beginning of the loop.	*/
public class LoopDetection {

	LinkedListNode findBeginningofLoop(LinkedListNode head) {
		LinkedListNode fast = head;
		LinkedListNode slow = head;
		// Find meeting point, which will be Loop_Size - K steps into the linked list
		while(fast.next != null && fast.next.next != null) {
			fast = fast.next.next;
			slow = slow.next;
			if(fast == slow)		// Collision
				break;
		}
		// Error Check - no meeting point, therefore no loop
		if(head == null || head.next == null)
			return head;
		
		// Move slow to head, keep fast at meeting point. Each are k steps from the Loop Start
		// If they move at same pace, they must meet at loop start.
		
		slow = head;
		while(slow!=fast){
			slow = slow.next;
			fast = fast.next;					
		}
		// Both now point to the start of loop
		return fast;
	}
	
}
