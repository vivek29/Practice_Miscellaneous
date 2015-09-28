package com.practice.vivek;

class PointCoordinates1 {

	private int x, y;
	public PointCoordinates1(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}	
	
	// Custom toString() Method.

	public String toString() {
			return "X=" + x + " " + "Y=" + y;
		}
}

public class ToStringDemo1 {

	public static void main(String args[]) {
		PointCoordinates1 point = new PointCoordinates1(10, 10);

		// using the Default Object.toString() Method
		System.out.println(point);

		// implicitly call toString() on object as part of string concatenation
		String s = point + " testing";
		System.out.println(s);
	}
}
