package io.javabrains.javacollections;

import java.util.Collection;
import java.util.Set;
import java.util.SortedSet;

// Implement the VocabularyWordManager using a SortedSet internally

public class VocabularyWordManager {

    public VocabularyWordManager(Collection<String> words) {
        throw new RuntimeException("Not implemented");
    }

    public String getFirstWord() {
        throw new RuntimeException("Not implemented");
    }

    public String getLastWord() {
        throw new RuntimeException("Not implemented");

    }

    public SortedSet<String> getWordsBefore(String word) {
        throw new RuntimeException("Not implemented");
    }

    public SortedSet<String> getWordsAfter(String word) {
        throw new RuntimeException("Not implemented");
    }

    public SortedSet<String> getWordsBetween(String startWord, String endWord) {
        throw new RuntimeException("Not implemented");
    }

    public static void main(String[] args) {
        VocabularyWordManager vocab = new VocabularyWordManager(
                Set.of("apple",
                        "banana",
                        "carrot",
                        "date",
                        "eggplant",
                        "fig",
                        "grape",
                        "honey"));

        System.out.println("First word: " + vocab.getFirstWord());
        System.out.println("Last word: " + vocab.getLastWord());

        String targetWord = "eggplant";
        SortedSet<String> wordsBefore = vocab.getWordsBefore(targetWord);
        System.out.println("Words before " + targetWord + ": " + wordsBefore);

        SortedSet<String> wordsAfter = vocab.getWordsAfter(targetWord);
        System.out.println("Words after " + targetWord + ": " + wordsAfter);

        String startWord = "carrot";
        String endWord = "grape";
        SortedSet<String> wordsBetween = vocab.getWordsBetween(startWord, endWord);
        System.out.println("Words between " + startWord + " and " + endWord + ": " + wordsBetween);
    }
}
