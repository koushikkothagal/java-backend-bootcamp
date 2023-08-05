package io.javabrains.javabasics;

import java.util.ArrayList;
import java.util.List;

public class Operators {
    public static void main(String[] args) {
        // Step 1: Declare variables
        //ArrayList
        int num1 = 10;
        int num2 = 20;

        // Step 2: Perform arithmetic operations
        int sum  = num1 + num2;

        // Step 3: Print the results of the arithmetic operations
        System.out.println("sum = "+ sum);

        // Step 4: Perform increment and decrement operations
        num1++;
        num2--;

        // Step 5: Print the results of the increment and decrement operations
        System.out.println("Increment = "+ num1);
        System.out.println("Decrement = "+ num2);

        // Step 6: Perform comparison operations
        boolean isGreater = num2 > num1;

        // Step 7: Print the results of the comparison operations
        System.out.println("Greater number is = "+ isGreater + " value is = "+ ( (num2>num1) ? num2 : num1) );

        // Step 8: Perform logical operations


        // Step 9: Print the results of the logical operations


    }
}
