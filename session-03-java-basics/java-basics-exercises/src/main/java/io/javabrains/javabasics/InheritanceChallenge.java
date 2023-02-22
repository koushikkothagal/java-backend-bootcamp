package io.javabrains.javabasics;

import java.util.ArrayList;

/*

1.  Create an `Animal` class with member variables for the name and age of the animal and a constructor method that initializes the member variables.
2.  Create a `Dog` class that extends the `Animal` class and has a member variable for the breed of the dog and a constructor method that initializes the member variables.
3.  Override the `makeSound` method in the `Dog` class to print "The dog barks".
4.  Create a `Cat` class that extends the `Animal` class and has a member variable for the number of lives of the cat and a constructor method that initializes the member variables.
5.  Override the `makeSound` method in the `Cat` class to print "The cat meows".
6.  In the `main` method of this class, create an array of `Animal` objects and initialize it with a `Lion`, a `Dog`, a `Cat`, and another `Animal` of your choice.
7.  Loop through the array of `Animal` objects and print the name, age, and sound of each animal.
 */


public class InheritanceChallenge {

    public static void main(String[] args) {
    	ArrayList<Animal> animal=new ArrayList();
    	animal.add(new Animal("elephent",7));
    	animal.add(new Animal("lion",3));
    	animal.add(new Dog("dog",5,"chewawa"));
    	animal.add(new Cat("cat",6,3));
    	
    	animal.forEach(a->{System.out.println("Name: "+a.name+" Age: "+a.age+" Sound: ");
    	a.makeSound();
    	});

    }
}
class Animal{
	String name;
	int age;
	public Animal(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	void makeSound() {
		System.out.println("Animal Sound");
	}
	
	
}
class Dog extends Animal{
	String bread;

	public Dog(String name, int age, String bread) {
		super(name, age);
		this.bread = bread;
	}
	void makeSound() {
		System.out.println("The dog barks");
	}
	
	
}
class Cat extends Animal{
	int numLife;

	public Cat(String name, int age, int num) {
		super(name, age);
		this.numLife = num;
	}
	void makeSound() {
		System.out.println("The cat meows");
	}
	
	
}
