package com.practice.vivek;

public class StringsDemo4 {

	public static void main(String[] args) {

		String str1 = "My name is bob";
		char str2[] = new char[str1.length()];
		String str3 = "bob";
		String str4 = "cob";
		String str5 = "BoB";
		String str6 = "bob";
		
		System.out.println("Length of the String str1 : " + str1.length());
		
		System.out.println("Character at position 3 is : "
				+ str1.charAt(3));
		
		str1.getChars(0, str1.length(), str2, 0);
		System.out.print("The String str2 is : ");
		for (int i = 0; i < str2.length; i++) {
			System.out.print(str2[i]);
		}
		
		System.out.println();
		
		System.out.print("Comparision Test : ");
		if (str3.compareTo(str4) < 0) {
			System.out.print(str3 + " < " + str4);
		} else if (str3.compareTo(str4) > 0) {
			System.out.print(str3 + " > " + str4);
		} else {
			System.out.print(str3 + " equals " + str4);
		}
		
		System.out.println();
		
		System.out.print("Equals Test");
		System.out.println("str3.equalsIgnoreCase(5) : "
				+ str3.equalsIgnoreCase(str5));
		System.out.println("str3.equals(6) : " + str3.equals(str6));
		System.out.println("str1.equals(3) : " + str1.equals(str3));
		
		str5.toUpperCase(); //Strings are immutable
		System.out.println("str5 : " + str5);
		String temp = str5.toUpperCase();
		System.out.println("str5 Uppercase: " + temp);
		temp = str1.toLowerCase();
		System.out.println("str1 Lowercase: " + str1);
		
		System.out.println("str1.concat(str4): " + str1.concat(str4));
		
		String str7temp = "  \t\n Now for some Search and Replace Examples    ";
		
		String str7 = str7temp.trim();
		System.out.println("str7 : " + str7);
		
		String newStr = str7.replace('s', 'T');
		System.out.println("newStr : " + newStr);
		
		System.out.println("indexof Operations on Strings");
		System.out.println("Index of p in " + str7 + " : "
				+ str7.indexOf('p'));
		System.out.println("Index of for in " + str7 + " : "
				+ str7.indexOf("for"));
		System.out.println("str7.indexOf(for, 30) : "
				+ str7.indexOf("for", 30));
		System.out.println("str7.indexOf('p', 30) : "
				+ str7.indexOf('p', 30));
		System.out.println("str7.lastIndexOf('p') : "
				+ str7.lastIndexOf('p'));
		System.out.println("str7.lastIndexOf('p', 4) : "
				+ str7.lastIndexOf('p', 4));
		
		System.out.print("SubString Operations on Strings");
		String str8 = "SubString Example";
		String sub5 = str8.substring(5); // "ring Example"
		String sub3_6 = str8.substring(3, 6); // "Str"
		System.out.println("str8 : " + str8);
		System.out.println("str8.substring(5) : " + sub5);
		System.out.println("str8.substring(3,6) : " + sub3_6);
	}
}


/*Java String Functions

The following program explains the usage of the some of the basic String methods like ;

1. compareTo(String anotherString)
Compares two strings lexicographically.

2. charAt(int index)
Returns the character at the specified index.

3. getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin)
Copies characters from this string into the destination character array.

4. length()
Returns the length of this string.

5. equals(Object anObject)
Compares this string to the specified object.

6. equalsIgnoreCase(String anotherString)
Compares this String to another String, ignoring case considerations.

7. toUpperCase()
Converts all of the characters in this String to upper case using the rules of the default locale.

7. toLowerCase()
Converts all of the characters in this String to upper case using the rules of the default locale.

9. concat(String str)
Concatenates the specified string to the end of this string.

10. indexOf(int ch)

Returns the index within this string of the first occurrence of the specified character.

11. indexOf(int ch, int fromIndex)

Returns the index within this string of the first occurrence of the specified character, starting the search at the specified index.

12. indexOf(String str)

Returns the index within this string of the first occurrence of the specified substring.

13. indexOf(String str, int fromIndex)

Returns the index within this string of the first occurrence of the specified substring, starting at the specified index.

14. lastIndexOf(int ch)

Returns the index within this string of the last occurrence of the specified character.

15. lastIndexOf(int ch, int fromIndex)

Returns the index within this string of the last occurrence of the specified character, searching backward starting at the specified index.

16. lastIndexOf(String str)

Returns the index within this string of the rightmost occurrence of the specified substring.

17. lastIndexOf(String str, int fromIndex)

Returns the index within this string of the last occurrence of the specified substring, searching backward starting at the specified index.

18. substring(int beginIndex)

Returns a new string that is a substring of this string.

19. substring(int beginIndex, int endIndex)

Returns a new string that is a substring of this string.

20. replace(char oldChar, char newChar)

Returns a new string resulting from replacing all occurrences of oldChar in this string with newChar.

21. trim()

Returns a copy of the string, with leading and trailing whitespace omitted.

22. toString()



This object (which is already a string!) is itself returned.
*/