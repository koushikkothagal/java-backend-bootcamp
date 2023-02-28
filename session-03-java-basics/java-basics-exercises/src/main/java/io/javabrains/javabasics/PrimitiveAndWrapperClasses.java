package io.javabrains.javabasics;

public class PrimitiveAndWrapperClasses {
    public static void main(String[] args) {
        // Step 1: Declare primitive variables
          int age=20;
        // Step 2: Convert primitive variables to wrapper objects
          Integer ageobject=age;
        // Step 3: Print the values of the wrapper objects
         System.out.println("age object = "+ageobject);
        // Step 4: Convert wrapper objects back to primitive variables
         age=ageobject;
        // Step 5: Print the values of the primitive variables
        System.out.print("age = "+age);
    }
}
