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
        // boxing and unboxing

        for(Object obj : objects){ // going through Array
        if(obj instanceof Integer) {
            System.out.println(obj.toString() + " is an integer");
        }
        else if(obj instanceof String) {

        System.out.println(obj.toString() + " is a string");
        }
        else if(obj instanceof Boolean) {
            System.out.println(obj.toString() + " is a boolean");
        }
        else if(obj instanceof Double) {
            System.out.println(obj.toString() + " is a double");
        }
        }
    }
}
