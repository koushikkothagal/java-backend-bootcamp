package io.javabrains.javabasics;

/*
Create a class `Animal2` with an abstract method `makeSound`.
Create an anonymous inner class implementation of `Animal2` and then call the `makeSound` method
 */

public class AnonymousInnerClasses {
    static{
        System.out.println("Inside static block");
    }

    public static void main(String[] args) {
         Animal2 ani = new Animal2() {
            @Override
            public void makesound() {
                System.out.println("what does the dog say");
            }
        };

         ani.makesound();

         Products p = new Products() {

             float price =0;

             @Override
             public void setPrice(float price) {
                 this.price = price;
             }

             @Override
             public void getPrice() {
                 System.out.println("The price is " + price);
             }
             @Override
             public void display(){
                 System.out.println("Product sold : "+ prodName);
             }
         };

         p.setPrice(0.25f);
         p.display();
         p.getPrice();
    }



}
