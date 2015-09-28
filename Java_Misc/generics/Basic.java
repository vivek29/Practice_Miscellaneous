package com.practice.generics;
import java.util.*;
public class Basic {

	public static void main(String ar[]){
		
		List<String> l = new ArrayList<String>();
		//  List<String> l = new ArrayList<>(); -- better // type inference
		
		List <Integer> l1 = new ArrayList<>();
		
		l.add("hello");
	//	l.add(5);				-- Compile time Error -- Type Safety
		
		l1.add(4);
		
		String s = l.get(0);			// no casting req here
		Integer s1 = l1.get(0);			// no cast
		
		System.out.println(s);
		System.out.println(s1);
		
	}
	
}
