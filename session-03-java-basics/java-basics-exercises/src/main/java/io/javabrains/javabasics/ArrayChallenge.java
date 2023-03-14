package io.javabrains.javabasics;

public class ArrayChallenge {
    public static void main(String[] args) {
        // Step 1: Create an array of integers
        int[] numbers={10,20,30,40,50,60,70};
        int sum=0;
        double average;
        int largest=numbers[0];
        // Step 2: Use arrays and array operations to find the sum, average, and largest number in the array
        for(int i=0;i<numbers.length;i++){
            sum+=numbers[i];
            if(numbers[i]>largest){
                largest=numbers[i];
            }
        }
        average=(double)sum/numbers.length;
        System.out.println("Sum = "+sum);
        System.out.println("Average = "+average);
        System.out.println("Largest = " + largest);
    }
}
