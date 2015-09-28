package com.practice.collection;
import java.util.TreeMap;
import java.util.Set;
import java.util.Iterator;
import java.util.Map;

	public class TreeMapDemo1 {

	   public static void main(String args[]) {

	      /* This is how to declare TreeMap */
	      TreeMap tmap = new TreeMap();
	      // OR
	     // TreeMap<Integer,String> tmap = new TreeMap<Integer,String>()

	      /*Adding elements to TreeMap*/
	      tmap.put(66, "Data1");
	      tmap.put(4, "Data2");
	      tmap.put(42, "Data3");
	      tmap.put(71, "Data4");
	      tmap.put(44, "Data5");

	      /* Display content using Iterator*/
	      Set set = tmap.entrySet();
	      Iterator iterator = set.iterator();
	      while(iterator.hasNext()) {
	         Map.Entry mentry = (Map.Entry)iterator.next();
	         System.out.print("key is: "+ mentry.getKey() + " & Value is: ");
	         System.out.println(mentry.getValue());
	      }

	   }
	}
