package io.javabrains.javabasics;
import java.util.Scanner;

public class BasicSyntax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x,y;

        System.out.println("Enter an integer: ");
        x = sc.nextInt();
        System.out.println("Enter anothere integer: ");
        y = sc.nextInt();

        System.out.println("Sum: "+ (x+y));
        System.out.println("Difference: "+ (x-y));
        System.out.println("Quotient: "+ (x/y));
        System.out.println("Product: "+ (x*y));
    }
}
