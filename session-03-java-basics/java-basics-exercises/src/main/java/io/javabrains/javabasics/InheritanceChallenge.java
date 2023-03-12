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

import java.util.Scanner;

class Animal{
    String name;
    int age;
    public Animal(){

    }
    Animal(String name,int age){
        this.name=name;
        this.age=age;
    }

    public void makeSound() {
        System.out.println("animal sound unknown");}

}
class Dog extends  Animal{
    String breed;
    public Dog(String i, int i1){
        super(i,i1);
    }
    Dog(String breed){
        this.breed=breed;
    }
    public void makeSound(){
        System.out.println("woof woof...");
    }

}
class Cat extends Animal{
    public Cat(){

    }

    public Cat(String cat, int i) {
        super(cat,i);
    }

    public void makeSound(){
        System.out.println("meowww");
    }
}


public class InheritanceChallenge {

    public static void main(String[] args) {
        Scanner in=new Scanner ( System.in );
        int j=5;
        String ar[]={"Lion","Dog","Cat"};
        for(String i:ar) {
            System.out.println ( "Nxt animal is" );
            if (i.equals ( "Dog" )) {
                Dog a = new Dog ( "Dog", j++ );
                System.out.println ( "name: " + a.name + "\nage: " + a.age );
                System.out.println ( "Sound: " );
                a.makeSound ( );

            }
            else if (i.equals ( "Cat" )) {
                Cat a = new Cat ( "cat", j++ );
                System.out.println ( "name: " + a.name + "\nage: " + a.age );
                System.out.println ( "Sound: " );
                a.makeSound (  );


            }
            else{
                Animal a=new Animal ( i,j++ );
                System.out.println ( "name: " + a.name + "\nage: " + a.age );
                System.out.println ( "Sound: " );
                a.makeSound ( );
            }
        }
    }
}