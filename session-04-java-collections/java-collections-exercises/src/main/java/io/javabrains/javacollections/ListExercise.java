package io.javabrains.javacollections;

/*
Initialize an ArrayList, set the value to a few integers
Then write code to find the sum of all integers
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExercise {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        int sum=0;
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        Iterator<Integer> itr = list.iterator();
        while(itr.hasNext()){
            sum+= itr.next();
        }
        System.out.println("sum = " + sum);
    }

}

