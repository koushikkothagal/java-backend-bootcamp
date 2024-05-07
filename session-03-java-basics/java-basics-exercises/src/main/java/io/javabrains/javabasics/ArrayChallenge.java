package io.javabrains.javabasics;

import java.util.Arrays;

public class ArrayChallenge {
    public static void main(String[] args) {
        // Step 1: Create an array of integers
            int[] arr = {10,20,33,10};

        // Step 2: Use arrays and array operations to find the sum, average, and largest number in the array
            int sum = 0;
            double avg;
            int largest =arr[0];
            for (int i :arr){
                sum+=i;
                if(i>largest){
                    largest =i; 
                }
            }
            avg = sum / arr.length;

        System.out.println("sum = " + sum);
        System.out.println("avg = " + avg);
        System.out.println("largest = " + largest);
        int[] arrCopy = new int[3] ;
        System.arraycopy(arr,1,arrCopy,0,3);
        System.out.println("arrCopy = " + Arrays.toString(arrCopy));
        System.out.println("arr = " + Arrays.toString(arr));

    }
}
