package io.javabrains.javacollections;

/*
Initialize an ArrayList, set the value to a few integers
Then write code to find the sum of all integers
 */
import java.util.ArrayList;
import java.util.Arrays;

public class ListExercise {

    public static void main(String[] args) {
        ArrayList<Integer> ar = new ArrayList<> ( );
        for ( int i = 1; i <= 5; i++ ) {
            ar.add ( i );
        }
        System.out.println ( ar.toString ( ) );
        //using stream and reduce
        Integer sum = ar.stream ( ).reduce ( 0, (a, b) -> a + b );


        System.out.println ( "Sum is " + sum );
        //normal way
        System.out.println ( "Normal approach" );
        Integer nsum = 0;
        for ( Integer i : ar ) nsum = i + nsum;
        System.out.println ( nsum );

    }
}