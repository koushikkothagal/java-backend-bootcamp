package io.javabrains.javacollections;

/*
Create a Java program that allows a user to perform various operations on an ArrayList of integers.
The program should display a menu of options, and the user should be able to select one of the following operations:

1. Add an element to the list
2. Remove an element from the list
3. Find the minimum element in the list
4. Find the maximum element in the list
5. Print the contents of the list
6. Quit the program

The program should continue to display the menu and allow the user to perform operations until they choose to quit.
*/


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ListHomework {
    public static void main(String[] args) {
        Scanner in = new Scanner ( System.in );
        List<Integer> l = new ArrayList<> ( );
        System.out.println ( "Enter the  option" );
        menu ( );
        int choice = in.nextInt ( );

        while (choice != 6) {
            if (choice == 1) l.add ( in.nextInt ( ) );
            else if (choice == 2) l.remove ( in.next ( ) );
            else if (choice == 3) System.out.println ( "Minimum value: " + Collections.min ( l ) );
            else if (choice == 4) System.out.println ( "Minimum value: " + Collections.max ( l ) );
            else if (choice == 5) System.out.println ( "values are:" + l.toString ( ) );
            else {
                System.exit ( 0 );
            }
            menu ( );
            System.out.println ( "Enter the  option" );
            choice = in.nextInt ( );

        }

    }

    public static void menu() {
        String options = """
                 1. Add an element to the list
                 2. Remove an element from the list
                 3. Find the minimum element in the list
                 4. Find the maximum element in the list
                 5. Print the contents of the list
                 6. Quit the program
                """;
        System.out.println ( options );
    }
}