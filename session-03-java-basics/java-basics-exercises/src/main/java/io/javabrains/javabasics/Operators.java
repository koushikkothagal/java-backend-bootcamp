package io.javabrains.javabasics;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Operators {
    public static void main(String[] args) {
        // Step 1: Declare variables
        // ArrayList

        int a = 4;
        int b = 5;

        // Step 2: Perform arithmetic operations

        a += b;
        b -= a;
        int c = a * b;


        // Step 3: Print the results of the arithmetic operations
        System.out.println("a += b =>" + a);
        System.out.println(" b -= a=>" + b);
        System.out.println("a * b =>" + c);

        System.out.println("a/b =>" + a / b);

        // Step 4: Perform increment and decrement operations

        int inc = 10;
        int v = ++inc;
        System.out.println(" v=++inc =>" + v);
        int x = --inc;
        System.out.println(" v=--c =>" + x);

        // Step 5: Print the results of the increment and decrement operations


        // Step 6: Perform comparison operations

        Random rand = new Random();

        // Generate random integers in range 0 to 999
        int i = rand.nextInt(30);
        int j = 20;
        boolean bool = i < j;

        System.out.println(i + " " + j + " " + bool);
        // Step 7: Print the results of the comparison operations


        // Step 8: Perform logical operations

        int l = rand.nextInt(30);

        if (i != l) {
            System.out.println("i and l are not equal");
        }


        // Step 9: Print the results of the logical operations


    }
}
