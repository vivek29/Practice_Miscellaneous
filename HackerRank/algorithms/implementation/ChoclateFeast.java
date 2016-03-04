package algorithms.implementation;

import java.util.Scanner;

public class ChoclateFeast {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0; i < t; i++){
            System.out.println(Solve(in.nextInt(), in.nextInt(), in.nextInt()));
        }
    }
    
    private static long Solve(int N, int C, int M){
        
        long boughtCandy,total;
        
        boughtCandy = N/C;
        
        total = boughtCandy + (boughtCandy - 1)/(M - 1);
        return total;
    }
    
    /*
     For every m wrappers you get a candy, candy = wrapper, i.e. for every m wrappers you get 1 wrapper back.
     Thus, the actual "wrapper price" of one candy is (m - 1) rather than m. Now, dividing your original 
     number of wrappers by the "reduced price" is unfair - you still have to pay "full price" (i.e. full m) 
     for the very first "exchange candy". Thus, let us first put m aside to make sure we get our first free candy.
     So the amount of wrappers to divide by reduced price is (boughtCandy - m).

     total = boughtCandy + 1 + (boughtCandy - m) / (m - 1)
     */
}
