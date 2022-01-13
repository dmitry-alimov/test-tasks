package com.gd.internship.alimov;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class AnagramsTest {

    @DisplayName("Should pass when method returns true")
    @ParameterizedTest
    @CsvSource({"Hello,hello", "bbcccxxxyyy,yyxxyxccbcb"})
    void is_Anagram_True_Test(String a, String b) {
        assertTrue(Anagrams.isAnagram(a, b));
    }

    @DisplayName("Should pass when method returns false")
    @ParameterizedTest
    @CsvSource({"anagram,marganaa"})
    void is_Anagram_False_Test(String a, String b) {
        assertFalse(Anagrams.isAnagram(a, b));
    }
}
