package io.javabrains.functionaljava;

import java.util.function.Function;

public class ComposableFunctions {

    public static void main(String[] args) {
        Function<Integer, Integer> increment = x -> x + 1;
        Function<Integer, Integer> doubleIt = x -> x * 2;

        int i = 10;



        Function<Integer, Integer> combine = doubleIt
                .andThen(increment)
                .andThen(doubleIt)
                .andThen(doubleIt)
                .andThen(increment);

        System.out.println(combine.apply(i));

        Function<String, String> trimLeading = String::stripLeading;
        Function<String, String> trimEnding = String::stripTrailing;
        Function<String, String> upperCase = String::toUpperCase;

        String name = "  kjhgj  ";

        String processedName = trimLeading
            .andThen(String::stripTrailing)
            .andThen(String::toUpperCase)
            .apply(name);




    }
}
