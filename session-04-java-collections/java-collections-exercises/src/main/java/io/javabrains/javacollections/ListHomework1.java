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
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class ListHomework1 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        boolean keepGoing = true;
        do {
            printMenu();
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    addElement(arrayList);
                    break;
                case 2:
                    removeElement(arrayList);
                    break;
                case 3:
                    printMinimum(arrayList);
                    break;
                case 4:
                    printMaximum(arrayList);
                    break;
                case 5:
                    printContents(arrayList);
                    break;
                case 6:
                    keepGoing = false;
                    break;
                default:
                    printMenu();
            }
        } while (keepGoing);
        scanner.close();
        System.out.println("\nProgram is shutting down...\n");
    }

    private static void addElement(ArrayList<Integer> arrayList) {
        System.out.println("Enter integer to be added in list: ");
        int element = scanner.nextInt();
        arrayList.add(element);
        System.out.println(element + " added to list.");
        printContents(arrayList);
    }

    private static void removeElement(ArrayList<Integer> arrayList) {
        printContents(arrayList);
        if (!arrayList.isEmpty()) {
            System.out.println("Enter integer to be removed from list: ");
            Integer element = scanner.nextInt();
            boolean elementRemoved = arrayList.remove(element);
            if (elementRemoved) {
                System.out.println(element + " removed from list.");
            } else {
                System.out.println(element + " not present in list.");
            }
            printContents(arrayList);
        }
    }

    private static void printMinimum(ArrayList<Integer> arrayList) {
        if (arrayList.isEmpty()) {
            System.out.println("List is empty.");
        } else {
            int min = Collections.min(arrayList);
            System.out.println("Minimum integer in list: " + min);
        }
    }

    private static void printMaximum(ArrayList<Integer> arrayList) {
        if (arrayList.isEmpty()) {
            System.out.println("List is empty.");
        } else {
            int max = Collections.max(arrayList);
            System.out.println("Maximum integer in list: " + max);
        }
    }

    private static void printContents(ArrayList<Integer> arrayList) {
        if (arrayList.isEmpty()) {
            System.out.println("List is empty.");
        } else {
            System.out.println();
            System.out.print("List: ");
            for (Integer element : arrayList) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

    }

    private static void printMenu() {
        System.out.println("\nMENU");
        System.out.println("----");
        System.out.println("1. Add an element to the list");
        System.out.println("2. Remove an element from the list");
        System.out.println("3. Find the minimum element in the list");
        System.out.println("4. Find the maximum element in the list");
        System.out.println("5. Print the contents of the list");
        System.out.println("6. Quit the program");
        System.out.println("\nEnter your choice:");
    }

}
