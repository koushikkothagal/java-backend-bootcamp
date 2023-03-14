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
        Rectangle rec1 = new Rectangle(2, 5);
        Rectangle rec2 = new Rectangle(2.2, 5.2);
        Rectangle rec3 = new Rectangle(10, 5);
        Rectangle rec4 = new Rectangle(10.5, 5.5);
        System.out.println("Rectangle 1 : Area = " + rec1.getArea() + ", Perimeter = " + rec1.getPerimeter());
        System.out.println("Rectangle 2 : Area = " + rec2.getArea() + ", Perimeter = " + rec2.getPerimeter());
        System.out.println("Rectangle 3 : Area = " + rec3.getArea() + ", Perimeter = " + rec3.getPerimeter());
        System.out.println("Rectangle 4 : Area = " + rec4.getArea() + ", Perimeter = " + rec4.getPerimeter());
        System.out.println("Total no of Rectangles created = " + Rectangle.getNumOfRectangles());
    }
}

class Rectangle {
    private double width;
    private double height;
    static int numOfRectangles;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
        numOfRectangles++;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return (2 * (this.width + this.height));
    }

    public static int getNumOfRectangles() {
        return numOfRectangles;
    }

}
