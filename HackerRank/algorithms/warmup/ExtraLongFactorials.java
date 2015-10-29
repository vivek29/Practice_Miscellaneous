package algorithms.warmup;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ExtraLongFactorials {

	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
       
        if (n==0 || n==1){
            System.out.println(1);
        }
        else{
    
            BigInteger factValue = BigInteger.ONE;

            for ( int i = 2; i <= n; i++){
                factValue = factValue.multiply(BigInteger.valueOf(i));
            }
            
            System.out.println(factValue);
        }
    }
}
