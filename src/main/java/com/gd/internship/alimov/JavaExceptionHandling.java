package com.gd.internship.alimov;

class JavaExceptionHandling {

    public static String power(int x, int y) throws Exception {
        if (x == 0 && y == 0) throw new Exception("n and p should not be zero.");
        if (x < 0 || y < 0) throw new Exception("n or p should not be negative.");
        return String.valueOf((int) Math.pow(x, y));
    }
}