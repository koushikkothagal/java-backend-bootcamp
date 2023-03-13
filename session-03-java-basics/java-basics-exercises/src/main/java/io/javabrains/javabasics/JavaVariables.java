ppackage io.javabrains.javabasics;

public class JavaVariables {

    public static void main(String[] args) {
        // Step 1: Declare and initialize variables of different data types
        // int variable to store an integer value
        int intNumber=10;
        // long variable to store a long value
        long longNumber=20L;
        // float variable to store a floating-point value
        float floatNumber=20.2f;


        // double variable to store a double value
        double doubleNumber=201.23;

        // char variable to store a single character
        char ch='A';

        // boolean variable to store a boolean value
        boolean boolenValue=true;

        // String variable to store a string of characters
        String str="Pavan";

        // Step 2: Print the values of the variables to the console
        System.out.println("intNumber = " + intNumber);
        System.out.println("longNumber = " + longNumber);
        System.out.println("floatNumber = " + floatNumber);
        System.out.println("doubleNumber = " + doubleNumber);
        System.out.println("ch = " + ch);
        System.out.println("str = " + str);
        System.out.println("boolenValue = " + boolenValue);

        // Step 3: Modify the values of the variables and print the updated values
        str="Sai Pavan";
        intNumber=23;
        System.out.println("str = " + str);
        System.out.println("intNumber = " + intNumber);

    }
}

