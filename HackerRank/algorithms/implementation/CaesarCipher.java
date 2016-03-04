package algorithms.implementation;

import java.util.Scanner;

public class CaesarCipher {

	public static void main(String[] args) {
        
		int length,k;
		Scanner in = new Scanner(System.in);
		length = Integer.parseInt(in.nextLine());
		String input = in.nextLine();
		k = Integer.parseInt(in.nextLine());      
        k=k%26;
        
        System.out.println(encrypt(input, length, k));        
    }

	private static String encrypt(String input, int length, int k) {
		
		StringBuilder strBuilder = new StringBuilder();
	    char ch;
	    
	    for(int i=0;i<length;i++){
	    
	    	ch = input.charAt(i);
	    	if (Character.isLetter(ch)) {
	        ch = (char) (input.charAt(i) + k);
	        
	        if ((Character.isLowerCase(input.charAt(i)) && ch > 'z')
	            || (Character.isUpperCase(input.charAt(i)) && ch > 'Z'))
	            ch = (char) (input.charAt(i) - (26 - k));
	        }	    	
	    strBuilder.append(ch);
	    }
	
	   return strBuilder.toString(); 
	}
}
