package io.javabrains.javabasics;
import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name;
        int age, salary;

        System.out.println("Enter your name: ");
        name = sc.next();
        System.out.println("Enter your age: ");
        age = sc.nextInt();
        System.out.println("Enter your salary (as an integer): ");
        salary = sc.nextInt();

        System.out.println("Name: " + name+", Age: " + age + ", Salary: $" + salary);
    }
}
