package datastructures.LinkedList;

import java.util.HashSet;

/* Write code to remove duplicates from an unsorted linked list.
How would you solve this problem if a temporary buffer is not allowed?	*/

public class RemoveDups {

	// Time - O(N), but takes extra space
	void deleteDuplicates(LinkedListNode head){
		
		HashSet<Integer> set = new HashSet<Integer>();
		LinkedListNode prev = null;
		
		while(head!=null){
			if(set.contains(head.data)){
				prev.next = head.next;
			} else {
				set.add(head.data);
				prev = head;
			}
			head = head.next;
		}
	}
		// Space - O(1), but Time-O(N2)
	void deleteDupsNoBuffer(LinkedListNode head){
		
		LinkedListNode current = head;
		while(current !=null){
			LinkedListNode runner = current;			
			while(runner.next!=null){
				if(runner.next.data==current.data){
					runner.next = runner.next.next;
				} else {
					runner = runner.next;
				}
			}
			current = current.next;
		}
	}
}
