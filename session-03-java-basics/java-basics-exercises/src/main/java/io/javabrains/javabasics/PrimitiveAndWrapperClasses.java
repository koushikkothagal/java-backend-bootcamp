package io.javabrains.javabasics;

public class PrimitiveAndWrapperClasses {
    public static void main(String[] args) {
        // Step 1: Declare primitive variables
        int a = 10;
        // Step 2: Convert primitive variables to wrapper objects
        Integer b = a;
        // Step 3: Print the values of the wrapper objects
        System.out.println("b = " + b);
        // Step 4: Convert wrapper objects back to primitive variables
        int c = b;
        // Step 5: Print the values of the primitive variables
        System.out.println("c = " + c);
    }
}
