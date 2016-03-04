package datastructures.arrays_and_strings;

/* Given two strings, write a method to decide if one is a permutation of the other. */

// Assume that the comparison is case sensitive and whitespace is significant

public class CheckPermutation {

//		Solution 1 -- Sort the strings
	 
	private static boolean checkPermutation(String str1, String str2) {

		if(str1.length()!=str2.length())
			return false;

		return sort(str1).equals(sort(str2));
	}

	private static String sort(String str) {
		char[] content = str.toCharArray();
		java.util.Arrays.sort(content);		
		return new String(content);
	}

//		Solution 2 -- Check if the strings have identical character counts
	
	
	private static boolean checkPermutation1(String str1, String str2){

		if(str1.length()!=str2.length())
			return false;

		int[] letters = new int[128];		// default, all zero initialized
		
		char[] char_set = str1.toCharArray();
		for(char c : char_set){
			letters[c]++;				// keep the count of each character of str1
		}
		
		for(int i=0;i<str2.length();i++){		// compare the 2 arrays
			int c = str2.charAt(i);
			letters[c]--;
			if(letters[c]<0)
				return false;			
		}
		return true;
	}
	
	public static void main(String a[]){

		String str1 = "goD";		
		String str2 = "dog";

		System.out.println(checkPermutation(str1,str2));
		System.out.println(checkPermutation1(str1,str2));
	}
}
