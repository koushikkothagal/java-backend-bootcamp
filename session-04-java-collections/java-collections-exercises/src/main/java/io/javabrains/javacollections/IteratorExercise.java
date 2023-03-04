package io.javabrains.javacollections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
Write code that calls the getFruits method and then iterates over the collection, printing each element to console
 */

public class IteratorExercise {
 public static void main(STring[] args){
    FruitSupplier fruitSupplier=new FruitSupplier();
    Collection<String> fruits=fruitSupplier.getFruits();
    Iterator<String> iterator=fruits.iterator();
    while(iterator.hasNext()){
        String fruitstr=iterator.next();
        System.out.println("fruitstr = "+fruitstr);
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