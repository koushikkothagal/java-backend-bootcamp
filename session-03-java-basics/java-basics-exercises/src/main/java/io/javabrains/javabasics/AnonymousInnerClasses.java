package io.javabrains.javabasics;

/*
Create a class `Animal2` with an abstract method `makeSound`.
Create an anonymous inner class implementation of `Animal2` and then call the `makeSound` method
 */
class Animal2{
    public void makeSound(){
        System.out.println("MEOW");
    }
}
public class AnonymousInnerClasses {
    public static void main(String[] args) {
       Animal2 obj=new Animal2();
        obj.makeSound();
    }
}
