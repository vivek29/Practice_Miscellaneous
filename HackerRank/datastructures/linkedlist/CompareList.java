package datastructures.linkedlist;

public class CompareList {

	int CompareLists(Node headA, Node headB) {

		while ((headA != null) && (headB != null)) {
			if (headA.data == headB.data) {
				headA = headA.next;
				headB = headB.next;
			} else {
				break;
			}
		}
		if((headA == null) && (headB == null))
			return 1;
		else{
			return 0;
		} 
	}

}
