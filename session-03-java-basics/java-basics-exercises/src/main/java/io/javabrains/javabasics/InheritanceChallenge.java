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


class  Animal{
     String name;
     int age;
    Animal(String name,int age){
        this.name = name;
        this.age = age;
    }

    public String makeSound(){
        return "make sound";
    }
}
class Dog extends Animal{
    String breed;
    Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    @Override
    public String makeSound(){
        return "The Dog Barks";
    }
}

class Cat extends Animal{
    int lives;
    Cat(String name, int age,int lives) {
        super(name, age);
        this.lives = lives;
    }
    @Override
    public String makeSound(){
        return "The Cat Meows";
    }
}
public class InheritanceChallenge {

    public static void main(String[] args) {
        Animal cat = new Cat("Cat",2,5);
        Animal dog = new Dog("Scooby",3,"labora");
        Animal lion = new Animal("lion",3);

        Animal[] animals = {cat,dog,lion};
        for (Animal animal: animals){
            System.out.println(animal.name + " " + animal.age + " " + animal.makeSound());
        }
    }
}
