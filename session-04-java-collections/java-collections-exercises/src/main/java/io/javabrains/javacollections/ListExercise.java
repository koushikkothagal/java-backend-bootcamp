package io.javabrains.javacollections;

/*
Initialize an ArrayList, set the value to a few integers
Then write code to find the sum of all integers
 */

import java.util.ArrayList;
import java.util.List;

public class ListExercise {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>(List.of(1, 2));
        numbers.add(23);
        Integer sum =0;
        for (Integer num :numbers){
            sum+=num;
        }
        System.out.println("sum = " + sum);
    }

}
