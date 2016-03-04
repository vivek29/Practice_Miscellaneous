package datastructures.linkedlist;

public class PrintReverse {

	void ReversePrint(Node head) {

		if(head == null)
			;
		else{
			ReversePrint(head.next);
			System.out.println(head.data);
		}   
	}
}
