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
        for (Object obj : objects) {
            String objectType = determineObjectType(obj);
            System.out.println(obj + " is of type " + objectType + ".");
        }
    }

    private static String determineObjectType(Object obj) {
        if (obj instanceof Integer) {
            return "Integer";
        } else if (obj instanceof String) {
            return "String";
        } else if (obj instanceof Boolean) {
            return "Boolean";
        } else if(obj instanceof Double){
            return "Double";
        }
        return "undetermined";
    }



}
