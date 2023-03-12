package io.javabrains.javabasics;

public class PrimitiveAndWrapperClasses {
    public static void main(String[] args) {
        // Step 1: Declare primitive variables
        int num = 10;
        // Step 2: Convert primitive variables to wrapper objects
        Integer objnum = Integer.parseInt(String.valueOf(num));
        // Step 3: Print the values of the wrapper objects
        System.out.println("object number = " + objnum);
        // Step 4: Convert wrapper objects back to primitive variables
        int int_num = objnum;
        // Step 5: Print the values of the primitive variables
        System.out.println("primitive number = " + int_num);
    }
}
