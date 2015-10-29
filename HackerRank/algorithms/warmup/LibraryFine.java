package algorithms.warmup;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class LibraryFine {
	
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner in = new Scanner(System.in);
        String actual = in.nextLine();
        String expected = in.nextLine();
        Date date1,date2 = null;
        try{
	        SimpleDateFormat sdf = new SimpleDateFormat("dd MM yyyy");
	     	date1 = sdf.parse(actual);
	       	date2 = sdf.parse(expected);
	       	
	       	Calendar cal1 = Calendar.getInstance();
        	Calendar cal2 = Calendar.getInstance();
        	cal1.setTime(date1);
        	cal2.setTime(date2);
	                	
        	if(cal1.after(cal2)){						// Date1 after Date2
        		
        		int y1 = cal1.get(Calendar.YEAR);
        		int y2 = cal2.get(Calendar.YEAR);
        		
        		if(y1==y2){
        			
        			int m1 = cal1.get(Calendar.MONTH);
        			int m2 = cal2.get(Calendar.MONTH);
        			
        			if(m1==m2){
        				
        				int d1 = cal1.get(Calendar.DAY_OF_MONTH);
        				int d2= cal2.get(Calendar.DAY_OF_MONTH);
        				
        				System.out.println((d1-d2)*15);
        			}
        			else{
        				System.out.println((m1-m2)*500);
        			}
        		}
        		else{
    				System.out.println(10000);       			
        		}
        		
        	}
        	else{
        		System.out.println(0);
        	}
        
        }
        catch(ParseException pe){
            pe.printStackTrace();
       }
    }

}
