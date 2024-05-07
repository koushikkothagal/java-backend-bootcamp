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
    static int noOfRectangles=0;

    Rectangle(int width,int height){
        this.width=width;
        this.height=height;
        noOfRectangles++;
    }
    public int getArea(){
        return this.width*this.height;
    }
    public int getPerimeter(){
        return 2*(this.width+this.height);
    }
    static int getNoOfRectangles(){
        return  noOfRectangles;
    }
}
public class StaticChallenge {

    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(10,20);
        Rectangle rect2 = new Rectangle(30,20);

        System.out.println("rect1.getArea() = " + rect1.getArea());
        System.out.println("rect1.getPerimeter() = " + rect1.getPerimeter());

        System.out.println("rect2.getArea() = " + rect2.getArea());
        System.out.println("rect2.getPerimeter() = " + rect2.getPerimeter());

        System.out.println(Rectangle.getNoOfRectangles());

    }
}
