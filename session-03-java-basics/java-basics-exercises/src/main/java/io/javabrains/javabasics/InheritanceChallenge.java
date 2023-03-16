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
class Animal{
    String name,sound;int age;

    public Animal(){};
    void makeSound(){
        System.out.println("Some sound");
    }
    Animal(String n,int a,String s){
        this.name=n;this.sound=s;this.age=a;
    };
}
class Dog extends Animal{
    String breed;
    void makeSound(){
        System.out.println("The dog barks");
    }
    Dog(){};
}
class Cat extends Animal{
    int n;
    void makeSound(){
        System.out.println("The cat meows");
    }
    Cat(){};
}
public class InheritanceChallenge {
    public static void main(String[] args) {
        Animal obj1=new Dog();
        Animal obj2=new Cat();
        obj1.makeSound();obj2.makeSound();
        Animal a[]=new Animal[4];
        a[0]=new Animal("Lion",8,"Roars");
        a[1]=new Animal("Dog",4,"Barks");
        a[2]=new Animal("Cat",5,"Meows");
        a[3]=new Animal("Tiger",9,"Growl");
        for(int i=0;i<4;i++){
            System.out.println("Name: "+a[i].name+" "+"\nAge: "+a[i].age+" "+"\nSound: "+a[i].sound+'\n');
        }
    }
}