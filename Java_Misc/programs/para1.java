package com.practice.vivek;
import java.util.*;
public class para1 {

	public static void main(String ar[]){
		
		Scanner input = new Scanner(System.in);
		para2 obj = new para2();
		
		System.out.println("Enter your name:");
		
		String name = input.nextLine();
		
		obj.hello(name);
		
	}
	
}
