package com.practice.Recursion;

import com.practice.Search.BinarySearch;

public class RecursiveBinarySearch {
	
	private long[] a;
	private int nElems; // number of data items

	public RecursiveBinarySearch(int max) {
		a = new long[max]; // create array
		nElems = 0;
	}

	public int size() {
		return nElems; 
	}
	
	public void insert(long value) {
		int j;
		for(j=0; j<nElems; j++) // find where it goes
			if(a[j] > value) // (linear search)
				break;
		for(int k=nElems; k>j; k--) // move bigger ones up
			a[k] = a[k-1];
			a[j] = value; // insert it
			nElems++; // increment size
	} // end insert()

	public boolean delete(long value) {
		int j = find(value);
		if(j==nElems) // can’t find it
			return false;
		else {
			for(int k=j; k<nElems; k++) // move bigger ones down
				a[k] = a[k+1];
			nElems--; // decrement size
		return true;
		}
	} // end delete()

	public void display() {
		for(int j=0; j<nElems; j++) // for each element,
			System.out.print(a[j] + " "); // display it
			System.out.println("");
	}
	
	public int find(long searchKey) {
		return recFind(searchKey, 0, nElems-1);
	}

	private int recFind(long searchKey, int lowerBound,	int upperBound)	{
		int curIn;
		curIn = (lowerBound + upperBound ) / 2;
		if(a[curIn]==searchKey)
			return curIn; // found it
		else if(lowerBound > upperBound)
			return nElems; // can’t find it
		else {
			if(a[curIn] < searchKey) // it’s in upper half
				return recFind(searchKey, curIn+1, upperBound);
			else // it’s in lower half
				return recFind(searchKey, lowerBound, curIn-1);
		} // end else divide range
	}
}

class RecursiveBinarySearchMain{
	
	public static void main(String[] args)
	{
		int maxSize = 100; // array size
		RecursiveBinarySearch arr;
		
		arr = new RecursiveBinarySearch(maxSize); // create the array

		arr.insert(72); // insert items
		arr.insert(90);
		arr.insert(45);
		arr.insert(126);
		arr.insert(54);
		arr.insert(99);
		arr.insert(144);
		arr.insert(27);
		arr.insert(135);
		arr.insert(81);
		arr.insert(18);
		arr.insert(108);
		arr.insert(9);
		arr.insert(117);
		arr.insert(63);
		arr.insert(36);
		
		arr.display(); // display items
		int searchKey = 63; // search for item
		int index = arr.find(searchKey);
		if( index != arr.size() )				// arr.size()==nElems
			System.out.println("Found " + searchKey + " at " +index+"th index of array." );
		else
			System.out.println("Can’t find " + searchKey);

		arr.display(); // display items
		arr.delete(18); // delete 3 items
		arr.delete(27);
		arr.delete(135);
		
		arr.display();
		
	}
}