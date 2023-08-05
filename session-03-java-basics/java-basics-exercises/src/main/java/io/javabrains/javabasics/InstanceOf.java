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
        for (Object o : objects){
            if (o instanceof Integer){
                System.out.println("Interger value is = " + o.toString());
            } else if ( o instanceof String){
                System.out.println("String value is = " + o.toString());
            } else if (o instanceof Boolean) {
                System.out.println("Boolean value is = " + o.toString());
            } else if ( o instanceof Double){
                System.out.println("Double value is = " + o.toString());
            }
        }
    }
}
