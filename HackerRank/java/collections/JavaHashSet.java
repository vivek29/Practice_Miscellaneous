package java.collections;

import java.util.*;

public class JavaHashSet {

	public static void main(String[] args) {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();

		HashSet<String> hs = new HashSet<String>();
		for(int i=0;i<n;i++) {
			String e = sc.nextLine();
			hs.add(e);
			System.out.println(hs.size());
		}
	}
}
