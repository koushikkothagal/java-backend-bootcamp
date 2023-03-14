package io.javabrains.javacollections;

/*
Print the list in forward and reverse order using iterators only
*/

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ListIteratorExercise {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Item 1");
        list.add("Item 2");
        list.add("Item 3");
        list.add("Item 4");
        list.add("Item 5");

        printListInForwardOrder(list);
        printListInRevreseOrder(list);
    }

    private static void printListInForwardOrder(ArrayList<String> list) {
        Iterator<String> iterator = list.iterator();
        System.out.println("List in Forward Order");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println();
    }

    private static void printListInRevreseOrder(ArrayList<String> list) {
        ListIterator<String> iterator = list.listIterator(list.size());
        System.out.println("List in Reverse Order");
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
        System.out.println();
    }
}
