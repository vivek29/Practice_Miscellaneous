 package com.practice.LinkedList;

public class LinkListInsertion {

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
		
	//	printList();
		Link fourth = new Link();
	//	insertFirst(fourth, 4);

//		insertAfter(head,2, 4);
		
		insertLast(head,fourth,4);
		printList(head);

	}

	public static void insertFirst(Link head,Link newLink, int data){
		
		newLink.data = data;
		newLink.next = head.next;
		head.next = newLink;
	}
			// the new node is inserted after the given node(prev)
	public static void insertAfter(Link head,int pos, int data){
		
		Link temp = head;
		int i=1;
		while(i<pos){
			temp=temp.next;
			i++;
		}
		Link newNode = new Link();
		newNode.data=data;
		newNode.next = temp.next;
		temp.next = newNode;
		
		/*newLink.data = data;
		newLink.next = prev.next;
		prev.next = newLink.next;*/
	}
	
	public static void insertLast(Link head, Link newLink, int data){
		
		Link temp=head;
		while(temp.next != null){
			temp = temp.next;
		}
		
		newLink.data = data;
		temp.next = newLink;
		newLink.next = null;
		
	}
}
