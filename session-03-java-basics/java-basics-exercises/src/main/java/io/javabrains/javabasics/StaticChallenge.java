package io.javabrains.javabasics;

/*
Create a class `Rectangle` with the following attributes: `width`, `height`, and a static variable `numOfRectangles` which will keep track of the number of rectangles created.

1.  Create a constructor that takes the width and height as arguments and sets the values of the `width` and `height` instance variables.
2.  Create a method `getArea` that calculates and returns the area of the rectangle.
3.  Create a method `getPerimeter` that calculates and returns the perimeter of the rectangle.
4.  Create a method `getNumOfRectangles` that returns the value of the `numOfRectangles` static variable.
5.  In this main method, create several `Rectangle` objects, calculate and print their area and perimeter, and finally print the number of rectangles created without keeping count in this class.
 */

import java.util.ArrayList;

public class StaticChallenge {

    public static void main(String[] args) {

        ArrayList<Rectangle> rectangles = new ArrayList<Rectangle>();
        rectangles.add(new Rectangle(2,3));
        rectangles.add(new Rectangle(4,5));
        rectangles.add(new Rectangle(6,7));
        rectangles.add(new Rectangle(8,9));
        rectangles.add(new Rectangle(10,11));
        rectangles.add(new Rectangle(12,13));
        rectangles.add(new Rectangle(14,15));
        rectangles.add(new Rectangle(16,17));
        rectangles.add(new Rectangle(18,19));
        rectangles.add(new Rectangle(20,21));
        rectangles.add(new Rectangle(22,23));

        for(Rectangle rectangle : rectangles){
            rectangle.display();
            rectangle.setNumOfRectangles();

            System.out.println("Number of Rectangles :" + rectangle.getNumberOfRectangles());
        }

    }
}
