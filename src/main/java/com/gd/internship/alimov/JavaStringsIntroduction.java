package com.gd.internship.alimov;

public class JavaStringsIntroduction {

    public static String[] result(String a, String b) {

        int generalLength = a.length() + b.length();

        String yesOrNo = isLexicographicallyGreater(a, b) ? "\nYes" : "\nNo";

        a = capitalizeFirstLetter(a) + a.substring(1);
        b = capitalizeFirstLetter(b) + b.substring(1);

        return new String[]{String.valueOf(generalLength), yesOrNo, a, b};
    }

    public static boolean isLexicographicallyGreater(String a, String b) {
        return a.compareTo(b) > 0;
    }

    public static String capitalizeFirstLetter(String s) {
        return s.substring(0, 1).toUpperCase();
    }
}
