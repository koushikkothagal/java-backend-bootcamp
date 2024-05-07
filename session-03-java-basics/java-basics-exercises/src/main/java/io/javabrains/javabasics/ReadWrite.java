package io.javabrains.javabasics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ReadWrite {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name");
        String name = scanner.nextLine();
        System.out.println("Enter Destination");
        String dest = scanner.nextLine();
        System.out.println(name + " travelling towards " + dest);

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter place of brith");
        String from = bufferedReader.readLine();
        System.out.println(from);

        scanner.close();
        bufferedReader.close();

    }
}



//Writing Output:
//You can write output to the standard output stream (usually the console) using the System.out.println() method.
//Example:
//java
//Copy code
//public class Main {
//    public static void main(String[] args) {
//        System.out.println("Hello, world!");
//    }
//}
//Reading/Writing Files:
//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.io.IOException;
//
//public class Main {
//    public static void main(String[] args) throws IOException {
//        BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
//        String line;
//        while ((line = reader.readLine()) != null) {
//            System.out.println(line);
//        }
//        reader.close();
//    }
//}
//
//import java.io.BufferedWriter;
//import java.io.FileWriter;
//import java.io.IOException;
//
//public class Main {
//    public static void main(String[] args) throws IOException {
//        BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
//        writer.write("Hello, world!");
//        writer.newLine();
//        writer.close();
//    }
//}