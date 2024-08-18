package io.javabrains.javabasics;

import java.util.Arrays;

public class ArrayChallenge {

    static int i =0;
    static{
        System.out.println(Arrays.toString(new int[]{1,2,3,4,5,6,7,8,9,10}));
    }
    public static void main(String[] args) {
        // Step 1: Create an array of integers

        i =1;
        System.out.println("this is i "+i);
        int[] arr = new int[10];

        for(int i = 0; i < arr.length; i++){
            arr[i] = (int)(Math.random() * 101);
        }

        // Step 2: Use arrays and array operations to find the sum, average, and largest number in the array

        int res = sum(arr);
        System.out.println("Sum of arr values" + res);
        System.out.println("AVG of arr values" + average(res));
        System.out.println("MAX value of arr values" + max(arr));

    }

    public static int max(int [] arr){
        int max = arr[0];
        for(int i = 1; i < arr.length; i++){

            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }

    public static int sum(int []arr){
        int res =0;
        for(int a : arr) {
            System.out.print(a + " ");
            res += a;
        }
        return res;
    }

    public static int average(int res){
        return res / 10;
    }
}
