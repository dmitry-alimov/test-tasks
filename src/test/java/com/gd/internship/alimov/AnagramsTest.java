package com.gd.internship.alimov;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class AnagramsTest {

    @ParameterizedTest
    @CsvSource({"Hello,hello", "bbcccxxxyyy,yyxxyxccbcb", "anagram,marganaa"})
    void is_Anagram_Test(String a, String b) {
        assertTrue(Anagrams.isAnagram(a,b));
    }
}
