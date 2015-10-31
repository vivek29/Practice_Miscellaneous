package algorithms.implementation;

import java.util.Scanner;

public class FindDigits {

	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner in = new Scanner(System.in);
        int t;
        t = in.nextInt();
        int N;
        int ans = 0;
        
        for(int i=0;i<t;i++){
        	
        	N = in.nextInt();		
        	int num = N;
        	int rem;

        	while(num>0){
        		rem=num%10;		
        		if(!(rem==0)){
	        		if((N%rem)==0)
	        			ans++;			
	        	}
        		num=num/10;	
        	}
        	
       	System.out.println(ans);
       	ans=0;
        }       
	}
}
