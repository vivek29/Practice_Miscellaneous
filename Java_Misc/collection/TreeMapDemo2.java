package com.practice.collection;
import java.util.TreeMap;
import java.util.Set;
import java.util.Iterator;
import java.util.Map;

	public class TreeMapDemo2 {

	   public static void main(String args[]) {

	      /* This is how to declare TreeMap */
	      TreeMap<String, String> tmap = 
	             new TreeMap<String, String>();

	      /*Adding elements to TreeMap*/
	      tmap.put("T", "Data1");
	      tmap.put("A", "Data2");
	      tmap.put("S", "Data3");
	      tmap.put("H", "Data4");
	      tmap.put("C", "Data5");

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
