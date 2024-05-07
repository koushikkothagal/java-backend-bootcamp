package io.javabrains.javabasics;

/*
Create a class `Animal2` with an abstract method `makeSound`.
Create an anonymous inner class implementation of `Animal2` and then call the `makeSound` method
 */

abstract class Animal2{
    abstract void makesound();
}
public class AnonymousInnerClasses {
    public static void main(String[] args) {
        Animal2 cat = new Animal2(){
           @Override
            public void makesound(){
                System.out.println("meow");

            }
        };
        cat.makesound();

        Animal2 dog = new Animal2(){
            @Override
            public void makesound(){
                System.out.println("bow");

            }
        };
        dog.makesound();


    }
}
