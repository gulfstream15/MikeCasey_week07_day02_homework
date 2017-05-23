package com.codeclan.example.wordcounter;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 23/05/2017.
 */

public class WordCountTest {

    @Test
    public void hasSentence() {
        WordCount wordcount = new WordCount("This is a simple sentence");
        assertEquals("This is a simple sentence", wordcount.getSentence());
    }

    @Test
    public void wordCount() {
        WordCount wordcount = new WordCount("This is a simple sentence");
        String sentence = wordcount.getSentence();
        assertEquals(5, wordcount.getWordCount(sentence));
    }


}
