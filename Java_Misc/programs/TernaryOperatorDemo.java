package com.practice.vivek;

public class TernaryOperatorDemo {

	public TernaryOperatorDemo() {
		int x = 10, y = 12, z = 0;
		z = x > y ? x : y;						// Condition ? true condition : false condition
		System.out.println("z : " + z);
	}
	public static void main(String args[]) {
		new TernaryOperatorDemo();
	}
}
