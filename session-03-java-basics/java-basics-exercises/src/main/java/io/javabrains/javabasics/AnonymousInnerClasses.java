package io.javabrains.javabasics;
/*
Create a class `Animal2` with an abstract method `makeSound`.
Create an anonymous inner class implementation of `Animal2` and then call the `makeSound` method
 */
abstract class Animal2{
    abstract void makeSound();
}
class AnonymousInnerClasses extends Animal2{
    void makeSound(){
        System.out.println("Done");
    }
    public static void main(String[] args) {
        Animal2 obj=new Animal2(){
            void makeSound(){
                System.out.println("Inner class");
            }
        };
        obj.makeSound();
    }
}
