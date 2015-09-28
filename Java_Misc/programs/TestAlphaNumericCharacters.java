package com.practice.vivek;

public class TestAlphaNumericCharacters {

	private void isAlphaNumeric(final String input) {
		boolean isCharFlag = false;
		boolean isNumberFlag = false;
		
		final char[] chars = input.toCharArray();
		
		for (int x = 0; x < chars.length; x++) {
			char c = chars[x];
			//            	 lowercase && uppercase alphabet
			if ((c >= 'a') && (c <= 'z') || (c >= 'A') && (c <= 'Z')) {
				isCharFlag = true;
				continue;
			}
			if ((c >= '0') && (c <= '9')) { // numeric
				isNumberFlag = true;
				continue;
			}
		}
		
		System.out.println("characters are present:" + isCharFlag);
		System.out.println("Numbers are present :" + isNumberFlag);
	}
	
	public static void main(String[] args) {
	
		TestAlphaNumericCharacters tANC = new TestAlphaNumericCharacters();
		tANC.isAlphaNumeric("beginn3ers");
	}
}
