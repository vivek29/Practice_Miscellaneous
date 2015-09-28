package com.practice.vivek;

public class LogicalOperatorsDemo {

	public LogicalOperatorsDemo() {
		boolean x = true;
		boolean y = false;
		System.out.println("x & y : " + (x & y));			// And
		System.out.println("x && y : " + (x && y));			// Conditional And
		System.out.println("x | y : " + (x | y));			// Or
		System.out.println("x || y: " + (x || y));			// Conditional Or
		System.out.println("x ^ y : " + (x ^ y));			// Exclusive Or
		System.out.println("!x : " + (!x));					// Not
	}
	public static void main(String args[]) {
		new LogicalOperatorsDemo();
	}
}
