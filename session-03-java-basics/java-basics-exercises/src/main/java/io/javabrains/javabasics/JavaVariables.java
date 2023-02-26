package io.javabrains.javabasics;

public class JavaVariables {

    public static void main(String[] args) {
        // Step 1: Declare and initialize variables of different data types
        // int variable to store an integer value
        int  age=19;


        // long variable to store a long value
        long  number=+91623457239542L;


        // float variable to store a floating-point value
        float f=90.00f;

        // double variable to store a double value
         double cutoff=1999.20;

        // char variable to store a single character

         char ch='a';
        // boolean variable to store a boolean value
           boolean result=true;

        // String variable to store a string of characters
           String name="Asvin";

        // Step 2: Print the values of the variables to the console
         System.out.println("int value"+age+"\nlong :"+number+"\nfloat :"+f+"\ndouble: "+cutoff+"\nchar:"+ch+"\nboolean:"+result+"\nString:"+name);

        // Step 3: Modify the values of the variables and print the updated values
        age=20;
        number=90405252123543L;
        cutoff=99.0003;ch='b';
        name="Asvin V T";
        f=99.0f;
        result=false;
        System.out.println("int value"+age+"\nlong :"+number+"\nfloat :"+f+"\ndouble: "+cutoff+"\nchar:"+ch+"\nboolean:"+result+"\nString:"+name);

    }
}
