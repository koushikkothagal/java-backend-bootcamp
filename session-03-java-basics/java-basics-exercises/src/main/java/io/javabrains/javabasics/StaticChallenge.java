package io.javabrains.javabasics;

/*
Create a class `Rectangle` with the following attributes: `width`, `height`, and a static variable `numOfRectangles` which will keep track of the number of rectangles created.

1.  Create a constructor that takes the width and height as arguments and sets the values of the `width` and `height` instance variables.
2.  Create a method `getArea` that calculates and returns the area of the rectangle.
3.  Create a method `getPerimeter` that calculates and returns the perimeter of the rectangle.
4.  Create a method `getNumOfRectangles` that returns the value of the `numOfRectangles` static variable.
5.  In this main method, create several `Rectangle` objects, calculate and print their area and perimeter, and finally print the number of rectangles created without keeping count in this class.
 */

import java.lang.constant.Constable;

class Rectangle {
    int height ,width;
    static  int numOfRectangle;
    public Rectangle(){

    }
    public Rectangle(int h,int w){
        this.height=h;
        this.width=w;
        numOfRectangle+=1;//increaments value every time when object intialization occurs;
    }
    public int getArea(){
        int v=(height*width);
        return v;
    }
    public int getPerimeter(){
        return (2*(this.height+this.width));
    }

}
public class StaticChallenge {

    public static void main(String[] args) {
        Rectangle a1=new Rectangle ( 2,3);
        Rectangle a2=new Rectangle ( 3,5 );
        System.out.println("The area a1 and a2 rectangle is");
        System.out.println( a1.getArea ()+"\n"+a2.getArea ());
        System.out.println("Perimeter of two rectangles is ");
        System.out.println ( a1.getPerimeter ()+"\n"+a2.getPerimeter ());
        System.out.println("number of rectangles created is "+a1.numOfRectangle);

    }
}
