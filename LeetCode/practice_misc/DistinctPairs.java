package practice_misc;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DistinctPairs {

	
	
	 static int count_pairs(String numbers, int minimum, int maximum) {       

		 if(numbers.isEmpty()){
			 return 0;
		 }
		 
		 HashMap myHash = new HashMap();
		 String[] numStr = numbers.split(",");
	        int[] nums = new int[numStr.length];
	        for(int i=0;i<numStr.length;i++)    {
	            
	            nums[i] = Integer.parseInt(numStr[i]);
	        }
	        
	        for(int i=0;i<nums.length;i++){
	        	for(int j=i+1;j<nums.length;j++){
	        		if((nums[i]+nums[j])>= minimum && (nums[i]+nums[j])<= maximum && !myHash.containsKey(nums[i]) && !myHash.containsValue(nums[j])) {
	        			
	        			myHash.put(nums[i], nums[j]);
	        			break;
	        		}
	        	}
	        }
	        return myHash.size();
	    }

	    public static void main(String[] args) throws IOException{
	        
	    	DistinctPairs obj = new DistinctPairs();
	    	System.out.println(obj.count_pairs("-4,8,4,2,1,3", 0, 6));
	    }
	}