package com.practice.Sorting;

public class InsertionSort {

	private long[] a; 			// ref to array a
	private int nElems; 		// number of data items
	
	public InsertionSort(int max) {
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
		
		int in, out;
		
		for(out=1;out<nElems;out++){
			
			long temp = a[out];						// remove marked item
			in = out;					// start shift at out
			
			while(in>0 && a[in-1]>=temp){
				a[in] = a[in-1];				// shift item right
				--in;						// go left
			}
			
			a[in] = temp;		// insert marked item
		}
	}
}

class InsertionSortMain
{
	public static void main(String[] args)
	{
		int maxSize = 100; // array size
		InsertionSort arr; // reference to array
		arr = new InsertionSort(maxSize); // create the array
		
		arr.insert(77); // insert 10 items
		arr.insert(99);
		arr.insert(44);
		arr.insert(55);
		arr.insert(22);
		arr.insert(88);
		arr.insert(11);
		arr.insert(00);
		arr.insert(66);
		arr.insert(33);
		
		/*arr.insert(4); 
		arr.insert(2);
		arr.insert(5);
		arr.insert(3);
		arr.insert(1);*/
			
		arr.display(); 
		arr.sort(); 
		arr.display(); 
	}
}

