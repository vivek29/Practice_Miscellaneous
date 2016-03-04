package datastructures.arrays_and_strings;

/* Given 2 strings, check if they are one edit(or zero edit) away.	*/

public class OneAway {

	private static boolean oneEditAway(String first, String second) {

		int len1 = first.length();
		int len2 = second.length();
		if(len1==len2)
			return oneEditReplace(first,second);
		else if(len1+1==len2)
			return oneEditInsert(first,second);				// onEditInsert(longer,shorter)
		else if(len1-1==len2)								// inverse of insertion
			return oneEditInsert(second,first);				// so change the order
		return false;
	}	

	private static boolean oneEditReplace(String first, String second) {

		boolean foundDifference = false;
		for(int i=0;i<first.length();i++){
			if(first.charAt(i) != second.charAt(i)){
				if(foundDifference)
					return false;
				foundDifference = true;
			}
		}
		return true;
	}

	private static boolean oneEditInsert(String first, String second) {

		int index1=0,index2=0;
		while(index2<second.length() && index1<first.length()){
			if(first.charAt(index1)!=second.charAt(index2)){
				if(index1!=index2){
					return false;
				}
				index2++;
			} else {
				index1++;
				index2++;
			}
		}
		return true;
	}

	public static void main(String a[]){

		String str1 = "pale";		
		String str2 = "ple";
		System.out.println(oneEditAway(str1,str2));
	}

}
