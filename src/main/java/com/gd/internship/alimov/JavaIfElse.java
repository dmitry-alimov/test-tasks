package com.gd.internship.alimov;

public class JavaIfElse {

    public static String weirdOrNot(int n) {
        if (n % 2 != 0)
            return "Weird";
        else if (n > 20)
            return "Not Weird";
        else if (n > 6)
            return "Weird";
        else return "Not Weird";
    }
}
