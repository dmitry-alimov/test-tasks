package com.gd.internship.alimov;

import java.util.*;

public class JavaExceptionHandlingTryCatch {

    public static String divide(String x, String y) {
        try {
            int x1 = Integer.parseInt(x);
            int y1 = Integer.parseInt(y);
            return String.valueOf(x1 / y1);
        } catch (Exception e) {
            if (e instanceof InputMismatchException || e instanceof NumberFormatException) {
                throw new InputMismatchException();
            }
            throw new ArithmeticException("/ by zero");
        }
    }
}
