package algorithms.warmup;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TimeConversion {

	 public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	        String input;
	        Scanner in = new Scanner(System.in);
	        input = in.nextLine();
	        
	        //Format of the date defined in the input String
	        DateFormat df = new SimpleDateFormat("hh:mm:ssaa");
	        //Desired format: 24 hour format: Change the pattern as per the need
	        DateFormat outputformat = new SimpleDateFormat("HH:mm:ss");
	        
	        Date date = null;
	        String output = null;  
	        try{
	            date= df.parse(input);
	            output = outputformat.format(date);
	            System.out.println(output);
	        }
	        catch(ParseException pe){
	            pe.printStackTrace();
	       }
	    }
}
