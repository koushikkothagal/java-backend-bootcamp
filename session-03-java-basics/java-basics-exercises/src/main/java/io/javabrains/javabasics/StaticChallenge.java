package io.javabrains.javabasics;

import org.w3c.dom.css.Rect;

/*
Create a class `Rectangle` with the following attributes: `width`, `height`, and a static variable `numOfRectangles` which will keep track of the number of rectangles created.
1.  Create a constructor that takes the width and height as arguments and sets the values of the `width` and `height` instance variables.
2.  Create a method `getArea` that calculates and returns the area of the rectangle.
3.  Create a method `getPerimeter` that calculates and returns the perimeter of the rectangle.
4.  Create a method `getNumOfRectangles` that returns the value of the `numOfRectangles` static variable.
5.  In this main method, create several `Rectangle` objects, calculate and print their area and perimeter, and finally print the number of rectangles created without keeping count in this class.
 */
class Rectangle{
    int wi,he;
    static int n;
    Rectangle(){}
    Rectangle(int w,int h){
        this.wi=w;this.he=h;
    }
    int area(int w,int h){
        return w*h;
    }
    int perimeter(int w,int h){
        return 2*(w+h);
    }
    void noOfRectangles(int w,int h){
        n+=(w*(w+1)*h*(h+1))/4;
    }
}
public class StaticChallenge {
    public static void main(String[] args) {
        Rectangle obj=new Rectangle();
        Rectangle []r=new Rectangle[5];
        for(int i=0;i<4;i++){
            r[0]=new Rectangle(1,2);
            System.out.println("Area: "+obj.area(i+1,i+2)+'\n'+"Perimeter: "+obj.perimeter(i+1,i+2)+'\n');
            obj.noOfRectangles(i+1,i+2);
        }
        System.out.println("Number of Rectangles: "+Rectangle.n);
    }
}
