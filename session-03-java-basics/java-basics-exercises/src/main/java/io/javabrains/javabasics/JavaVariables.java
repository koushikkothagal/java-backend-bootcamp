package io.javabrains.javabasics;

public class JavaVariables {

    public static void main(String[] args) {
        // Step 1: Declare and initialize variables of different data types
        // int variable to store an integer value
        int age=28;
        // long variable to store a long value
        long nooflikes=45781252485L;
        // float variable to store a floating-point value
        float decimal=3.14f;
        // double variable to store a double value
        double biggerdecimal=3.14784512;

        // char variable to store a single character
        char firstletter='a';

        // boolean variable to store a boolean value
        boolean isskyblue=true;

        // String variable to store a string of characters
        String name="samba";

        // Step 2: Print the values of the variables to the console
        System.out.println("age = " + age);
        System.out.println("name = " + name);
        System.out.println("nooflikes = " + nooflikes);
        System.out.println("firstletter = " + firstletter);
        System.out.println("isskyblue = " + isskyblue);
        System.out.println("biggerdecimal = " + biggerdecimal);
        System.out.println("decimal = " + decimal);

        // Step 3: Modify the values of the variables and print the updated values
        name = "Sambasiva Reddy Asam";
        System.out.println("name = " + name);
    }
}
