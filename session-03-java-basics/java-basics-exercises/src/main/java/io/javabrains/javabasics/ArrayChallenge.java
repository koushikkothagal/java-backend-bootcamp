package io.javabrains.javabasics;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class ArrayChallenge {
    public static void main(String[] args) {
        // Step 1: Create an array of integers
    	int[] arr = {5,30,45,63,94,32,45};

        // Step 2: Use arrays and array operations to find the sum, average, and largest number in the array
    	int sum=0;
    	double average;
    	int max =arr[0];
    	for (int i=0; i< arr.length;i++) {
    		sum+=arr[i];
    		if (arr[i]>max) {
    			max=arr[i];
    		}
    	}
    	average=(double)sum/arr.length;
    	
    	
    	System.out.println("max = " + max);
    	 System.out.println("average = " + average);
    	 System.out.println("sum = " + sum);
    	 int[] arr2=new int[7];
    
    	 System.arraycopy (arr, 0, arr2, 0, 7);
    	 arr2[0]=2;
    	 Arrays.stream(arr2)
    	 .forEach(a->System.out.print(a+", "));
    	 System.out.println();
    	 Arrays.stream(arr)
    	 .forEach(a->System.out.print(a+", "));

    }
}
