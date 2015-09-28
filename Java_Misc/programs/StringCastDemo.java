package com.practice.vivek;

// One common casting that is performed when dealing with collections is, you can cast an
// object reference into a String, Integer etc

import java.util.*;

public class StringCastDemo {

	public static void main(String args[]) {
		String username = "asdf";
		String password = "qwer";
		int other = 10;
		
		Vector v = new Vector();
		v.add(username);
		v.add(password);
		v.add(other);
		
		//  String u = v.elementAt(0); Cannot convert from object to String
		
		Object u = v.elementAt(0); 		// Cast not done -- using Object class reference
		Object u1 = v.elementAt(2);			// using Object class reference
		System.out.println("Username : " + u);
		System.out.println("Number : " + u1);
		
		String uname = (String) v.elementAt(0); // cast allowed -- get specified element
		String pass = (String) v.elementAt(1); // cast allowed -- get specified element
		String pass1 = v.toString();			// gets the whole vector list

		Integer num = (Integer) v.elementAt(2); // cast allowed -- get specified element
		
		System.out.println("Username : " + uname);
		System.out.println("Password : " + pass);
		System.out.println("List : " + pass1);
		System.out.println("Number : " + num);

	}
}
