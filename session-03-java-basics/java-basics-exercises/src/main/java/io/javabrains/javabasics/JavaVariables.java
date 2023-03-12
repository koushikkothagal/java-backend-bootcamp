package io.javabrains.javabasics;

public class JavaVariables {

    public static void main(String[] args) {
        // Step 1: Declare and initialize variables of different data types
        // int variable to store an integer value
         int int_data = 10;
        // long variable to store a long value
         long long_data = 12345656767879L;
        // float variable to store a floating-point value
         float float_data = 3.14f;

        // double variable to store a double value
         double double_data = 1.732321;

        // char variable to store a single character
        char char_data = 'F';

        // boolean variable to store a boolean value
        boolean bool_data = true;

        // String variable to store a string of characters
        String str_data = "Hello everyone";

        // Step 2: Print the values of the variables to the console
        System.out.println("str_data = " + str_data);
        System.out.println("char_data = " + char_data);
        System.out.println("bool_data = " + bool_data);
        System.out.println("double_data = " + double_data);
        System.out.println("float_data = " + float_data);
        System.out.println("long_data = " + long_data);
        System.out.println("int_data = " + int_data);

        // Step 3: Modify the values of the variables and print the updated values
        str_data = "Bye Bye";
        System.out.println("str_data = " + str_data);
    }
}
