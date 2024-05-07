package io.javabrains.javabasics;

import java.util.ArrayList;
import java.util.List;

public class Operators {
    public static void main(String[] args) {
        // Step 1: Declare variables
            int a = 30;
            int b = 20;

        // Step 2: Perform arithmetic operations
            int sum = a+b;
            int sub = a-b;
            

        // Step 3: Print the results of the arithmetic operations
        System.out.println("sub = " + sub);

        // Step 4: Perform increment and decrement operations
                a++;
                b--;

        // Step 5: Print the results of the increment and decrement operations
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Step 6: Perform comparison operations
            boolean comp = a==b;

        // Step 7: Print the results of the comparison operations
        System.out.println("comp = " + comp);

        // Step 8: Perform logical operations
            boolean l = a!=b && b==b ? true : false;

        // Step 9: Print the results of the logical operations
        System.out.println("l = " + l);

    }
}
