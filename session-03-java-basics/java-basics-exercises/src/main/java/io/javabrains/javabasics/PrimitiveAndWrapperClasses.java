package io.javabrains.javabasics;

public class PrimitiveAndWrapperClasses {
    public static void main(String[] args) {
        // Step 1: Declare primitive variables
        int x = 3;
        double y = 3.14;

        // Step 2: Convert primitive variables to wrapper objects

        Integer z = Integer.valueOf(x);
        Integer l = x;

        Double d = y;
        Double d2 = Double.valueOf(y);
        // Step 3: Print the values of the wrapper objects
        System.out.println(d.toString());
        System.out.println(d);
        System.out.println(d2);

        System.out.println(z.toString());
        System.out.println(z);

        // Step 4: Convert wrapper objects back to primitive variables
        int j = z;
        double c = d;

        // Step 5: Print the values of the primitive variables
        System.out.println(z +" "+d);
    }
}
