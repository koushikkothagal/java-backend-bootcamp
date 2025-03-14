package io.javabrains.javabasics;

public class ObjectOriented {
    public static class Rectangle {
        int length, width;

        public Rectangle(int length, int width){
            this.length = length;
            this.width = width;
        }

        public int area(){
            return length*width;
        }
    }

    public static void main(String[] args) {
        Rectangle myRect = new Rectangle(5, 11);
        System.out.println(myRect.area());
    }
}

