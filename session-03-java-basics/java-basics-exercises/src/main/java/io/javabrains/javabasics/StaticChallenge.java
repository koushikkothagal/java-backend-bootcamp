package io.javabrains.javabasics;

/*
Create a class `Rectangle` with the following attributes: `width`, `height`, and a static variable `numOfRectangles` which will keep track of the number of rectangles created.

1.  Create a constructor that takes the width and height as arguments and sets the values of the `width` and `height` instance variables.
2.  Create a method `getArea` that calculates and returns the area of the rectangle.
3.  Create a method `getPerimeter` that calculates and returns the perimeter of the rectangle.
4.  Create a method `getNumOfRectangles` that returns the value of the `numOfRectangles` static variable.
5.  In this main method, create several `Rectangle` objects, calculate and print their area and perimeter, and finally print the number of rectangles created without keeping count in this class.
 */
class Rectangle {
    private int width;
    private int height;
    private static int count;
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
        count++;
    }
    public int getArea() {
        return width * height;
    }
    public int getPerimeter() {
        return 2 * (width + height);
    }
    public static int getcount() {
        return count;
    }
}
public class StaticChallenge {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(5, 10);
        Rectangle r2 = new Rectangle(3, 7);
        Rectangle r3 = new Rectangle(8, 4);
        System.out.println("Rectangle 1 "+"\n"+"Area:"+r1.getArea()+",Perimeter:"+r1.getPerimeter());
        System.out.println("Rectangle 2 "+"\n"+"Area:"+r2.getArea()+",Perimeter:"+r2.getPerimeter());
        System.out.println("Rectangle 3 "+"\n"+"Area:"+r3.getArea()+",Perimeter:"+r3.getPerimeter());
        System.out.println("Number of rectangles created: " + Rectangle.getcount());
    }
}
