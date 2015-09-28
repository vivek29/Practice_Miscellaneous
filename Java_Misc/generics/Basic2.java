package com.practice.generics;

public class Basic2<T> {
	private T t;
	
	public void set(T t){
		
		this.t = t;
	}
	
	public T get(){
		return t;
	}
	
	public static void main(String a[]){
		
		Basic2<String> l = new Basic2<>();
		
		l.set("Hello");
		
		String s = l.get();		
		
		System.out.println(s);
		
	}
		
}
