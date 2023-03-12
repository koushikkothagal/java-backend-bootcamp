package io.javabrains.javacollections;
import java.util.*;
/*
Write a method that accepts a list and two position ints and swaps the elements in the two positions
The method should be generic and accept any List
*/

public class ListSwap {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the no of elements in the list :");
        int size = sc.nextInt();
        List<Integer> list = new ArrayList();
        System.out.println("Enter the elements :");
        for(int i=0;i<size;i++){
            list.add(sc.nextInt());
        }
        System.out.println("Enter the position you want to swap :");
        int position1=sc.nextInt();
        System.out.println("enter the second position you want to swap :");
        int position2=sc.nextInt();
        int a = list.get(position1);
        int b = list.get(position2);
        list.set(position1,b);
        list.set(position2,a);
        System.out.println("the elements are :");
        for(int i:list){
            System.out.print(i+" ");
        }
    }
}
