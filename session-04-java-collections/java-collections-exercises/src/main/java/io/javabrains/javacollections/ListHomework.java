package io.javabrains.javacollections;
import java.util.*;
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
public class ListHomework {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();
        while (true) {
            System.out.println("Menu");
            System.out.println("1. Add an element to the list");
            System.out.println("2. Remove an element from the list");
            System.out.println("3. Find the minimum element in the list");
            System.out.println("4. Find the maximum element in the list");
            System.out.println("5. Print the contents of the list");
            System.out.println("6. Quit the program");
            int choice = scanner.nextInt();
            if(choice==1){
                System.out.println("Enter a element to add");
                int addElement = scanner.nextInt();
                list.add(addElement);
                System.out.println(addElement+" is added to the list.");
            }
            if(choice==2){
                if (list.isEmpty()) {
                    System.out.println("List is empty");
                } else {
                    System.out.println("Enter the index of the element you want to remove");
                    int removeIndex = scanner.nextInt();
                    if (removeIndex >= 0 && removeIndex < list.size()) {
                        list.remove(removeIndex);
                        System.out.println("Element at index "+removeIndex+" is removed");
                    } else {
                        System.out.println("Invalid index");
                    }
                }
            }
            if(choice==3){
                if (list.isEmpty()) {
                    System.out.println("List is empty");
                } else {
                    int minElement = Collections.min(list);
                    System.out.println("Minimum element in the list is" + minElement);
                }
            }
            if(choice==4){
                if (list.isEmpty()) {
                    System.out.println("List is empty");
                } else {
                    int maxElement = Collections.max(list);
                    System.out.println("Maximum element in the list is" + maxElement);
                }
            }
            if(choice==5){
                if (list.isEmpty()) {
                    System.out.println("List is Empty.Enter the choice 2 to add some.");
                } else {
                    System.out.println("list:");
                    for (int element : list) {
                        System.out.print(element+" ");
                    }
                    System.out.println();
                }
            }
            if(choice==6){
                System.out.println("Progam closed");
                scanner.close();
                System.exit(0);
            }
            if(choice>6 || choice <1){
                System.out.println("Invalid choice");
            }
        }
    }
}
