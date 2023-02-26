package io.javabrains.javabasics;

import java.util.Objects;

public class InstanceOf {

    public static void main(String[] args) {

        Object[] objects = {
                10,
                "Hello",
                true,
                20.5
        };

        // Challenge: Use instanceof to determine the type of each object in the array
        for( Object i: objects ){
            System.out.println(i.getClass());
        }

    }
}
