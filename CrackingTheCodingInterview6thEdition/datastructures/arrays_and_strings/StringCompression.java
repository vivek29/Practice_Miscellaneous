package datastructures.arrays_and_strings;

/*Implement a method to perform basic string compression using the counts of
repeated characters. For example, the string aabcccccaaa would become
a2blc5a3. If the "compressed" string would not become smaller than the original
string, your method should return the original string.	*/

public class StringCompression {

	private static String compressString(String str) {

		StringBuilder compressed = new StringBuilder();
		int count =0;

		for(int i=0;i<str.length();i++){
			count++;	
			// if next char is different than current, append this char to compressed
			// if(i+1>=str.length()) or if(i+1==str.length()) is needed otherwise it throws out of bound exception for the last char

			if(i+1==str.length() || str.charAt(i)!=str.charAt(i+1)){
				compressed.append(str.charAt(i));
				compressed.append(count);
				count=0;
			}
		}		
		return compressed.length()<str.length() ? compressed.toString() : str;
	}

	public static void main(String a[]){

		String str = "aabcccccaaaaaa";
		System.out.println(compressString(str));
	}
}
