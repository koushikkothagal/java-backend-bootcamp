package io.javabrains.javabasics;
import java.util.Scanner;

public class Arrays {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size;

        System.out.println("How many integers in the array?");
        size = sc.nextInt();
        int[] array = new int[size];

        for(int x = 0; x < size ; x++){
            System.out.println("Enter the next int: ");
            array[x] = sc.nextInt();
        }

        int max = array[0];

        for(int x = 0; x < size ; x++){
            if(array[x]>max){
                max = array[x];
            }
        }

        System.out.println("The maximum value you entered is: " + max);
    }
}
