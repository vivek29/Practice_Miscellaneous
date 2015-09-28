package com.practice.vivek;

// == operator checks along with the reference i.e memory
// but equals only compares the content.

public class StringsDemo2 {

	public static void main(String[] args) {
		String str1 = "My name is bob";
		String str2 = "My name is bob";
		String str3 = "My name " + "is bob"; //Compile time expression
		String name = "bob";
		String str4 = "My name is " + name;
		String str5 = new String("My name is bob");

		System.out.println("str1 == str2 : " + (str1 == str2));
		System.out.println("str2 == str3 : " + (str2 == str3));
		System.out.println("str3 == str1 : " + (str3 == str1));
		System.out.println("str4 == str5 : " + (str4 == str5));
		System.out.println("str1 == str4 : " + (str1 == str4));
		System.out.println("str1 == str5 : " + (str1 == str5));
		
		System.out.println("str1.equals(str2) : " + str1.equals(str2));
		System.out.println("str2.equals(str3) : " + str2.equals(str3));
		System.out.println("str3.equals(str1) : " + str3.equals(str1));
		System.out.println("str4.equals(str5) : " + str4.equals(str5));
		System.out.println("str1.equals(str4) : " + str1.equals(str4));
		System.out.println("str1.equals(str5) : " + str1.equals(str5));

	}
}