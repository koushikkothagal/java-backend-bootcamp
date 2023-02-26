package io.javabrains.javabasics;

public class PrimitiveAndWrapperClasses {
    public static void main(String[] args) {
        // Step 1: Declare primitive variables
           int num=90;
           long n=9999L;

        // Step 2: Convert primitive variables to wrapper objects
           Integer newnum=num;
           Long newn=n;
        // Step 3: Print the values of the wrapper objects
        System.out.println("newnum= " + newnum+"\nnewn :"+newn);
        // Step 4: Convert wrapper objects back to primitive variables
           num=newnum;
           n=newn;
        // Step 5: Print the values of the primitive variables
        System.out.println("num: "+num+"\nn:"+newn);
    }
}
