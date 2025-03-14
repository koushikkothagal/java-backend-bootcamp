package io.javabrains.javabasics;

public class PrimitiveAndWrapperClasses {
    public static void main(String[] args) {
        // Step 1: Declare primitive variables
        int basicInt = 21;
        boolean basicBool = false;

        // Step 2: Convert primitive variables to wrapper objects
        Integer objInt = basicInt;
        Boolean objBool = basicBool;

        // Step 3: Print the values of the wrapper objects
        System.out.println(basicInt);
        System.out.println(basicBool);

        // Step 4: Convert wrapper objects back to primitive variables
        int newBasicInt = objInt;
        boolean newBasicBool = objBool;

        // Step 5: Print the values of the primitive variables
        System.out.println(newBasicInt);
        System.out.println(newBasicBool);
    }
}
