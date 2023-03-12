package io.javabrains.javabasics;

public class ArrayChallenge {
    public static void main(String[] args) {
        // Step 1: Create an array of integers
        int []int_arr = new int[5];
        for(int i=0;i<5;i++) {int_arr[i]=10*(i+1);}
        // Step 2: Use arrays and array operations to find the sum, average, and largest number in the array
        int max = 0 ,avg = 0 ,sum = 0;
        for(int i=0;i<5;i++){
            if(int_arr[i]>max) max = int_arr[i];
            sum+=int_arr[i];
        }
        avg = sum/5;
        System.out.println("maximum = " + max);
        System.out.println("sum = " + sum);
        System.out.println("average = " + avg);
    }
}
