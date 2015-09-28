package com.practice.collection;
import java.util.*;
public class HashtableExample1 {

	public static void main(String[] args) {
		 
	    // Creating a Hashtable
	    Hashtable<Integer, String> hashtable = new Hashtable<Integer, String>();
	 
	    // Adding Key and Value pairs to Hashtable
	    hashtable.put(11,"AA");
	    hashtable.put(22,"BB");
	    hashtable.put(33,"CC");
	    hashtable.put(44,"DD");
	    hashtable.put(55,"EE");
	 
	    //Before remove
	    System.out.println("Hashtable contains:" + hashtable);
	 
	    // Removing key-value pairs for key 44
	    Object removedValue = hashtable.remove(44);
	 
	    //After remove
	    System.out.println("After remove:");
	    System.out.println("Hashtable Key-value pairs: " + hashtable);
	 }
}
