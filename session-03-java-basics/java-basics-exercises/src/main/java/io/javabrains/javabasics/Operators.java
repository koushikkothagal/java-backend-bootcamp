package io.javabrains.javabasics;

import java.util.ArrayList;
import java.util.List;

public class Operators {
    public static void main(String[] args) {
        // Step 1: Declare variables
        //ArrayList
        int x = 78;
        int y = 12;

        ArrayList<Integer> myIntList = new ArrayList<Integer>();

        // Step 2: Perform arithmetic operations
        int sum = x + y;
        int difference = x - y;
        int product = x * y;
        int quotient = x / y;
        int mod = x % y;

        // Step 3: Print the results of the arithmetic operations
        System.out.println(sum);
        System.out.println(difference);
        System.out.println(product);
        System.out.println(quotient);
        System.out.println(mod);

        // Step 4: Perform increment and decrement operations
        x++;
        y--;

        // Step 5: Print the results of the increment and decrement operations
        System.out.println(x);
        System.out.println(y);
        // Step 6: Perform comparison operations
        boolean comparison = x > y;
        boolean comparisonTwo = x < y;

        // Step 7: Print the results of the comparison operations
        System.out.println(comparison);
        System.out.println(comparisonTwo);

        // Step 8: Perform logical operations
        boolean notPrac = !true;
        boolean andPrac = true && false;
        boolean orPrac = false || true;

        // Step 9: Print the results of the logical operations
        System.out.println(notPrac);
        System.out.println(andPrac);
        System.out.println(orPrac);

    }
}
