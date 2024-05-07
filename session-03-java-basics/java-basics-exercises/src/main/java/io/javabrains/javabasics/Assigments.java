package io.javabrains.javabasics;

import org.w3c.dom.css.Rect;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Assigments {

    public static void main(String[] args) throws IOException {

        // Assignment1
        Scanner scanner = new Scanner(System.in);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

//
//        System.out.println("Enter first number");
//        double num1 = Double.parseDouble(scanner.nextLine());
//
//        System.out.println("Enter second number");
//        double num2 = Double.parseDouble(bufferedReader.readLine());
//
//
//        System.out.println("sum " +  (num1+num2));
//        System.out.println("sub " +  (num1-num2));
//        System.out.println("product " +  (num1*num2));
//        System.out.println("quotient " +  (num1/num2));
//
//
//        //assognemtn2
//
//        System.out.println("Enter name");
//        String name = scanner.nextLine();
//        System.out.println("Enter age");
//        int age = Integer.parseInt(bufferedReader.readLine());
//        System.out.println("Enter salary");
//        double salary = Double.parseDouble(scanner.nextLine());
//
//        System.out.println("name = " + name);
//        System.out.println("age = " + age);
//        System.out.println("salary = " + salary);
//
//
//        //assignemt 3
//
//        if(num1==0){
//            System.out.println("zero");
//        }else if (num1>0){
//            System.out.println("positive");
//        }else {
//            System.out.println("negative");
//        }
//
//
//        //Assignent 4
//        System.out.println("enter the size of array");
//        int length = Integer.parseInt(scanner.nextLine());
//
//        ArrayList<Integer> list = new ArrayList<Integer>();
////        Integer[] list = {};
//        for (int i =0; i<length;i++){
//            System.out.println("Enter Element " + i );
//            list.add(Integer.parseInt(scanner.nextLine()));
//        }
//
//        System.out.println(list);
//


        //Assignemnt 5

//        System.out.println("Enter a string");
//        String str = scanner.nextLine();
//
//        ArrayList<Character> vowels = new ArrayList<>();
//        vowels.add('a');
//        vowels.add('e');
//        vowels.add('i');
//        vowels.add('o');
//        vowels.add('u');
//        int count=0;
//        for(char c : str.toCharArray()){
//            if(vowels.contains(Character.toLowerCase(c))){
//                count++;
//            }
//        }
//
//        System.out.println("count = " + count);
//
//
//        scanner.close();
//        bufferedReader.close();
//

        // Assignment 6
        Rectangle1 rect = new Rectangle1(12,23);
        System.out.println(rect.calculateArea());

        //Assignment 6
        Animal1 loin = new Lion1("timothy",178,21);
        Animal1 cow = new Cow("jersey",154,20);

        loin.feed();;
        cow.feed();
    }
}

class Rectangle1{
    int height;
    int width;
   Rectangle1(int height,int width){
        this.height = height;
        this.width = width;
    }

    public int calculateArea(){
       return  this.height* this.width;
    }
}

class  Animal1 {
    String name;
    double weight;
    int age;
    Animal1(String name,double weight,int age){
        this.name = name;
        this.weight = weight;
        this.age = age;
    }
    public  void  feed(){
        System.out.println("Animal eats food");
    }
}

class Lion1 extends Animal1{
    Lion1(String name,double weight, int age){
        super(name,weight,age);
    }
    public void feed(){
        System.out.println("Loin eats meat");
    }

}

class Cow extends Animal1{
    Cow(String name,double weight, int age){
        super(name,weight,age);
    }
    public void feed(){
        System.out.println("Cow eats grass");
    }


}
