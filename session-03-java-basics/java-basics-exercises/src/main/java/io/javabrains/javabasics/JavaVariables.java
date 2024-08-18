package io.javabrains.javabasics;

public class JavaVariables {

    public static void main(String[] args) {
        // Step 1: Declare and initialize variables of different data types
        // int variable to store an integer value

        int var = 5;
        // long variable to store a long value

        long x = 1234567898L;

        // float variable to store a floating-point value

        float f= 2.718f;

        // double variable to store a double value

        double d = 1.23456;

        // char variable to store a single character

        char ch = 'A';

        // boolean variable to store a boolean value

        boolean b = true;

        // String variable to store a string of characters
String str = "Hello World";

        // Step 2: Print the values of the variables to the console

        System.out.println(var +" " + x + " "+ f +" "+ d + " " + ch +" "+ b +" "+ str);

        // Step 3: Modify the values of the variables and print the updated values

        var +=  var;
        x += x;
        f += f;
        d = d+f;
        ch = 's';
        b = false;
        System.out.println(var +" " + x + " "+ f +" "+ d + " " + ch +" "+ b +" "+ str);

    }
}
