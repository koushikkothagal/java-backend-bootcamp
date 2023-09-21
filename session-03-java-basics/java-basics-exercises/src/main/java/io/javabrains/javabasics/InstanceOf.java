package io.javabrains.javabasics;

import java.util.Arrays;

public class InstanceOf {

    public static void main(String[] args) {

        Object[] objects = {
                10,
                "Hello",
                true,
                20.5
        };

        // Challenge: Use instanceof to determine the type of each object in the array
        for(Object obj : objects){
            if(obj instanceof Integer){
                System.out.println(obj + " is an Integer");
            }else if(obj instanceof String){
                System.out.println(obj + " is a String");
            } else if (obj instanceof Boolean) {
                System.out.println(obj + " is a Boolean");
            } else if (obj instanceof Double) {
                System.out.println(obj+" is a Double");
            }
        }
    }
}
