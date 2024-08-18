package io.javabrains.javabasics;

public class Dog extends Animal {
    private String breed;

    public Dog(String breed, String name, int age) {
        super(name, age);
        this.breed = breed;
    }
    public String getBreed() {
        return breed;
    }


    @Override
    public void makeSound(){
        System.out.println("Dog Barks");
    }

    @Override
    public void display(){
        System.out.println("Name :"+ name + "age : " +age + " breed :"+ breed);
    }
}
