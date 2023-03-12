package io.javabrains.javabasics;

import java.util.ArrayList;
import java.util.List;

public class Operators {
    public static void main(String[] args) {
        // Step 1: Declare variables
        int num1 = 10,num2 = 20;

        // Step 2: Perform arithmetic operations
        int sum = num1+num2;

        // Step 3: Print the results of the arithmetic operations
        System.out.println("sum = " + sum);

        // Step 4: Perform increment and decrement operations
        int inc = sum++;
        int dec = sum--;

        // Step 5: Print the results of the increment and decrement operations
        System.out.println("increment = " + inc);
        System.out.println("decrement = " + dec);

        // Step 6: Perform comparison operations
        boolean comp = num1 >= num2;
        // Step 7: Print the results of the comparison operations
        System.out.println("comparing = " + comp);

        // Step 8: Perform logical operations
        if(num2>0 && num1>0) comp = true;
        else comp = false;

        // Step 9: Print the results of the logical operations
        System.out.println("logical result = " + comp);

    }
}
