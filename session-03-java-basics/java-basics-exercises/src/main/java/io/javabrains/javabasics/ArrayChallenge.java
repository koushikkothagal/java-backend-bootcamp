package io.javabrains.javabasics;

public class ArrayChallenge {
    static {
        System.out.println("class just loaded");
    }
    // How many instances you create this static block is runned only once when the class is
    // first loaded into the memory.
    public static void main(String[] args) {
        // Step 1: Create an array of integers
        int[] nums={10,20,30,45,12};

        int[] arr1=nums; // this is not copying - it is just assigning the reference
        int[] arr2 = new int[5];
        System.arraycopy(arr1,0,arr2,0,5); // this is copying


        // Step 2: Use arrays and array operations to find the sum, average, and largest number in the array
        int sum=0;
        int n=nums.length;
        int max=nums[0];
        double avg;
        for(int i=0;i<n;i++)
        {
            sum+=nums[i];
            if(max<nums[i])
            {
                max=nums[i];
            }
        }
        avg = (double) sum/n;
        System.out.println("max ele is "+max);
        System.out.println("avg is " + avg);
        System.out.println("sum = " + sum);

    }
}
