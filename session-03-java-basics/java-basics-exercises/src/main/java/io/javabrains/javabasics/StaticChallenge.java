package io.javabrains.javabasics;

/*
Create a class `Rectangle` with the following attributes: `width`, `height`, and a static variable `numOfRectangles` which will keep track of the number of rectangles created.

1.  Create a constructor that takes the width and height as arguments and sets the values of the `width` and `height` instance variables.
2.  Create a method `getArea` that calculates and returns the area of the rectangle.
3.  Create a method `getPerimeter` that calculates and returns the perimeter of the rectangle.
4.  Create a method `getNumOfRectangles` that returns the value of the `numOfRectangles` static variable.
5.  In this main method, create several `Rectangle` objects, calculate and print their area and perimeter, and finally print the number of rectangles created without keeping count in this class.
 */

public class StaticChallenge {
    public static void main(String[] args) {
        class Rectangle {
            static int numOfRectangles = 0;
            int width, height;

            public Rectangle(int width, int height) {
                this.width = width;
                this.height = height;
                numOfRectangles++;
            }

            public int getArea() {
                return width * height;
            }

            public int getPerimeter() {
                return 2 * (width + height);
            }

            public int getNumOfRectangles() {
                return numOfRectangles;
            }
        }
            Rectangle firstRect = new Rectangle(5, 10);
            Rectangle secondRect = new Rectangle(2, 6);

            System.out.println("First area: " + firstRect.getArea());
            System.out.println("First perimeter: " + firstRect.getPerimeter());

            System.out.println("Second area: " + secondRect.getArea());
            System.out.println("Second perimeter: " + secondRect.getPerimeter());

            System.out.println("Total Rectangles: " + Rectangle.numOfRectangles);
    }
}
