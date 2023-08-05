package io.javabrains.javabasics;

public class PrimitiveAndWrapperClasses {
    public static void main(String[] args) {
        // Step 1: Declare primitive variables
        int age = 28;
        float pi = 3.14f;


        // Step 2: Convert primitive variables to wrapper objects
        Integer ageValue = age;
        Float piValue = pi;

        // Step 3: Print the values of the wrapper objects
        System.out.println("ageValue : "+ ageValue);
        System.out.println("piValue : "+ piValue);

        // Step 4: Convert wrapper objects back to primitive variables
        int ageInt = ageValue;
        float piFloat = piValue;

        // Step 5: Print the values of the primitive variables
        System.out.println("ageInt : "+ ageInt);
        System.out.println("piFloat : "+ piFloat);


    }
}
