package java.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JavaMap {

	public static void main(String []arg) {
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		in.nextLine();

		Map<String,Integer> phonebook = new HashMap<String, Integer>(); 

		for(int i=0;i<n;i++) {
			String name=in.nextLine();
			int phone=in.nextInt();
			phonebook.put(name, phone);
			in.nextLine();
		}

		while(in.hasNext()) {
			String ptr=in.nextLine();
			if(phonebook.containsKey(ptr)){
				System.out.println(ptr+"="+phonebook.get(ptr));
			}
			else {
				System.out.println("Not found");
			}
		}
	}

}
