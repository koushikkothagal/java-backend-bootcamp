package io.javabrains.javacollections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
Write code that calls the getFruits method and then iterates over the collection, printing each element to console
 */

public class IteratorExercise {

    public static void main(String[] args) {
        FruitSupplier fruitSupplier = new FruitSupplier();
        Collection<String> fruits = fruitSupplier.getFruits();
        fruits.add("mango");
        Iterator<String> iterator = fruits.iterator();

        System.out.println("--FRUITS--");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
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
}
