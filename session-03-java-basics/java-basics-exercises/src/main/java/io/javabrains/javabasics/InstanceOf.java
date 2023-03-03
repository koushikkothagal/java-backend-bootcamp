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
       for(Object a:objects){
        if(a instanceof Integer){
            System.out.println(a+" is an integer.");
        }
        else if(a instanceof String){
            System.out.println(a+" is a string.");
        }
        else if( a instanceof Boolean){
            System.out.println(a+" is a Boolean.");
        }
        else if(a instanceof Double){
            System.out.println(a+" is a Double.");
        }
       }
    }
}
