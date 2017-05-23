package com.codeclan.example.wordcounter;

/**
 * Created by user on 23/05/2017.
 */

public class WordCount {

    private String sentence;
    private String[] words;

    public WordCount(String sentence) {
        this.sentence = sentence;
    }

    public void setSentence() {
        this.sentence = sentence;
    }

    public String getSentence() {
        return this.sentence;
    }

    public int getWordCount(String sentence) {
        String[] words = sentence.split(" ");
        return words.length;
    }

    public String[] getWords(String sentence) {
        String[] words = sentence.split(" ");
        return words;
    }

}
