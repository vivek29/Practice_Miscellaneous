package com.practice.Search;

public class BinarySearch {

	private long[] a;
	private int nElems; // number of data items

	public BinarySearch(int max) {
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
	
	public int find(long searchKey)	{
		int lowerBound = 0;
		int upperBound = nElems-1;
		int curIn;
		while(true) {
			curIn = (lowerBound + upperBound ) / 2;
			if(a[curIn]==searchKey)
				return curIn; // found it
			else if(lowerBound > upperBound)
				return nElems; // can’t find it
			else {
				if(a[curIn] < searchKey)
					lowerBound = curIn + 1; // it’s in upper half
				else
					upperBound = curIn - 1; // it’s in lower half
			} // end else divide range
		} // end while
	}
}

class BinarySearchMain{
	
	public static void main(String[] args)
	{
		int maxSize = 100; // array size
		BinarySearch arr;
		
		arr = new BinarySearch(maxSize); // create the array
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
		
		arr.display(); // display items
		int searchKey = 55; // search for item
		int index = arr.find(searchKey);
		if( index != arr.size() )				// arr.size()==nElems
			System.out.println("Found " + searchKey + " at " +index+"th index of array." );
		else
			System.out.println("Can’t find " + searchKey);

		arr.display(); // display items
		arr.delete(00); // delete 3 items
		arr.delete(55);
		arr.delete(99);
		
		arr.display();
		
	}
	
	
}