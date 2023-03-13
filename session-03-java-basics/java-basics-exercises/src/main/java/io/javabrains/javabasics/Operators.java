package io.javabrains.javabasics;

public class Operators {
    public static void main(String[] args) {
        // Step 1: Declare variables
        int num1=15;
        int num2=10;

        // Step 2: Perform arithmetic operations
        int sum=num1+num2;
        int diff=num1-num2;

        // Step 3: Print the results of the arithmetic operations
        System.out.println("sum = " + sum);
        System.out.println("diff = " + diff);

        // Step 4: Perform increment and decrement operations
        num1++;
        num2++;

        // Step 5: Print the results of the increment and decrement operations
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        // Step 6: Perform comparison operations
        boolean comp= num1>num2;
        boolean equals= num1 == num2;

        // Step 7: Print the results of the comparison operations
        System.out.println("comp = " + comp);
        System.out.println("equals = " + equals);

        // Step 8: Perform logical operations
        boolean logicalOperation= num1>num2 && num1== num2;

        // Step 9: Print the results of the logical operations
        System.out.println("logicalOperation = " + logicalOperation);

    }
}
