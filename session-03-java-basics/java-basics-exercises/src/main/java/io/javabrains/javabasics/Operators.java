package io.javabrains.javabasics;

public class Operators {
    public static void main(String[] args) {
        // Step 1: Declare variables
        int a = 4, b = 6;

        // Step 2: Perform arithmetic operations
        int sum = a + b;

        // Step 3: Print the results of the arithmetic operations
        System.out.println("Sum = " + sum);

        // Step 4: Perform increment and decrement operations
        a++;
        --b;

        // Step 5: Print the results of the increment and decrement operations
        System.out.println("Incremented a = " + a);
        System.out.println("Decremented b = " + b);

        // Step 6: Perform comparison operations
        boolean isAGreaterThanB = a > b;

        // Step 7: Print the results of the comparison operations
        System.out.println("isAGreaterThanB = " + isAGreaterThanB);

        // Step 8: Perform logical operations
        boolean isAEqualToB = !isAGreaterThanB && !(a < b);

        // Step 9: Print the results of the logical operations
        System.out.println("isAEqualToB = " + isAEqualToB);

    }
}
