package com.practice.generics;

class OrderedPair<K, V> implements Pair<K, V> {

    public K key;
    public V value;

    public OrderedPair(K key, V value) {
	this.key = key;
	this.value = value;
    }

    public K getKey()	{ return key; }
    public V getValue() { return value; } 

}

public class MultipleParameters{
	
	public static void main(String[] args){
	
		Pair<String, Integer> p1 = new OrderedPair<String, Integer>("Even", 8);
		Pair<String, String>  p2 = new OrderedPair<String, String>("hello", "world");
		
		/*
		 
		  OrderedPair<String, Integer> p1 = new OrderedPair<>("Even", 8);
		  OrderedPair<String, String>  p2 = new OrderedPair<>("hello", "world");
		 
		 */
		
	    System.out.println(p1.getKey()+ " :"+p1.getValue());

	    System.out.println(p2.getKey()+ " :"+p2.getValue());
	    
	}
}