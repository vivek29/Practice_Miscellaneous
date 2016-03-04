package java.collections;

import java.util.Scanner;

public class Java1DArray {

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		int count=0,sum=0;

		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}

		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				sum=sum+arr[j];
				if(sum<0)
					count++;
			}
			sum=0;
		}
		System.out.println(count);
	}
}