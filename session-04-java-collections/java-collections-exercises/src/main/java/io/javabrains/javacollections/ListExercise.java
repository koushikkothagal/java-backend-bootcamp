package io.javabrains.javacollections;

/*
Initialize an ArrayList, set the value to a few integers
Then write code to find the sum of all integers
 */

import java.util.ArrayList;
import java.util.Arrays;

public class ListExercise {

    public static void main(String[] args) {
        ArrayList<Integer> integerArrayList = new ArrayList<>(Arrays.asList(5, 10, 15, 20));
        int sum = integerArrayList.stream()
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("Sum of the integerArrayList = " + sum);
    }

}
