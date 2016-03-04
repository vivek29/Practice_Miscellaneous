package cloudera;

import java.util.HashSet;
import java.util.Set;

public class Task1 {

	public int solution(int[] A, int[] B) {
		// write your code in Java SE 8

		Set<Integer> hs = new HashSet<Integer>();
		for (int i=0; i<A.length; i++) {
			hs.add(A[i]);
		}
		int min = Integer.MAX_VALUE;
		for (int i=0; i<B.length; i++) {
			if (hs.contains(B[i])) {
				if (B[i] < min){
					min = B[i];
				}
			}
		}
		if(min==Integer.MAX_VALUE)
			return -1;
		return min;	
	}

}
