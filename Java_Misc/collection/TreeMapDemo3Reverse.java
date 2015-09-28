package com.practice.collection;
import java.util.*;

class TreeMapDemo3Reverse {
  public static void main(String args[]) {
 
    TreeMap<String, String> treemap = 
      new TreeMap<String, String>(Collections.reverseOrder());		// calling method
    							
/*	   public static Comparator reverseOrder(): Returns a comparator that imposes the reverse
       of the natural ordering on a collection of objects that implement the Comparable interface.
       (The natural ordering is the ordering imposed by the objects’ own compareTo method.)
       This enables a simple idiom for sorting (or maintaining) collections (or arrays) of objects
       that implement the Comparable interface in reverse-natural-order.
       For example, suppose a is an array of strings. 
       Then: Arrays.sort(a, Collections.reverseOrder()); sorts the array in reverse-lexicographic
       (alphabetical) order. The returned comparator is serializable.

Returns:
A comparator that imposes the reverse of the natural ordering on a collection of objects that
implement the Comparable interface.    							 
    							 */

    // Put elements to the map
    treemap.put("Key1", "Jack");
    treemap.put("Key2", "Rick");
    treemap.put("Key3", "Kate");
    treemap.put("Key4", "Tom");
    treemap.put("Key5", "Steve");
 
    Set set = treemap.entrySet();
    Iterator i = set.iterator();
    // Display elements
    while(i.hasNext()) {
      Map.Entry me = (Map.Entry)i.next();
      System.out.print(me.getKey() + ": ");
      System.out.println(me.getValue());
    }
  }
}