package datastructures.linkedlist;

public class DetectCycle {

					// Floyd's cycle-finding algo. -- 
/*	The hare moves twice as quickly as the tortoise and
    the distance between them increases by 1 at each step.
    Eventually they will both be inside the cycle and then,
    at some point, if there's a loop, they will meet in the loop.
*/
	
	int HasCycle(Node head) {
		if(head == null || head.next == null)
			return 0;
		Node hare = head;
		Node tortoise = head;
		while(hare.next != null && hare.next.next != null) {
			hare = hare.next.next;
			tortoise = tortoise.next;
			if(hare == tortoise)
				return 1;
		}
		return 0;
	}
}
