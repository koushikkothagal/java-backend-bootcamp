package io.javabrains.javacollections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
Write code that calls the getFruits method and then iterates over the collection, printing each element to console
 */

//THIS IS NOT NECESSARY: YOU CAN USE AN ENHANCED FOR LOOP

public class IteratorExercise {
    public static void main(String[] args) {
        FruitSupplier fruitSupplier = new FruitSupplier();
        Collection<String> fruits = fruitSupplier.getFruits(); // Makes sure it works for all kinds of collections
        Iterator<String> itr = fruits.iterator(); // for iterating through objects
        while (itr.hasNext()) {
            String fruit = itr.next();

            if (fruit.equals("apple"))
                itr.remove();
            System.out.println(fruit); // each next object you get is a string in this case

            }
    }
}


class FruitSupplier {
    public Collection<String> getFruits() {
        // returns a collection
        ArrayList<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("cherry");
        return list;
    }

}