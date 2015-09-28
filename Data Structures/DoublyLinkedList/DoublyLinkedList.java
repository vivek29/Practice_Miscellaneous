package com.practice.DoublyLinkedList;

public class DoublyLinkedList {

	private Link first;
	private Link last;

	
	public DoublyLinkedList(){
		first = null;
		last = null;
	}
	
	public boolean isEmpty(){
		return first==null;
	}
	
	public void insertFirst(long data){
		
		Link newLink = new Link(data);
		
		if(isEmpty())
			last = newLink;
		else
			first.prev = newLink;
		newLink.next=first;
		first=newLink;
		
	}
	
	public void insertLast(long data){
		
		Link newLink = new Link(data);
		
		if(isEmpty())
			first = newLink;
		else{
			last.next = newLink;
			newLink.prev = last;
		}
		last = newLink;
	}
	
	public void deleteFirst(){
		
		Link temp = first;
		if(isEmpty())
			return;
		
		if(first.next == null)
			last=null;
		else
			first.next.prev = null;			
		first = first.next;			
	}
	
	public void deleteLast(){
		
		Link temp = first;
		if(isEmpty())
			return;
		
		if(first.next == null)
			first=null;
		else
			last.prev.next = null;
		last = last.prev;
	}
	
	public void insertAfter(long key, long data){
		
		if(isEmpty())
			insertFirst(data);
		
		Link current = first;
		
		while(current.data != key){
			current = current.next;
			if(current == null)			// if didn't find
				return;
		}
		
		Link newLink = new Link(data);
		
		if(current==last){
			newLink.next = null;
			last = newLink;
		}
		
		else{
			newLink.next = current.next;
			current.next.prev = newLink;
		}
		
		newLink.prev = current;
		current.next = newLink;
	}
	
	public void deleteKey(long key){
		
		if(isEmpty())
			return;
		
		Link current = first;
		
		while(current.data != key){
			current = current.next;
			if(current == null)			// if didn't find
				return;
		}
				
		if(current == first){
			first = current.next;
			current.next.prev = current.prev;
		}
		else if (current == last){
			last = current.prev;
			current.prev.next = current.next;
		}
		else {
			current.next.prev = current.prev;
			current.prev.next = current.next;
		}	
	}
	
	public void displayForward() {
		System.out.println("List (first-->last): ");
		
		Link current = first; // start at beginning
		while(current != null) {
			System.out.println(current.data);
			current = current.next; // move to next link
		}
		System.out.println("");
	}
	
	public void displayBackward() {
		System.out.println("List (last-->first): ");
		
		Link current = last; // start at beginning
		while(current != null) {
			System.out.println(current.data);
			current = current.prev; // move to next link
		}
		System.out.println("");
	}
	
	public static void main(String[] args) {
		
		DoublyLinkedList theList = new DoublyLinkedList();
		
		theList.insertFirst(10);
		theList.insertFirst(20);
		theList.insertFirst(30);
		
		theList.insertLast(40);
		theList.insertLast(50);
		theList.insertLast(60);
		
//		theList.displayForward();		// 30 20 10 40 50 60
//		theList.displayBackward();
		
		theList.deleteFirst();
		theList.deleteLast();
		
//		theList.displayForward();		// 20 10 40 50
		
		theList.insertAfter(10, 30);
		theList.displayForward();		// 20 10 30 40 50	
		
//		theList.deleteKey(20);
//		theList.deleteKey(40);
		theList.deleteKey(50);
		
		theList.displayForward();

		
	}

	
	
}
