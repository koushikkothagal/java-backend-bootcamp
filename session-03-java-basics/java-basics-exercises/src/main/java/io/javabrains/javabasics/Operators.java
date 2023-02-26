package io.javabrains.javabasics;

import java.util.ArrayList;
import java.util.List;

public class Operators {
    public static void main(String[] args) {
        // Step 1: Declare variables
        int a=10;
        int b=20;


        // Step 2: Perform arithmetic operations
         System.out.println("Addition:"+a+b);
         System.out.println("Subtraction:"+(b-a));
        System.out.println("Multiplication: "+(a*b));
        System.out.println("Division"+(b/a));
        System.out.println("modul0"+(a%b));


        // Step 3: Print the results of the arithmetic operations
           /* step 3 is executed in step 2 itself*/


        // Step 4: Perform increment and decrement operations

        // Step 5: Print the results of the increment and decrement operations
          --a;
        System.out.println("a = " + a);
        --b;
        System.out.println("b = " + b);
        a++;
        System.out.println("a = " + a);
        b++;
        System.out.println("b = " + b);
        a--;
        System.out.println("a = " + a);
        b--;
        System.out.println("b = " + b);
        ++a;
        System.out.println("a = " + a);
        ++b;
        System.out.println("b = " + b);
           a=5;
           b=7;
        // Step 6: Perform comparison operations
        // Step 7: Print the results of the comparison operations
        System.out.println("a>b"+(a>b)+"\na<b"+(a<b));




        // Step 8: Perform logical operations
        // Step 9: Print the results of the logical operations
        System.out.println("a&b"+(a>b&&b<a)+"\na||b"+(a>b|b>a)+"\n!a");


    }
}
