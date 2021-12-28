package com.gd.internship.alimov;

import java.util.*;

public class JavaExceptionHandlingTryCatch {
    public static String divide(String x,String y) throws Exception{
        try {
            int x1 = Integer.parseInt(x);
            int y1 = Integer.parseInt(y);
            return String.valueOf(x1/y1);
        } catch (Exception e){
            if (e instanceof InputMismatchException || e instanceof NumberFormatException){
                throw new InputMismatchException();
            }
            throw new ArithmeticException("/ by zero");
        }
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
            String x = in.next();
            String y = in.next();
            try {
                System.out.println(divide(x, y));
            } catch (Exception e) {
                System.out.println(e);
            }
    }
}