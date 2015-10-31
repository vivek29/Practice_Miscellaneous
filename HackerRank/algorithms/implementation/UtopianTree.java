package algorithms.implementation;

import java.util.Scanner;

public class UtopianTree {
	
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner in = new Scanner(System.in);
        int t;
        t = in.nextInt();               
        int N;
        
        for(int i=0;i<t;i++){
        	int height = 1;
            int count=0;
            
            N = in.nextInt();
            for(int j=0;j<N;j++){
            	
            	if(count==0){
            		height = height*2;
            		count=1;
            	}	
            	else {
            		height = height+1;
            		count=0;
            	}            		
            }
            System.out.println(height);
        }
        
    }

}
