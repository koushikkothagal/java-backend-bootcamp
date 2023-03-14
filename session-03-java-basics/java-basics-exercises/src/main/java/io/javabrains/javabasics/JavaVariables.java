package io.javabrains.javabasics;

public class JavaVariables {

    public static void main(String[] args) {
        // Step 1: Declare and initialize variables of different data types
        // int variable to store an integer value
        int intVar = 123;
        // long variable to store a long value
        long longVar = 123456L;
        // float variable to store a floating-point value
        float floatVar = 123.45f;

        // double variable to store a double value
        double doubleVar = 12.34567;

        // char variable to store a single character
        char charVar = 'A';

        // boolean variable to store a boolean value
        boolean booleanVar = true;

        // String variable to store a string of characters
        String str = "My name is ...";

        // Step 2: Print the values of the variables to the console
        System.out.println("int Variable = " + intVar);
        System.out.println("long Variable = " + longVar);
        System.out.println("float Variable = " + floatVar);
        System.out.println("double Variable = " + doubleVar);
        System.out.println("char Variable = " + charVar);
        System.out.println("boolean Variable = " + booleanVar);
        System.out.println("string = " + str);

        // Step 3: Modify the values of the variables and print the updated values

        intVar = 45;
        longVar = 987654321L;
        floatVar = 45.67f;
        doubleVar = 97865.1234;
        charVar = 'z';
        booleanVar = false;
        str = "Ohh no the string variable is changed now";
        System.out.println("\n\nMODIFIED VALUES");
        System.out.println("int Variable = " + intVar);
        System.out.println("long Variable = " + longVar);
        System.out.println("float Variable = " + floatVar);
        System.out.println("double Variable = " + doubleVar);
        System.out.println("char Variable = " + charVar);
        System.out.println("boolean Variable = " + booleanVar);
        System.out.println("string = " + str);

    }
}
