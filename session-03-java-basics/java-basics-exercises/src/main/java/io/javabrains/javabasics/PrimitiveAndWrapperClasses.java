package io.javabrains.javabasics;

public class PrimitiveAndWrapperClasses {
    public static void main(String[] args) {
        // Step 1: Declare primitive variables
        int primitiveInt=10;
        float primitiveFloat=201.f;
        // Step 2: Convert primitive variables to wrapper objects
        Integer integer= primitiveInt;
        Float floatingValue=primitiveFloat;
        // Step 3: Print the values of the wrapper objects
        System.out.println("Values for the Wrapper objects");
        System.out.println("integer = " + integer);
        System.out.println("floatingValue = " + floatingValue);
        // Step 4: Convert wrapper objects back to primitive variables
        primitiveInt=integer;
        primitiveFloat=floatingValue;

        // Step 5: Print the values of the primitive variables
        System.out.println("Values for the primitive variables");
        System.out.println("primitiveInt = " + primitiveInt);
        System.out.println("primitiveFloat = " + primitiveFloat);
    }
}
