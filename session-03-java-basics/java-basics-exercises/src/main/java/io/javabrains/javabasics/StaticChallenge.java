package io.javabrains.javabasics;

/*
Create a class `Rectangle` with the following attributes: `width`, `height`, and a static variable `numOfRectangles` which will keep track of the number of rectangles created.

1.  Create a constructor that takes the width and height as arguments and sets the values of the `width` and `height` instance variables.
2.  Create a method `getArea` that calculates and returns the area of the rectangle.
3.  Create a method `getPerimeter` that calculates and returns the perimeter of the rectangle.
4.  Create a method `getNumOfRectangles` that returns the value of the `numOfRectangles` static variable.
5.  In this main method, create several `Rectangle` objects, calculate and print their area and perimeter, and finally print the number of rectangles created without keeping count in this class.
 */
class Rectangle{
    int width;
    int height;
    static int numOfRectangles;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
        numOfRectangles++;
    }
    int getArea(){
        return width*height;
    }
    int getPerimeter(){
        return 2*(width+height);
    }
    static int getNumOfRectangles(){
        return numOfRectangles;
    }
}
public class StaticChallenge {

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(10,20);
        Rectangle rectangle2= new Rectangle(15,25);
        System.out.println("rectangle1 Area = " + rectangle1.getArea());
        System.out.println("rectangle2 Area = " + rectangle2.getArea());
        System.out.println("rectangle1 perimeter = " + rectangle1.getPerimeter());
        System.out.println("rectangle2 perimeter = " + rectangle2.getPerimeter());
        System.out.println("No Of Rectangles = " +Rectangle.getNumOfRectangles());
    }
}

