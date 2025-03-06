package io.javabrains.javabasics;

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
    static class Animal {
        String name;
        int age;
        Animal(String name, int age) {
            this.name=name;
            this.age=age;
        }
        void makeSound() {
            System.out.println("Animals make sounds");
        }
    }
    static class Dog extends Animal {
        String breed;
        Dog(String name, int age, String breed) {
            super(name, age);
            this.breed=breed;
        }
        @Override
        void makeSound() {
            System.out.println("Dog barks");
        }
    }
    static class Cat extends Animal {
        int noOfLives;
        Cat(String name, int age, int noOfLives)
        {
            super(name, age);
            this.noOfLives = noOfLives;
        }
        @Override
        void makeSound() {
            System.out.println("The Cat meows");
        }
    }
    static class Lion extends Animal {
        int noOfKills;
        Lion(String name, int age, int noOfKills)
        {
            super(name, age);
            this.noOfKills = noOfKills;
        }
        @Override
        void makeSound() {
            System.out.println("The Lion roars");
        }
    }
    public static void main(String[] args) {
        Animal dog = new Dog("puppy", 12, "dabberman");
        Animal cat = new Cat("catty", 10, 15);
        Animal lion = new Lion("liony", 50, 100);

        Animal[] animals = {dog, cat, lion};
        for(Animal animal : animals)
        {
            System.out.println(animal.name);
            System.out.println(animal.age);
            animal.makeSound();
        }

    }
}
