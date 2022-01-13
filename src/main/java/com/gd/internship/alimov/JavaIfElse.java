package com.gd.internship.alimov;

public class JavaIfElse {

    public static String weirdOrNot(int n) {
        if (n % 2 != 0 || n >= 6 && n <= 20) return "Weird";
        else if (n >= 2 && n <= 5 || n > 20) return "Not Weird";
        else return "";
    }
}
