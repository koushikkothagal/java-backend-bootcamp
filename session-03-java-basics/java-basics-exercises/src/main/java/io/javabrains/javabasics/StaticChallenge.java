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
    	Rectangle rec1=new  Rectangle(4,5);
    	Rectangle rec2=new  Rectangle(5,5.5);
    	Rectangle rec3=new  Rectangle(7,10);
    	Rectangle rec4=new  Rectangle(20,30);
    	System.out.println("Area: "+rec1.getArea()+" Perimeter: "+ rec1.getPerimeter()); 
    	System.out.println("Area: "+rec2.getArea()+" Perimeter: "+ rec2.getPerimeter());
    	System.out.println("Area: "+rec3.getArea()+" Perimeter: "+ rec3.getPerimeter());
    	System.out.println("Area: "+rec4.getArea()+" Perimeter: "+ rec4.getPerimeter());
    	System.out.println(rec1.getNumOfRectangles());

    }
}
class Rectangle{
	double width;
	double height;
	static int numOfRectangles=0;
	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
		++numOfRectangles;
	}
	double getArea() {
		return this.height*this.height;
	}
	double getPerimeter() {
		return (this.height*2)+(this.width*2);
	}
	int getNumOfRectangles() {
		return numOfRectangles;
	}
}
