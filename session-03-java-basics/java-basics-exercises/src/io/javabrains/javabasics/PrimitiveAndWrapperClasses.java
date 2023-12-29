package io.javabrains.javabasics;

public class PrimitiveAndWrapperClasses {
    public static void main(String[] args) {
        // Step 1: Declare primitive variables
        int age = 28;

        // Step 2: Convert primitive variables to wrapper objects
        Integer ageObj = age;

        // Step 3: Print the values of the wrapper objects
        System.out.println("ageObj: "+ageObj);

        // Step 4: Convert wrapper objects back to primitive variables
        age = ageObj;

        // Step 5: Print the values of the primitive variables
        System.out.println("age = " + age);
    }
}
