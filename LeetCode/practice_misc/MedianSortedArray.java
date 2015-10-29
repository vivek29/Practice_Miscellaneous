package practice_misc;

public class MedianSortedArray {

	 public double findMedianSortedArrays(int[] nums1, int[] nums2) {
	     
		 int elements = nums1.length+nums2.length;
		 
		 if(elements==1){
			 if(nums1.length==1)
				 return nums1[0];
			 else
				 return nums2[0];
		 }
		 
		 if(elements==2){
			 if(nums1.length==2)
				 return (double)(nums1[0]+nums1[1])/2;
			 else if(nums2.length==2)
				 return (double)(nums2[0]+nums2[1])/2;
			 else
				 return (double)(nums1[0]+nums2[0])/2;			 
		 }
		 
		 int total = elements/2;
		 int[] combArray = new int[++total];
		 double median;
		 	 
		 int i=0,j=0,k=0;
				
		 while(i<nums1.length && j<nums2.length && k<combArray.length){
					
			 if (nums1[i] < nums2[j]) 
				 combArray[k++] = nums1[i++]; 
			 else
				 combArray[k++] = nums2[j++]; 				 
		 }
			 
		 while(i<nums1.length && k<combArray.length) {
			 combArray[k++] = nums1[i++]; 
		 }
			
		 while(j<nums2.length && k<combArray.length) {
			 combArray[k++] = nums2[j++]; 
		 }
			 
		 if((nums1.length+nums2.length)%2==0){
			 median = (double)(combArray[total-1]+combArray[total-2])/2;
		 }
		 else{
			 median = (double)combArray[total-1];
		 }
		 return median;
	 }
		 
	 public static void main(String a[]){
		
		 MedianSortedArray med = new MedianSortedArray();
		 int[] nums1 = {};
		 int[] nums2 = {1,2,3,4};
		 
		 double median = med.findMedianSortedArrays(nums1, nums2);
		 System.out.println(median);
	 }
}
