package com.practice.vivek;

public class setget1 {
	
	public static void main(String ar[]){
		
			setget obj = new setget();
			setget obj1 = new setget(6);
			setget obj2 = new setget(6,55);
			setget obj3 = new setget(6,55,44);
		
		
		System.out.printf("%s\n", obj.test());
		System.out.printf("%s\n", obj1.test());
		System.out.printf("%s\n", obj2.test());
		System.out.printf("%s\n", obj3.test());
		
		
		
	}
}
