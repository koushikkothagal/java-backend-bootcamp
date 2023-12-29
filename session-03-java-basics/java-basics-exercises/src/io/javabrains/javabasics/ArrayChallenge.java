package io.javabrains.javabasics;

import java.util.Arrays;

public class ArrayChallenge {
    public static void main(String[] args) {
        // Step 1: Create an array of integers
       int[] nums = {10, 20, 30, 15, 17, 45};
       int[] nums1 = new int[5];
       System.arraycopy(nums,0, nums1, 0, 5 );

        System.out.println("nums1 = " + nums1);



        // Step 2: Use arrays and array operations to find the sum, average, and largest number in the array
        int sum = 0;
        int avg = 0;
        int largestNum = nums[0];

        for (int i = 0; i < nums.length; i++){
            sum += nums[i];
            if (largestNum < nums[i]) {
                largestNum = nums[i];
            }
        }
        double a = (double) sum / nums.length;
        System.out.println("The sum of nums is: "+sum);
        System.out.println("largestNum = " + largestNum);
        System.out.println("avg = " + a);

    }
}
