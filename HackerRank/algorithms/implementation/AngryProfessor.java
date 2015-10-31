package algorithms.implementation;

import java.util.Scanner;

public class AngryProfessor {
	
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner in = new Scanner(System.in);
        int t;
        t = in.nextInt();
        
        int N,K;
        for(int i=0;i<t;i++){
            
            N = in.nextInt();
            K = in.nextInt();
            int [] student_time = new int[N];
            for(int j=0;j<N;j++) {
            	student_time[j] = in.nextInt();            	
            }
            
            int student_before=0, student_after=0;
            
            for(int k=0;k<student_time.length;k++) {
            	
            	if(student_time[k]>0)
            		student_after++; 
            	else
            		student_before++;
            }
            
            if(student_before>=K)
            	System.out.println("NO");
            else
            	System.out.println("YES");
        }
        
    }
	
}
