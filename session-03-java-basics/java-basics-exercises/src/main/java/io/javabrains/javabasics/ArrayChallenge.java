package io.javabrains.javabasics;

public class ArrayChallenge {
    public static void main(String[] args) {
        // Step 1: Create an array of integers
        int[] intArray = {9, 3, 5, 7, 1};

        // Step 2: Use arrays and array operations to find the sum, average, and largest number in the array
        int sum = 0, largestNumber = 0;
        double average;

        int length = intArray.length;
        for (int val : intArray) {
            sum += val;
            if (largestNumber < val) {
                largestNumber = val;
            }
        }

        average = (double) sum / length;

        System.out.println("Sum = " + sum + "\nAverage = " + average + "\nLargest Number = " + largestNumber);
    }
}
