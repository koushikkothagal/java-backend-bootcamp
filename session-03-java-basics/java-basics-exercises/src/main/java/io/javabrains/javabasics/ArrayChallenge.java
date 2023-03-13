package io.javabrains.javabasics;

public class ArrayChallenge {
    public static void main(String[] args) {
        // Step 1: Create an array of integers
        int numbers[]={10, 20, 25, 30, 35,40};
        int sum=0;
        int largest=numbers[0];

        // Step 2: Use arrays and array operations to find the sum, average, and largest number in the array
        for (int i=0;i< numbers.length;i++){
            sum+=numbers[i];
            if(largest<numbers[i]){
                largest=numbers[i];
            }
        }
        float avg=sum/ numbers.length;
        System.out.println("sum = " + sum);
        System.out.println("largest = " + largest);
        System.out.println("average = " + avg);
    }
}

