package datastructures.arrays_and_strings;

/* Write a method to replace all spaces in a string with '%20'. You may assume that the
string has sufficient space at the end of the string to hold the additional characters,
and that you are given the "true" length of the string. (Note: if implementing in Java,
please use a character array so that you can perform this operation in place.)	*/

// Java, String are immutable. so if we use String, function returns a new String

public class URLify {

	private static String replaceSpaces(char[] str, int length) {

		int count=0,new_length;
		for(int i=0;i<length;i++){
			if(str[i]== ' ')
				count++;
		}
		new_length = length+count*2;
		str[new_length] = '\0';				// to show end of string
		for(int i=length-1;i>=0;i--){
			if(str[i]==' '){
				str[new_length-1] = '0';
				str[new_length-2] = '2';				
				str[new_length-3] = '%';
				new_length = new_length-3;
			} else{
				str[new_length-1] = str[i];
				new_length--;
			}
		}
		return new String(str);
	}

	public static void main(String a[]){

		String str = "Mr John Smith     ";
		char[] input = str.toCharArray();
		System.out.println(replaceSpaces(input,13));
	}
}
