package com.practice.LinkedList;

public class LinkListDeletion {

	public static void printList(Link head){
		
		Link n = head;
		
		while(n != null){
			System.out.println(n.data);
			n=n.next;
		}	
	}
	
	public static void main(String[] args) {
		Link head;
		Link first = new Link();
		Link second = new Link();
		Link third = new Link();

		head = first;
		
		first.data = 1;
		first.next = second;	
		second.data = 2;
		second.next = third;
		third.data = 3;
		third.next = null;
		
		printList(head);
		
		head = deleteFirst(head);
		
//		deleteEnd(head);
		
	//	deleteAfter(head, 2);			// Here, linked list start from pos 1 and not 0
		
		printList(head);
	
	}

	public static Link deleteFirst(Link head){
		
		Link temp = head;
		head = head.next;		// OR.. head = temp.next
		temp.next = null;
		return head;
	}
	
	
	public static void deleteEnd(Link head){
		
		Link temp1 = head,temp2 = null;
		
		while(temp1.next != null) {	
			temp2 = temp1;
			temp1 = temp1.next;
		}
		temp2.next = temp1.next;
	}
	
	public static void deleteAfter(Link head, int pos){

		int i=1;
		Link temp1 = head,temp2 = null;
		
		while(i<pos) {	
			temp2 = temp1;
			temp1 = temp1.next;
			i++;
		}
		
		temp2.next = temp1.next;
		temp1.next = null;
	}
}
