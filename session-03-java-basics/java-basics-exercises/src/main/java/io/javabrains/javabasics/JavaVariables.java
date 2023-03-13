package io.javabrains.javabasics;

public class JavaVariables {

    public static void main(String[] args) {
        // Step 1: Declare and initialize variables of different data types
        // int variable to store an integer value
    	int num =10;

        // long variable to store a long value
    	long numLong= 1234L;

        // float variable to store a floating-point value
    	float numFloat=10.2345F;

        // double variable to store a double value
    	double numDouble =.235;

        // char variable to store a single character
    	char varChar = 'A';		

        // boolean variable to store a boolean value
    	boolean istrue = true;

        // String variable to store a string of characters
    	String name="kamil";

        // Step 2: Print the values of the variables to the console
    	System.out.println(num);
    	System.out.println(numLong);
    	System.out.println(numFloat);
    	System.out.println(numDouble);
    	System.out.println(varChar);
    	System.out.println(istrue);
    	System.out.println(name);
    	

        // Step 3: Modify the values of the variables and print the updated values
    	num=20;
    	numLong=123455L;
    	numFloat=.234F;
    	numDouble=1.234;
    	varChar='B';
    	istrue=false;
    	name="noname";
    	System.out.println(num);
    	System.out.println(numLong);
    	System.out.println(numFloat);
    	System.out.println(numDouble);
    	System.out.println(varChar);
    	System.out.println(istrue);
    	System.out.println(name);
    }
}
