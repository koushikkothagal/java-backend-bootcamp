package io.javabrains.javacollections;

/*
Write a method that accepts a list and two position ints and swaps the elements in the two positions
The method should be generic and accept any List
*/

import java.util.ArrayList;
import java.util.List;

public class ListSwap {

    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println("Before Swapping" +list);

        System.out.println("After swapping" +swap(list,1,3));
    }

    private static List swap(List<Object> list, int index1, int index2) {
        Object e = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2, e);
        return list;

    }
}
