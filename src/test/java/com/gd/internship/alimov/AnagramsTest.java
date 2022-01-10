package com.gd.internship.alimov;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AnagramsTest {

    @Test
    public void isAnagramTest() {

        boolean actual1 = Anagrams.isAnagram("Hello", "hello");
        boolean actual2 = Anagrams.isAnagram("bbcccxxxyyy", "yyxxyxccbcb");
        boolean actual3 = Anagrams.isAnagram("anagram", "marganaa");

        assertTrue(actual1);
        assertTrue(actual2);
        assertFalse(actual3);
    }
}
