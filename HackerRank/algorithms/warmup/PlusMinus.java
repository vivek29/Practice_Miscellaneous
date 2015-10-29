package algorithms.warmup;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class PlusMinus {

	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int t;
        Scanner in = new Scanner(System.in);
        t = in.nextInt();
        int p=0,n=0,z=0;
        int nums[] = new int[t];
        
        for(int i=0;i<t;i++){
            nums[i] = in.nextInt();
        }        
        
        for(int k=0;k<nums.length;k++){
            
            if(nums[k]>0)
                p++;
            else if(nums[k]<0)
                n++;
            else
                z++;
        }
        double t1 = (double) t;
        System.out.println((double)p/t1);
        System.out.println((double)n/t1);
        System.out.println((double)z/t1);
        
    }
}
