package io.javabrains.javacollections;

/*
Write a method that accepts a list and two position ints and swaps the elements in the two positions
The method should be generic and accept any List
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSwap {

    public static void main(String[] args) {
     List<Integer> list = new ArrayList<>(List.of(23,33,44,444));
     System.out.println(swapList(list,1,2));
    }
    public static List<Integer> swapList(List<Integer> list, int position1 , int position2)  {
        if(position1 > list.size()-1 || position2 > list.size()-1 || position1 < 0 || position2 < 0){
            throw new Error("position not valid");
        }
        Collections.swap(list, position1, position2);
        return list;
    }
}
