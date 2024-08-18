package io.javabrains.javabasics;

public class Rectangle {
    static int numOfRectangles;
    private double height;
    private double width;
    public Rectangle(double length, double width) {
        this.height = length;
        this.width = width;
    }

    public double geArea() {
        return height * width;
    }
    public double getPerimeter() {
        return 2 * height;
    }
    public void setNumOfRectangles(){
        numOfRectangles++;
    }


    public int getNumberOfRectangles() {
        int numberOfRectangles = numOfRectangles;
        return numberOfRectangles;
    }

    public void display(){
        System.out.println("The Rectangle :area  " + geArea() + " \n perimeter " + getPerimeter() );
    }

}
