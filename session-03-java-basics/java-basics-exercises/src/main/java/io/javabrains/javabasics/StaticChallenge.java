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
        //In this main method, create several `Rectangle` objects, calculate and print their area and perimeter,
        // and finally print the number of rectangles created without keeping count in this class.

        Rectangle r1 = new Rectangle(2,4);
        System.out.println("Area of r1 = "+ r1.getArea() + ", Perimeter of r1 = "+ r1.getPerimeter());
        Rectangle r2 = new Rectangle(4,8);
        System.out.println("Area of r2 = "+ r2.getArea() + ", Perimeter of r2 = "+ r2.getPerimeter());
        Rectangle r3 = new Rectangle(6,12);
        System.out.println("Area of r3 = "+ r3.getArea() + ", Perimeter of r3 = "+ r3.getPerimeter());
        Rectangle r4 = new Rectangle(8,16);
        System.out.println("Area of r4 = "+ r4.getArea() + ", Perimeter of r4 = "+ r4.getPerimeter());

        System.out.println("Number of rectangles = " + r1.getNumOfRectangles());
    }
}

//Create a class `Rectangle` with the following attributes: `width`, `height`, and a static variable `numOfRectangles`
// which will keep track of the number of rectangles created.
class Rectangle {
    private int width;
    private int height;

    public static int numOfRectangles = 0;

    //Create a constructor that takes the width and height as arguments and sets the values of the `width` and `height` instance variables.
    Rectangle(int width, int height){
        this.width = width;
        this.height = height;
        numOfRectangles += 1;
    }

    //Create a method `getArea` that calculates and returns the area of the rectangle.
    public int getArea(){
        return this.width * this.height;
    }

    //Create a method `getPerimeter` that calculates and returns the perimeter of the rectangle.
    public int getPerimeter(){
        return 2 * (this.width * this.height);
    }

    //Create a method `getNumOfRectangles` that returns the value of the `numOfRectangles` static variable.
    public int getNumOfRectangles(){
        return numOfRectangles;
    }
}