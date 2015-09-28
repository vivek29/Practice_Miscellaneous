package com.practice.Sorting;

public class MergeSort {

	public static void main(String[] args) {

		MergeSort obj = new MergeSort();
		int[] nums1 = {3,6,9,14};
     	int[] nums2 = {2,5,7,14,17,21};
		int total = nums1.length+nums2.length;
		int[] arrayC = new int[total];

		obj.mergeSort(nums1, nums2, arrayC);
		obj.display(arrayC, total);			
	}
	
	public static void mergeSort(int[] nums1, int[] nums2, int[] arrayC) {
		   		
		 int i=0,j=0,k=0;
			
		 while(i<nums1.length && j<nums2.length){
					
			 if (nums1[i] < nums2[j]) 
				 arrayC[k++] = nums1[i++]; 
			 else
				 arrayC[k++] = nums2[j++]; 				 
		 }
			 
		 while(i<nums1.length) {
			 arrayC[k++] = nums1[i++]; 
		 }
			
		 while(j<nums2.length) {
			 arrayC[k++] = nums2[j++]; 
		 }
	}	 
		
	 public static void display(int[] theArray, int size) {
		 for(int j=0; j<size; j++)
			 System.out.print(theArray[j] + " ");
		 	System.out.println("");
		 }	
}
