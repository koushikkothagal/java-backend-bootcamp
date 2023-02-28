package io.javabrains.javabasics;

public class ArrayChallenge {
    public static void main(String[] args) {
        // Step 1: Create an array of integers
      int[] numbers={10,20,30,40,50};
        // Step 2: Use arrays and array operations to find the sum, average, and largest number in the array
int sum=0,largest=numbers[0];
for(int i=0;i<numbers.length;i++){
    sum+=numbers[i];
    if(numbers[i]>largest){
        largest=numbers[i];
    }
}
double average= (double)sum/numbers.length;
System.out.println("Sum : "+sum);
System.out.println("Average : "+average);
System.out.println("largest : "+largest);

    }
}
