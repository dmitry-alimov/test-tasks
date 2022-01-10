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

            String[] A = a.split("");
            String[] B = b.split("");

            int[] includedA = mapChars(A);
            int[] includedB = mapChars(B);

            return Arrays.equals(includedA, includedB);
        }
    }

    static int[] mapChars(String[] str) {
        int[] included = new int[26];
        String letters = "abcdefghijklmnopqrstuvwxyz";

        for (String ch : str) {
            included[letters.indexOf(ch)]++;
        }
        
        return included;
    }
}
