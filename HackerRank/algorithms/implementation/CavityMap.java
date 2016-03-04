package algorithms.implementation;

import java.util.Scanner;

public class CavityMap {

	public static void main(String[] args) {
		
		int n;
		Scanner in = new Scanner(System.in);
		n = Integer.parseInt(in.nextLine());
		
		int[][] nums = new int[n][n];
		
		String temp[][] = new String[n][];
		
		for(int i=0;i<temp.length;i++ ) {
			String str = in.nextLine();
			temp[i] = str.trim().split("");			
			
			for(int j=0;j<n;j++) {
				if(temp[i]!=null)
					nums[i][j] = Integer.parseInt(temp[i][j]);
			}
		}
		
		for(int i=1;i<n-1;i++){
			for(int j=1;j<n-1;j++) {
		
				if(nums[i][j]>nums[i][j-1] && nums[i][j]>nums[i-1][j] && nums[i][j]>nums[i][j+1] && nums[i][j]>nums[i+1][j]){
					temp[i][j] = "X";
				}
			}
		}
	
		for(int i=0;i<temp.length;i++) {
			for(int j=0;j<temp.length;j++) {
				System.out.print(temp[i][j]);
			}
			System.out.println();
		}
	}	
}