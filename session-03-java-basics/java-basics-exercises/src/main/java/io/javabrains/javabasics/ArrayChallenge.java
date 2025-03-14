package io.javabrains.javabasics;

import java.util.Arrays;

public class ArrayChallenge {
    public static void main(String[] args) {
        // Step 1: Create an array of integers
        int[] intArray = {2,6,34,2,11};

        // Step 2: Use arrays and array operations to find the sum, average, and largest number in the array
        System.out.println("Sum: " + Arrays.stream(intArray).sum());
        System.out.println("Average: " + Arrays.stream(intArray).average());
        System.out.println("Largest Number: " + Arrays.stream(intArray).max());
    }
}
