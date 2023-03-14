package io.javabrains.javabasics;

public class PrimitiveAndWrapperClasses {
    public static void main(String[] args) {
        // Step 1: Declare primitive variables
        int val = 10;
        // Step 2: Convert primitive variables to wrapper objects
        Integer valWrapperObject = val;
        // Step 3: Print the values of the wrapper objects
        System.out.println("Wrapper Object Value = " + valWrapperObject);
        // Step 4: Convert wrapper objects back to primitive variables
        val = valWrapperObject;
        // Step 5: Print the values of the primitive variables
        System.out.println("Primitive variable Value = " + val);
    }
}
