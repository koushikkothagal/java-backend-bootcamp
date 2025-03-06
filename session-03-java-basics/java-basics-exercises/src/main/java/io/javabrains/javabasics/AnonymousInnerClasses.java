package io.javabrains.javabasics;

/*
Create a class `Animal2` with an abstract method `makeSound`.
Create an anonymous inner class implementation of `Animal2` and then call the `makeSound` method
 */

public class AnonymousInnerClasses {
    abstract static class Animal2 {
        abstract void makeSound();
    }
    public static void main(String[] args) {
        Animal2 obj = new Animal2() {
            @Override
            void makeSound() {
                System.out.println("Animals make sounds");
            }
        };
        obj.makeSound();

    }
}
