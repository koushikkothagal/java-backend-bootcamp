package io.javabrains.javabasics;

public class Cat extends Animal {
    private int lives;
    public Cat(int lives, String name, int age){
        super(name, age);
        this.lives = lives;
    };

    public int getLives() {
        return lives;
    }
   @Override
    public void makeSound(){
       System.out.println("Cat goes Meow");
   }
    @Override
    public void display(){
        System.out.println("Name :"+ name + " age : " +age + " lives used :"+ lives);
    }
}
