package algorithms.implementation;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CutTheSticks {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int N,min_value,min_index;
		N = in.nextInt();
		ArrayList<Integer> lengths = new ArrayList<Integer>(N);
		for(int i=0;i<N;i++){
			lengths.add(in.nextInt());        	
		}
		System.out.println(lengths.size());

		while(true){

			min_index = lengths.indexOf(Collections.min(lengths));
			min_value = lengths.get(min_index);

			for(int k=0;k<lengths.size();k++){
				lengths.set(k, lengths.get(k)-min_value);
			}
			for(int j=0;j<lengths.size();j++){
				if(lengths.get(j)==0){
					lengths.remove(j);
					j--;
				}
			}
			if(lengths.isEmpty())
				break;
			System.out.println(lengths.size());        	
		}

	}

}
