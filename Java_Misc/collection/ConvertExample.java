package com.practice.collection;
	import java.util.*;

	public class ConvertExample {
	 public static void main(String[] args) {
	    LinkedList<String> linkedlist = new LinkedList<String>();
	    linkedlist.add("Harry");
	    linkedlist.add("Jack");
	    linkedlist.add("Tim");
	    linkedlist.add("Rick");
	    linkedlist.add("Rock");

	    ArrayList<String> list = new ArrayList<String>(linkedlist);		
	    							// ArrayList l= new ArrayList(Collection c);
	    // OR List<String> l = new ArrayList<String>(linkedlist);
	    // ie here List can also be used instead of ArrayList
	    
	    
	    for (String str : list){
	      System.out.println(str);
	    }
	 }
	}

