package datastructures.arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SparseArrays {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Map<String,Integer> arr = new HashMap<String,Integer>();
		for(int arr_i=0; arr_i < n; arr_i++){

			String str = in.next();
			
			if(arr.containsKey(str)){
				arr.put(str,arr.get(str)+1);
			}
			else{
				arr.put(str,0);
			}
		}

		int q = in.nextInt();

		for(int i=0;i<q;i++){
			String input = in.next();
			if(arr.get(input)!=null)
				System.out.println(arr.get(input));			
			else
				System.out.println(0);
		}
	}	

}