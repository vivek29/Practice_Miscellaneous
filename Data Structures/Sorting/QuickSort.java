package com.practice.Sorting;

public class QuickSort {
	
	private long[] theArray; // ref to array theArray
	private int nElems; // number of data items
	
	public QuickSort(int max){
		theArray = new long[max]; // create the array
		nElems = 0; // no items yet
	}
	
	public void insert(long value) {
		theArray[nElems] = value; // insert it
		nElems++; // increment size
	}
	
	public void display() {
		System.out.print("A= ");
		for(int j=0; j<nElems; j++) // for each element,
			System.out.print(theArray[j] + " "); // display it
			System.out.println("");
	}
	
	public void quickSort() {
		recQuickSort(0, nElems-1);
	}
	
	public void recQuickSort(int left, int right){
		
		if(right-left <= 0) // if size <= 1,
			return; // already sorted
		
		else{
			
			long pivot = theArray[right];
			
			int partition = partitionIt(left, right, pivot);
			recQuickSort(left, partition-1); // sort left side
			recQuickSort(partition+1, right); // sort right side
		}	
	}
	
	public int partitionIt(int left, int right, long pivot) {
		int leftPtr = left-1; // left (after ++)
		int rightPtr = right; // right-1 (after --)
		while(true) { 
		
			while( theArray[++leftPtr] < pivot )				// find bigger item
				; // (nop)
	
			while(rightPtr > 0 && theArray[--rightPtr] > pivot)				// find smaller item
				; // (nop)
			
			if(leftPtr >= rightPtr) // if pointers cross,
				break; // partition done
			else // not crossed, so
				swap(leftPtr, rightPtr); // swap elements
		} 	
		
		swap(leftPtr, right); // restore pivot
		
		return leftPtr; // return pivot location
	}
	
	public void swap(int dex1, int dex2) {
		long temp = theArray[dex1]; // A into temp
		theArray[dex1] = theArray[dex2]; // B into A
		theArray[dex2] = temp; // temp into B
	}
		
	public static void main(String[] args) {
		
		int maxSize = 10; // array size
		QuickSort arr;
		arr = new QuickSort(maxSize); // create the array

		for(int j=0; j<maxSize; j++) {					// fill random numbers
			long n = (int)(java.lang.Math.random()*99);
			arr.insert(n);
		}	

		arr.display(); // display unsorted array
		arr.quickSort(); // shell sort the array
		arr.display(); // display sorted array
				
	}
}
