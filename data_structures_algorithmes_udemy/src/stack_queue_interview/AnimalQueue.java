package stack_queue_interview;

import java.util.LinkedList;

public class AnimalQueue {
	
	LinkedList<Dog> dogs = new LinkedList<>();
	LinkedList<Cat> cats = new LinkedList<>();
	private int order = 0;
	
	public static void main(String[] args) {
		AnimalQueue animals = new AnimalQueue();
		animals.enqueue(new Cat("Kiki"));
		animals.enqueue(new Cat("Kari"));
		animals.enqueue(new Dog("Beji"));
		animals.enqueue(new Cat("Reki"));
		animals.enqueue(new Dog("Dexter"));
		
		System.out.println(animals.dequeueAny().name());
		System.out.println(animals.dequeueDogs().name());
		

	}
	
	// enqueue
	void enqueue(Animal animal) {
		animal.setOrder(order);
		order++;
		if(animal instanceof Dog) {
			dogs.addLast((Dog) animal);
		} else if(animal instanceof Cat) {
			cats.addLast((Cat) animal);
		}
	}
	
	int size() {
		return dogs.size() + cats.size();
	}
	
	// dequeue dogs
	Dog dequeueDogs() {
		return dogs.poll();
	}
	
	// peek cats
	Dog peekDogs() {
		return dogs.peek();
	}
	
	// dequeue cats
	Cat dequeueCats() {
		return cats.poll();
	}
		
	// peek cats
	Cat peekCats() {
		return cats.peek();
	}
	
	// dequeAny
	Animal dequeueAny() {
		if(dogs.size() == 0) {
			return dequeueCats();
		} else if(cats.size() == 0) {
			return dequeueDogs();
		}
		
		Dog dog = dogs.peek();
		Cat cat = cats.peek();
		
		if(dog.isOlderThan(cat)) {
			return dogs.poll();
		} else {
			return cats.poll();
		}
		
	}
	
	// peekAny
	Animal peek() {
		if(dogs.size() == 0) {
			return cats.peek();
		} else if(cats.size() == 0) {
			return dogs.peek();
		}
		
		Dog dog = dogs.peek();
		Cat cat = cats.peek();
		
		if(dog.isOlderThan(cat)) {
			return dogs.peek();
		} else {
			return cats.peek();
		}
	}
	
	
}

abstract class Animal{
	private int order;
	protected String name;
	
	public Animal(String name) {
		this.name = name;
	}
	
	abstract String name();
	
	void setOrder(int order) {
		this.order = order;
	}
	
	int getOrder() {
		return order;
	}
	
	boolean isOlderThan(Animal animal) {
		return this.order < animal.order;
	}
	
}

class Cat extends Animal{

	public Cat(String name) {
		super(name);
	}

	@Override
	String name() {
		return "Cat: " + name;
	}
	
}

class Dog extends Animal{

	public Dog(String name) {
		super(name);
	}

	@Override
	String name() {
		return "Dog: " + name;
	}
	
}
