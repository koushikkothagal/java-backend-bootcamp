package io.javabrains.javabasics;
import java.util.Scanner;

public class Methods {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String word;
        char[] vowels = {'a','e','i','o','u'};
        int totalVowels = 0;

        System.out.println("Enter a word, any word!");
        word = sc.next();
        for(int x = 0; x < word.length(); x++){
            for(int y = 0; y<vowels.length; y++){
                if(word.charAt(x) == vowels[y]){
                    totalVowels++;
                }
            }
        }

        System.out.println("There are " + totalVowels + " vowels in your word!");
    }
}
