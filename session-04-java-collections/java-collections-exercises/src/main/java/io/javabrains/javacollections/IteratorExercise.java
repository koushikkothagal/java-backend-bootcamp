package io.javabrains.javacollections;

import java.util.*;

/*
Write code that calls the getFruits method and then iterates over the collection, printing each element to console
 */

public class IteratorExercise {
    public static void main(String[] args){
        FruitSupplier fruitSupplier = new FruitSupplier();
        Collection<String> fruits = fruitSupplier.getFruits();
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()){
            String fruit = iterator.next();
            System.out.println("fruit = " + fruit);
        }

        //enhanced way of doing above iteration
        for (String fruit : fruits){
            System.out.println("fruit = " + fruit);
        }

        ArrayList<String> fruits1 = fruitSupplier.getFruits1();
        ListIterator<String> listIterator = fruits1.listIterator();

        System.out.println("=====================");
        while (listIterator.hasNext()){
            System.out.println(listIterator.nextIndex());
            System.out.println(listIterator.next());

        }

        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previousIndex());
            System.out.println(listIterator.previous());
        }
        System.out.println("=====================");

        System.out.println(fruits1.equals(fruits));
        fruits1.subList(1,3).clear();
        System.out.println(fruits1.equals(fruits));
        System.out.println("fruits1 = " + fruits1);
    }

}


class FruitSupplier {
    public Collection<String> getFruits() {
        ArrayList<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("cherry");
        return list;
    }

    public ArrayList<String> getFruits1() {
        ArrayList<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("cherry");
        return list;
    }

}