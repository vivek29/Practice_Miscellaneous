package practice_misc;

import java.util.HashSet;

public class LongestSubstring {

	public int lengthOfLongestSubstring(String s) {
	     
 	HashSet<Character> set = new HashSet<Character>();

    String longestOverAll = "";
    String longestTillNow = "";
      
    for (int x = 0; x < s.length(); x++){
      for (int i = 0; i < s.length(); i++) {
    	  char c = s.charAt(i);

          if (set.contains(c)) {
        	  longestTillNow = "";
              set.clear();
          }
          
          longestTillNow += c;
          set.add(c);
          
          if (longestTillNow.length() > longestOverAll.length()) {
                longestOverAll = longestTillNow;
            }
        }
    } 
        return longestOverAll.length();
	}
	
	public static void main(String a[]){
		
		LongestSubstring obj = new LongestSubstring();
		int length = obj.lengthOfLongestSubstring("dvdf");
		System.out.println(length);
	}
}
