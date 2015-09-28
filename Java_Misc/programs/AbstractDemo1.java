package com.practice.vivek;

abstract class demo1 {

	public String color;
	
	abstract void blank();
	abstract void test(String c);

}

abstract class demo2 extends demo1{
	
	abstract void test1(String c);
	
}

class demo3 extends demo2{
	
	void blank(){						// blank implementation
		}					
	
	void test(String c){
		System.out.println(" Test abstract method color: " +c);
	}
	
	void test1(String c){
		System.out.println(" Test1 abstract method color: " +c);
	}
}
class AbstractDemo1{
	
	public static void main(String ar[]){
	demo3 obj = new demo3();
	obj.test("Green");
	obj.test1("Red");
	
	}
}