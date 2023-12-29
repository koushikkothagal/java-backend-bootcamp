package io.javabrains.javabasics;

public class JavaVariables {

    public static void main(String[] args) {
        // Step 1: Declare and initialize variables of different data types
        // int variable to store an integer value
        int age = 30;

        // long variable to store a long value
        long gangum = 98987678676776667L;

        // float variable to store a floating-point value
        float number = 3.14f;

        // double variable to store a double value
        double biggerDecimal = 3.145656567;

        // char variable to store a single character
        char firstLetter = 'a';

        // boolean variable to store a boolean value
        boolean isSkyBlue = true;

        // String variable to store a string of characters
        String name = "JOel Khan";


        // Step 2: Print the values of the variables to the console
        System.out.println("age: "+age);
        System.out.println("name "+name);
        System.out.println("gangum "+gangum);
        System.out.println("number: "+number );
        System.out.println("biggerDecimal: "+biggerDecimal);
        System.out.println("firstLetter: "+firstLetter);
        System.out.println("isSkyBlue: "+isSkyBlue);
        System.out.println("name: "+name);

        // Step 3: Modify the values of the variables and print the updated values
        name = "Joel";
        System.out.println("name = " + name);

    }
}
