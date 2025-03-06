package io.javabrains.javabasics;

/*
Create a class `Rectangle` with the following attributes: `width`, `height`, and a static variable `numOfRectangles` which will keep track of the number of rectangles created.

1.  Create a constructor that takes the width and height as arguments and sets the values of the `width` and `height` instance variables.
2.  Create a method `getArea` that calculates and returns the area of the rectangle.
3.  Create a method `getPerimeter` that calculates and returns the perimeter of the rectangle.
4.  Create a method `getNumOfRectangles` that returns the value of the `numOfRectangles` static variable.
5.  In this main method, create several `Rectangle` objects, calculate and print their area and perimeter, and finally print the number of rectangles created without keeping count in this class.
 */

import org.w3c.dom.css.Rect;

public class StaticChallenge {
    public static class Rectangle { // best practice to make this inner class static
        int width;
        int height;
        static int numOfRectangles=0;

        Rectangle(int width, int height) {
            numOfRectangles++;
            this.width=width;
            this.height=height;
        }

        int getArea() {
            return width*height;
        }

        int getPerimeter() {
            return 2*(width+height);
        }

        static int getNumOfRectangles() {// best practice to make htis method static
            return numOfRectangles;
        }

    }
    public static void main(String[] args) {

        Rectangle R1 = new Rectangle(1,2); // since the rectangle class is inside the StaticChallenge class
        Rectangle R2 = new Rectangle(4,5); // you can not directly create the object of Rectangle without creating the main class object
        Rectangle R3 = new Rectangle(5,5);

        System.out.println("area of first rectangle: " + R1.getArea());
        System.out.println("perimeter of the rectangle: " + R1.getPerimeter());
        System.out.println("no of rectangles created: " + Rectangle.getNumOfRectangles());



    }
}
