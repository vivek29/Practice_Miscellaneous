package datastructures.linkedlist;

public class InsertNodeDoublyLinkedList {
 
	DoublyListNode SortedInsert(DoublyListNode head,int data) {

		DoublyListNode newDoublyListNode = new DoublyListNode();
		newDoublyListNode.data = data;
		newDoublyListNode.next = null;
		newDoublyListNode.prev = null;    

		// Handle empty list
		if(head==null){
			head = newDoublyListNode;
			return head;
		}

		DoublyListNode DoublyListNode = head;			// node
		DoublyListNode prev=null;

		// Handle newDoublyListNode being the new head
		if (data <= DoublyListNode.data) {
			newDoublyListNode.next = DoublyListNode;
			DoublyListNode.prev = newDoublyListNode;
			head = newDoublyListNode;
			return head;
		}

		while (DoublyListNode != null) {
			// Place the newDoublyListNode before the current
			// DoublyListNode if its data is less than the current DoublyListNode's data

			if (data <= DoublyListNode.data) {
				DoublyListNode.prev.next = newDoublyListNode;
				newDoublyListNode.prev = DoublyListNode.prev;
				newDoublyListNode.next = DoublyListNode;
				DoublyListNode.prev = newDoublyListNode;
				return head;
			}

			// Store the previous DoublyListNode in the case
			// the DoublyListNode should be placed last
			prev = DoublyListNode;
			DoublyListNode = DoublyListNode.next;
		}

		// Add the DoublyListNode to the end of the list
		DoublyListNode = prev;                            // bring DoublyListNode back to the last DoublyListNode
		DoublyListNode.next = newDoublyListNode;
		newDoublyListNode.prev = DoublyListNode;    
		return head;

	}

}
