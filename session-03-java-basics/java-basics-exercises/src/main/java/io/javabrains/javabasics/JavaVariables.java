package io.javabrains.javabasics;

public class JavaVariables {

    public static void main(String[] args) {
        // Step 1: Declare and initialize variables of different data types
        // int variable to store an integer value
        int myInt = -34;
        // long variable to store a long value
        long myLong = 782L;
        // float variable to store a floating-point value
        float myFloat = 3.14f;

        // double variable to store a double value
        double myDouble = 2.123123123;

        // char variable to store a single character
        char myChar = 'S';

        // boolean variable to store a boolean value
        boolean inTheMatrix = true;

        // String variable to store a string of characters
        String myString = "I'm an idiot";

        // Step 2: Print the values of the variables to the console
        System.out.println(myInt);
        System.out.println(myLong);
        System.out.println(myFloat);
        System.out.println(myDouble);
        System.out.println(myChar);
        System.out.println(inTheMatrix);
        System.out.println(myString);

        // Step 3: Modify the values of the variables and print the updated values
        myInt = 0;
        myLong = 99999999999999999L;
        myFloat = 2.17f;
        myDouble = -0.92638;
        myChar = 'a';
        inTheMatrix = false;
        myString = "I'm an idiot... sometimes";

        System.out.println(myInt);
        System.out.println(myLong);
        System.out.println(myFloat);
        System.out.println(myDouble);
        System.out.println(myChar);
        System.out.println(inTheMatrix);
        System.out.println(myString);
    }
}
