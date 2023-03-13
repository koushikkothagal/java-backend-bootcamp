package io.javabrains.javabasics;

public class PrimitiveAndWrapperClasses {
    public static void main(String[] args) {
        // Step 1: Declare primitive variables
    	int i=10;
    	float x=.23F;
        // Step 2: Convert primitive variables to wrapper objects
    	Integer num=i;
    	Float f=x;
        // Step 3: Print the values of the wrapper objects
    	System.out.println(num);
    	System.out.println(f);
        // Step 4: Convert wrapper objects back to primitive variables
    	i=num;
    	x=f;
        // Step 5: Print the values of the primitive variables
    	System.out.println(i);
    	System.out.println(f);
    	System.out.println("num = " + num);
    }
}
