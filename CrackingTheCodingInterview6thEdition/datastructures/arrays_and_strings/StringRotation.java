package datastructures.arrays_and_strings;

/* Assume you have a method isSubstring which checks if one word is a substring
of another. Given two strings, si and s2, write code to check Ifs2 is a rotation of si
using only onecalltoisSubstring (e.g., "waterbottLe" is a rotation of "erbottLewat").	*/

/* Say, 
    s1 = xy = waterbottle
	x = wat
	y = erbottle
	s2 = yx = erbottlewat
So, we need to check if there's a way to split si into x and y such that xy = si and yx =
s2. Regardless of where the division between x and y is, we can see that yx will always
be a substring of xyxy.That is, s2 will always be a substring of slsl.	

And this is precisely how we solve the problem: simply do isSubstring(slsl, s2). */

public class StringRotation {

	private static boolean isRotation(String str1, String str2) {
		
		int length = str1.length();
		// check if str1 and str2 are of equal length and not empty
		if(length==str2.length() && length>0){
			// Concatenate str1 and str1 within new buffer
			String str1str1 = str1 + str1;			
			return str1str1.contains(str2);				// checks if substring or not
		}
		return false;
	}
	
	public static void main(String a[]){
		String str1 = "waterbottLe";		
		String str2 = "erbottLewat";
		System.out.println(isRotation(str1,str2));		// case sensitive
	}	
}
