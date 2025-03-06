package io.javabrains.javabasics;

public class PrimitiveAndWrapperClasses {
    public static void main(String[] args) {
        // Step 1: Declare primitive variables
        int num=52;
        float decimal=3.14f;
        // Step 2: Convert primitive variables to wrapper objects
        Integer numobj = num;
        // Step 3: Print the values of the wrapper objects
        System.out.println("numobj = " + numobj);
        // Step 4: Convert wrapper objects back to primitive variables
        num = numobj;
        // Step 5: Print the values of the primitive variables
        System.out.println("num = " + numobj);
    }
}
