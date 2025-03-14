package io.javabrains.javabasics;
import java.util.Scanner;

public class ControlStructures {
    public static void main(String[] args){
        int x;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an integer, the program will determine if it's positive or negative");
        x = sc.nextInt();

        if(x>0){
            System.out.println("Your number is positive!");
        } else if (x<0){
            System.out.println("Your number is negative!");
        } else{
            System.out.println("Your number is zero!");
        }
    }
}
