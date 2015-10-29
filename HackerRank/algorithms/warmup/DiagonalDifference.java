package algorithms.warmup;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class DiagonalDifference {

	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        int t,sum1=0,sum2=0;
        Scanner in = new Scanner(System.in);
        t = in.nextInt();
        int nums[][] = new int[t][t];
        
        for(int i=0;i<t;i++){
            for(int j=0;j<t;j++){
                nums[i][j] = in.nextInt();
            }
        }
        
        for(int k=0;k<t;k++){
            sum1 += nums[k][k];                        
        }
        
        for(int p=t-1,k=0;p>=0;p--,k++){
            sum2 += nums[k][p];
        }
        System.out.println(Math.abs(sum1-sum2));

    }
	
	
}
