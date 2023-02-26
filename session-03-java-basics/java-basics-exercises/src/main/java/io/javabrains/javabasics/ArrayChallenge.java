package io.javabrains.javabasics;

import java.util.Arrays;

public class ArrayChallenge {
    public static void main(String[] args) {
        // Step 1: Create an array of integers
        int[] arr = {1, 2, 3, 4, 5};
        // Step 2: Use arrays and array operations to find the sum, average, and largest number in the array
        System.out.println("Sum is: "+Arrays.stream(arr).sum()+"\navg is :"+Arrays.stream(arr).average());
        System.out.println(Arrays.stream(arr).max());

    }
}
