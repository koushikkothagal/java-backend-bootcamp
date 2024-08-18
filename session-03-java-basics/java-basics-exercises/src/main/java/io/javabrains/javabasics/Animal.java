package io.javabrains.javabasics;

public class Animal {

    public String name;
    public int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void makeSound(){

    }

    public void display(){
        System.out.println("Animal Name: " + name);
    }
}
