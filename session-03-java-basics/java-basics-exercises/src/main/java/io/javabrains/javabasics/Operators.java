package io.javabrains.javabasics;

import java.util.ArrayList;
import java.util.List;

public class Operators {
    public static void main(String[] args) {
        // Step 1: Declare variables
        int a=20;
        int b=3;

        // Step 2: Perform arithmetic operations
        int sum=a+b;
        int multi=a*b;
        int div= a/b;
        int modu =a%b;
        // Step 3: Print the results of the arithmetic operations
        System.out.println("sum = " + sum);
        System.out.println("multi = " + multi);
        System.out.println("div = " + div);
        System.out.println("modu = " + modu);

        // Step 4: Perform increment and decrement operations
        a++;
        b--;

        // Step 5: Print the results of the increment and decrement operations
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Step 6: Perform comparison operations
        boolean isTrue = a>b && a-b<a;

        // Step 7: Print the results of the comparison operations
        System.out.println("isTrue = " + isTrue);

        // Step 8: Perform logical operations
        boolean isEqual= !isTrue || !isTrue; 

        // Step 9: Print the results of the logical operations
        System.out.println("isEqual = " + isEqual);

    }
}
