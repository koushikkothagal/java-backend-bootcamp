package io.javabrains.javabasics;

import java.util.Arrays;

public class ArrayChallenge {
    public static void main(String[] args) {
        // Step 1: Create an array of integers
        int [] numbers = {10, 20, 30, 15, 17, 45};

        // Step 2: Use arrays and array operations to find the sum, average, and largest number in the array
        int sum = 0;
        int largestNum = numbers[0];

        for( int i = 0; i < numbers.length; i ++){
            System.out.println("number ["+ i + "] = " + numbers[i]);
            sum += numbers[i];
            largestNum =  (largestNum > numbers[i] ) ? largestNum : numbers[i] ;
        }
        System.out.println("sum of numbers array is = " + sum);
        System.out.println("average of numbers array is = " + sum/numbers.length);
        System.out.println("largest number from numbers array is = " + largestNum);

        int [] numbers2 = {10, 20, 30, 15, 17, 45};

        int index = Arrays.binarySearch(numbers2, 30);
        System.out.println("index is = "+ index);
        Arrays.sort(numbers2);
        System.out.println("Array sort is = "+ Arrays.toString(numbers2));
    }
}
