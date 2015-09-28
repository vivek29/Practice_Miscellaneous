package com.practice.collection;
import java.util.*;

public class HashMapDemo {

   public static void main(String args[]) {
   
	   		// Create a hash map
      HashMap hm = new HashMap();
      								// Put elements to the map
      hm.put("Zara", 50);
      hm.put("Mahnaz", 100);
      hm.put("M", 150);
      hm.put("P", 200);
      hm.put("K", 250);
      hm.put("O", 300);     
   
      /* if for using double values -- add double values
      
       // Put elements to the map
      hm.put("Zara", new Double(3434.34));
      hm.put("Mahnaz", new Double(123.22));
      hm.put("Ayan", new Double(1378.00));
      hm.put("Daisy", new Double(99.22));
      hm.put("Qadir", new Double(-19.08));
      
      */
      
      // Get a set of the entries
      		Set set = hm.entrySet();
      // Get an iterator
      		Iterator i = set.iterator();
      // Display elements
      			while(i.hasNext()) {
      			Map.Entry me = (Map.Entry)i.next();
      			System.out.print(me.getKey() + ": ");
      			System.out.println(me.getValue());
      			}
      System.out.println();
      // Deposit 1000 into Zara's account
         
      int bal = ((Integer)hm.get("Zara"));
      hm.put("Zara", bal+1000);
      System.out.println("Zara's new balance: " +hm.get("Zara"));
      
      
      /* if using for double values -- 
      
    	double balance = ((Double)hm.get("Zara")).doubleValue();
    	hm.put("Zara", new Double(balance + 1000));
  		System.out.println("Zara's new balance: " +hm.get("Zara"));
 */ 
   
   }
}