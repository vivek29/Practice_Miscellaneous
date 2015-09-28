package com.practice.vivek;

public class TernaryOperatorDemo2 {

	/*
	 * The following programs shows that when no explicit parenthesis is used then the
	 conditional operator
	 * evaluation is from right to left
	 */


		static String m1(boolean b) {
			return b ? "T" : "F";
		}
		
		public static void main(String[] args) {
			boolean t1 = false ? false : true ? false : true ? false : true;		// F
			
			boolean t2 = false ? false
					: (true ? false : (true ? false : true));						// F
			
			boolean t3 = ((false ? false : true) ? false : true) ? false			// T
					: true;
			
			System.out.println(m1(t1) + m1(t2) + m1(t3));
		
		}
	}
	
