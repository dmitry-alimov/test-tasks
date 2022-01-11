package com.gd.internship.alimov;

import java.util.Arrays;

public class Anagrams {

    static boolean isAnagram(String a, String b) {
        if (a.equalsIgnoreCase(b)) {
            return true;
        }
        if (b.equalsIgnoreCase(new StringBuilder().append(a)
                .reverse()
                .toString())) {
            return true;
        } else {
            a = a.toLowerCase();
            b = b.toLowerCase();

            char[] charsA = stringToChar(b);
            char[] charsB = stringToChar(a);

            int[] includedA = mapChars(charsA);
            int[] includedB = mapChars(charsB);

            return Arrays.equals(includedA, includedB);
        }
    }

    static char[] stringToChar(String str) {
        char[] chars = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            chars[i] = str.charAt(i);
        }
        return chars;
    }

    static int[] mapChars(char[] chars) {
        int[] included = new int[26];
        for (char ch : chars) {
            included[ch - 97]++;
        }
        return included;
    }
}
