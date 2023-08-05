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
        //In the `main` method of this class, create an array of `Animal` objects and initialize it with a
        // `Lion`, a `Dog`, a `Cat`, and another `Animal` of your choice.
        Dog tommy = new Dog("Tommy", 2, "German Shepard");
        Cat monu = new Cat("Monu", 2, 7);

        Animal [] animals = {tommy, monu};

        //Loop through the array of `Animal` objects and print the name, age, and sound of each animal.
        for (Animal animal : animals) {
            System.out.println("Animal is " + animal.getClass().getSimpleName() + ", Name = " + animal.getName()
                            + " Age = " + animal.getAge()
                    );
            animal.makeSound();
        }
    }
}

//Create an `Animal` class with member variables for the name and age of the animal and a constructor method that initializes the member variables.
class Animal{

    private String name;
    private int age;

    Animal(){ }

    Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void makeSound(){
        System.out.println("Animal is doing sound..!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

//Create a `Dog` class that extends the `Animal` class and has a member variable for the breed of the dog
// and a constructor method that initializes the member variables.
class Dog extends Animal {
    private String breed;

    Dog(String name, int age, String breed){
        super(name, age);
        this.breed = breed;
    }

    //Override the `makeSound` method in the `Dog` class to print "The dog barks".
    @Override
    public void makeSound() {
        System.out.println("The dog barks..!");
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}

//Create a `Cat` class that extends the `Animal` class and has a member variable for the number of lives of the cat
// and a constructor method that initializes the member variables.
class Cat extends Animal {

    private int lives;

    public Cat(String name, int age, int lives) {
        super(name, age);
        this.lives = lives;
    }

    //Override the `makeSound` method in the `Cat` class to print "The cat meows".

    @Override
    public void makeSound() {
        System.out.println("The cat meows..!");
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }
}