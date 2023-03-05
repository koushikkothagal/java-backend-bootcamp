package io.javabrains.javacollections;
import java.util.*;
/*
Initialize an ArrayList, set the value to a few integers
Then write code to find the sum of all integers
 */
public class ListExercise {
    public static void main(String[] args) {
 ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        int sum = numbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println("The sum of the integers in the list is " + sum);
    }
}
