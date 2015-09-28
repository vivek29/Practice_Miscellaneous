package com.practice.Sorting;

public class SelectionSort {

	private long[] a; 			// ref to array a
	private int nElems; 		// number of data items
	
	public SelectionSort(int max) {
		a = new long[max]; // create the array
		nElems = 0; // no items yet
	}
	
	public void insert(long value) {
		a[nElems] = value; 			// insert it
		nElems++; 					// increment size
	}
	
	public void display() {
		for(int j=0; j<nElems; j++) // for each element,
			System.out.print(a[j] + " ");
			System.out.println("");
	}

	public void sort(){
		int out,in,min;
		
		for(out=0;out<nElems-1;out++){			// here also N-1 comparisons
			min = out;
			
			for(in=out+1;in<nElems;in++){
				if(a[in]<a[min]){
					min = in;					// min starts pointing to new minimum value than(no swap)		
				}
			long temp = a[out];			// swaps only once in a pass(min and out)
			a[out] = a[min];
			a[min] = temp;	
		}					// end of out for loop
	}				
  }	
}

class SelectionSortMain
{
	public static void main(String[] args)
	{
		int maxSize = 100; // array size
		SelectionSort arr; // reference to array
		arr = new SelectionSort(maxSize); // create the array
		
	/*	arr.insert(77); // insert 10 items
		arr.insert(99);
		arr.insert(44);
		arr.insert(55);
		arr.insert(22);
		arr.insert(88);
		arr.insert(11);
		arr.insert(00);
		arr.insert(66);
		arr.insert(33);*/
		
		arr.insert(4); 
		arr.insert(2);
		arr.insert(5);
		arr.insert(3);
		arr.insert(1);
			
		arr.display(); 
		arr.sort(); 
		arr.display(); 
	}
}
