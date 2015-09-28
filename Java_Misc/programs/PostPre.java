package com.practice.vivek;

public class PostPre {

	public static void main(String ar[]){
		
		int a=1;
		
		int b= a++;				// first assign than increment so b=1 and a=2
		
		System.out.println(" "+a);			// 2
	
		System.out.println(" "+b);			// 1
		
		System.out.println(a++);			// 2
		System.out.println(++a);			// 4
		
		System.out.println(b++);			// 1
		System.out.println(++b);			// 3
	}
	
}
