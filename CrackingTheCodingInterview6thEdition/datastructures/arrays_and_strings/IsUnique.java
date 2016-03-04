package datastructures.arrays_and_strings;

/* Implement an algorithm to determine if a string has all unique characters. What
if you cannot use additional data structures?	*/

// Assume ASCII String - 128 chars

public class IsUnique {

	private static boolean isUniqueChars(String str) {

		int length = str.length();
		if(length>128)
			return false;

		boolean[] char_set = new boolean[128];

		for(int i=0;i<length;i++){

			int val = str.charAt(i);
			if(char_set[val])
				return false;
			char_set[val] = true;
		}
		return true;
	}

	public static void main(String a[]){

		String str = "abcdef123456@#!";
		System.out.println(isUniqueChars(str));
	}

}
