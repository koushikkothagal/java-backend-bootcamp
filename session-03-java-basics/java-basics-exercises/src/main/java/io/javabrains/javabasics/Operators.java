package io.javabrains.javabasics;

import java.util.ArrayList;
import java.util.List;

public class Operators {
    public static void main(String[] args) {
        // Step 1: Declare variables
        int a=5;
        int b=6;

        // Step 2: Perform arithmetic operations

        int sum=a+b;
        // Step 3: Print the results of the arithmetic operations
        System.out.println("sum = " + sum);

        // Step 4: Perform increment and decrement operations
        a++;
        b++;
        // Step 5: Print the results of the increment and decrement operations
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Step 6: Perform comparison operations

        boolean isagreater = a > b;
        boolean isbgreater = b > a;
        // Step 7: Print the results of the comparison operations

        System.out.println("isagreater = " + isagreater);
        System.out.println("isbgreater = " + isbgreater);
        // Step 8: Perform logical operations
        boolean notequal = isagreater || isbgreater;

        // Step 9: Print the results of the logical operations
        System.out.println("notequal = " + notequal);

    }
}
