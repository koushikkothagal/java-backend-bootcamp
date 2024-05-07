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

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListHomework1 {
     public static void main (String[] args) throws IOException {
         List<Integer> list = new ArrayList<Integer>(List.of(23,45,4));

         BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
         System.out.println("Choose one option\n1. Add an element to the list\n2. Remove an element from the list" +
                 "\n3. Find the minimum element in the list\n4. Find the maximum element in the list5. Print the contents of the list" +
                 "\n5. Print the contents of the list\n6. Quit the program");

         int selectionOption = Integer.parseInt(bufferedReader.readLine());

         while (selectionOption!=6){
             switch (selectionOption){
                 case 1 : {
                     System.out.println("Enter Element to be added");
                     Integer element  = Integer.parseInt(bufferedReader.readLine());
                     list.add(element);
                     break;
                 }
                 case 2 : {
                     System.out.println("Choose the element to be removed from below List");
                     System.out.println(list);
                     Integer element  = Integer.parseInt(bufferedReader.readLine());
                     list.remove(element);
                     break;
                 }
                 case 3 :{
                     Integer min = Collections.min(list);
                     System.out.println("min = " + min);
                     break;
                 }
                 case 4 :{
                     Integer max = Collections.max(list);
                     System.out.println("max = " + max);
                     break;
                 }
                 case 5 : {
                     System.out.println(list);
                     break;
                 }
                 default :
                     throw new IllegalStateException("Unexpected value: " + selectionOption);
             }
             System.out.println("Choose next operation\n1. Add an element to the list\n2. Remove an element from the list" +
                     "\n3. Find the minimum element in the list\n4. Find the maximum element in the list5. Print the contents of the list" +
                     "\n5. Print the contents of the list\n6. Quit the program");
             selectionOption = Integer.parseInt(bufferedReader.readLine());
         }

         bufferedReader.close();
     }


}
