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

    public static void main(String[] args) {
        class Animal{
            private String name;
            private int age;

            public Animal(String name, int age){
                this.name = name;
                this.age = age;
            }

            public void makeSound(){
                System.out.println("Generic sound");
            }

            @Override
            public String toString(){
                return String.format("Name: %s \nAge: %d", name, age);
            }
        }

        class Dog extends Animal{
            private String breed;

            public Dog(String name, int age, String breed){
                super(name,age);
                this.breed = breed;
            }

            @Override
            public void makeSound(){
                System.out.println("The dog barks");
            }

        }

        class Cat extends Animal{
            private int lives;

            public Cat(String name, int age, int lives){
                super(name,age);
                this.lives = lives;
            }

            @Override
            public void makeSound(){
                System.out.println("The cat meows");
            }

        }

        Animal[] zoo = {new Animal("King Leo",12), new Dog("Spot", 5, "Dalmation"),
                new Cat("Whiskers", 8, 9)};

        for (Animal a : zoo){
            System.out.println(a.toString());
            a.makeSound();
        }
    }
}
