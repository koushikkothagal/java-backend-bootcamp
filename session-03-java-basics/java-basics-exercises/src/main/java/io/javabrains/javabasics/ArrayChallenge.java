package io.javabrains.javabasics;

public class ArrayChallenge {
/*    -- A static field is a filed that belongs to the class
    -- A static method is a method that belongs to class.
    -- static block is a block of code that is executed when the class is first loaded into memory.
    -- A static class is a nested class that is a member if its enclosing class, but does not have access to the enclosing class's
     instance variable*/
    static {
        System.out.println("Class just loaded");
    }

    public  int i;
    public static void main(String[] args) {
        // Step 1: Create an array of integers
       int[] numbers = {10, 20, 30, 40, 17};

       int sum = 0, average = 0;
       int largest = numbers[0];
        // Step 2: Use arrays and array operations to find the sum, average, and largest number in the array
        for (int i = 0; i < numbers.length; i++){
            sum += numbers[i];
            if (largest < numbers[i]) {
                largest = numbers[i];
            }
        }
        double a = (double) sum / numbers.length;
        System.out.println("sum = " + sum);
        System.out.println("largest = " + largest);
        System.out.println("average = " + a);
    }
}
