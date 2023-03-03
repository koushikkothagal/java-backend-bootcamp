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
  private String name;
  private int age;
  private String breed;
  public Animal(String name,int age,String breed){
    this.name=name;
    this.age=age;
    this.breed=breed;
  }
  public String getName(){
    return name;
  }
  public int getAge(){
    return age;
  }
  public void makeSound(){
    System.out.println("Animals make sound");
  }
  public String getBreed(){
    return breed;
  }
}
class Dog extends Animal{
  public Dog(String name,int age,String breed){
     super(name, age ,breed);
  }
  public void makeSound(){
    System.out.println("Dog barks");
  }
}
class Cat extends Animal{
  private int lives;
  public Cat(String name,int age,int lives,String breed){
          super(name, age ,breed);
     this.lives=lives;
  }
  public void makeSound(){
    System.out.println("Cat meows");
  }
  public void getLives(){
    System.out.println("Cats have "+lives+" lives");
  }
}
class Lion extends Animal{
    
  public Lion(String name,int age, String breed){
     super(name, age ,breed);
  }
  public void makeSound(){
    System.out.println("Lion roars");
  }
}
class Cow extends Animal{
    
  public Cow(String name,int age, String breed){
      super(name, age ,breed);
  }
  public void makeSound(){
    System.out.println("Cow moos");
  }
}
public class InheritanceChallenge {
    public static void main(String[] args) {
      Animal[] animals=new Animal[4];
      animals[0]=new Lion("Simba",2,"AfricanLion");
      animals[1]=new Dog("Puppy",3,"IndianPeriah");
      animals[2]=new Cat("Kitty",2,9,"Bengalcat");
      animals[3]=new Cow("Pearl",2, "Bargur");
      for(Animal animal:animals){
        System.out.println("Name: "+animal.getName());
        System.out.println("Age: "+animal.getAge());
        System.out.println("Breed: "+animal.getBreed());
        if(animal instanceof Cat) {
            ((Cat)animal).getLives();
        }
        animal.makeSound();
        System.out.println();
      }
    }
}
