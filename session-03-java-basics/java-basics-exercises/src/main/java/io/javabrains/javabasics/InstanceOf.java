package io.javabrains.javabasics;

public class InstanceOf {

    public static void main(String[] args) {

        Object[] objects = {
                10,
                "Hello",
                true,
                20.5
        };

        // Challenge: Use instanceof to determine the type of each object in the array
        for (int x = 0; x < objects.length; x++){
            if (objects[x] instanceof Integer){
                System.out.println("Integer");
            } else if (objects[x] instanceof String){
                System.out.println("String");
            } else if (objects[x] instanceof Boolean){
                System.out.println("Boolean");
            } else if (objects[x] instanceof Double){
                System.out.println("Double");
            } else  {
                System.out.println("Other");
            }
        }
    }
}
