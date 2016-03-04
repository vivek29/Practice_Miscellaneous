package algorithms.warmup;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Staircase {

	public static void main(String[] args) {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

		int t;
		Scanner in = new Scanner(System.in);
		t = in.nextInt();
		for(int i=1; i<=t;i++){
			for(int j=i;j<t;j++){
				System.out.print(" ");
			}

			for(int k=0;k<i;k++){
				System.out.print("#");             
			}
			System.out.println();    
		}
	}

}
