package datastructures.linkedlist;

public class MergeTwoSortedLinkedList {

	Node MergeLists(Node headA, Node headB) {

		if((headA==null)&&(headB==null))
			return null;
		if((headA!=null)&&(headB==null))
			return headA;
		if((headA == null)&&(headB!=null))
			return headB;
		if(headA.data <= headB.data)
			headA.next = MergeLists(headA.next, headB);
		else if(headA.data > headB.data) {
			Node temp = headB;
			headB = headB.next;
			temp.next = headA;
			headA = temp;
			headA.next = MergeLists(headA.next, headB);
		}
		return headA;    

	}
}
