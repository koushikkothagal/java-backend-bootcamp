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
        for (Object o : objects)
        {
            if(o instanceof Integer)
            {
                System.out.println(o + "is an Integer");
            } else if (o instanceof String) {
                System.out.println(o + "is a String");
            } else if (o instanceof Boolean) {
                System.out.println(o + "is a Boolean");
            } else if (o instanceof Double) {
                System.out.println(o + "is a Double");
            }
        }
    }
}
