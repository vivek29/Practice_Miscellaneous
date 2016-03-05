package datastructures.stacks_and_queues;

import java.util.LinkedList;

/* An animal shelter holds only dogs and cats, and operates on a strictly "first in, first
out" basis. People must adopt either the "oldest" (based on arrival time) of all animals
at the shelter, or they can select whether they would prefer a dog or a cat (and will
receive the oldest animal of that type). They cannot select which specific animal they
would like. Create the data structures to maintain this system and implement operations
such as enqueue, dequeueAny, dequeueDog and dequeueCat. You may
use the built-in L inkedL ist data structure.		*/

// Order is used so as to compare the insertion order of a dog to cat

abstract class Animal{
	private int order;
	public String name;
	public Animal(String s){
		name = s;
	}
	public int getOrder() {
		return order;
	}
	public void setOrder(int order) {
		this.order = order;
	}
	
	// Compare orders of animals to return the older one
	public boolean isOlderThan(Animal a){
		return this.order < a.order;
	}
}

class Dog extends Animal {
	public Dog(String n){
		super(n);
	}
}

class Cat extends Animal {
	public Cat(String n){
		super(n);
	}
}

public class AnimalShelter {

	LinkedList<Dog> dogs = new LinkedList<Dog>();
	LinkedList<Cat> cats = new LinkedList<Cat>();
	private int order = 0;		// acts as timestamp

	public void enqueue(Animal a){
		a.setOrder(order);
		order++;
		
		if(a instanceof Dog)
			dogs.addLast((Dog)a);
		else if (a instanceof Cat)
			cats.addLast((Cat)a);
	}
	
	public Animal dequeueAny(){
		
		// Looks at the tops of Dog and Cat and pops the stack with oldest value
		
		if(dogs.size()==0)
			return dequeueCats();
		else if(cats.size()==0)
			return dequeueDogs();
		
		Dog dog = dogs.peek();
		Cat cat = cats.peek();
		if(dog.isOlderThan(cat))
			return dequeueDogs();
		else
			return dequeueCats();
	}
	
	public Dog dequeueDogs(){
		return dogs.poll();
	}	
	public Cat dequeueCats(){
		return cats.poll();
	}
}
