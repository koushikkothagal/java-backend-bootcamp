package io.javabrains.functionaljava;

import java.sql.SQLOutput;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class JDKFunctionalInterfacesDemo {
    public static void main(String[] args) {

        Function<Integer, Integer> myFunc = x -> x * 2;
        myFunc.apply(10);


        Function<Integer, String> f2 =  num -> "Value is " + num;

        Consumer<String> greeting = name -> System.out.println("Hello, " + name);
        greeting.accept("Koushik");

        Supplier<Double> random =  () -> Math.random();
        random.get();

        Predicate<Integer> isEven = num -> (num % 2) == 0;
        isEven.test(5);


    }
}
