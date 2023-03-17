package io.javabrains.javacollections;

/*
Print the list in forward and reverse order using iterators only
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ListIteratorExercise {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Item 1");
        list.add("Item 2");
        list.add("Item 3");
        list.add("Item 4");
        list.add("Item 5");

        Iterator<String> itr = list.iterator();
        System.out.println("Elements in the list in forward direction are: ");
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
       Collections.reverse(list);
        Iterator<String> itr1 = list.iterator();
        System.out.println("Elements in the list in reverse direction are: ");
        while(itr1.hasNext()){
            System.out.println(itr1.next());
        }

    }
}
