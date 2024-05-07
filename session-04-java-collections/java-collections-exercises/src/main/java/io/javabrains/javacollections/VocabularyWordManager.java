package io.javabrains.javacollections;

import java.util.Collection;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

// Implement the VocabularyWordManager using a SortedSet internally

public class VocabularyWordManager {

    private SortedSet<String> words;
    public VocabularyWordManager(Collection<String> words) {
        this.words = new TreeSet<>(words);
    }

    public String getFirstWord() {
        return  this.words.first();
    }

    public String getLastWord() {
        return this.words.last();
    }

    public SortedSet<String> getWordsBefore(String word) {
        return this.words.headSet(word);
    }

    public SortedSet<String> getWordsAfter(String word) {
        return this.words.tailSet(word);
    }

    public SortedSet<String> getWordsBetween(String startWord, String endWord) {
        return  this.words.subSet(startWord,endWord);
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
