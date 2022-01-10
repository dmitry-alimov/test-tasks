package com.gd.internship.alimov;

import org.junit.Assert;
import org.junit.Test;

import java.util.InputMismatchException;

import static org.junit.Assert.assertEquals;

public class JavaExceptionHandlingTryCatchTest {

    @Test
    public void divideTest() {

        String actual1 = JavaExceptionHandlingTryCatch.divide("10", "3");

        Exception actual2 = Assert.assertThrows(Exception.class, () -> JavaExceptionHandlingTryCatch.divide("10", "Hello"));

        Exception actual3 = Assert.assertThrows(Exception.class, () -> JavaExceptionHandlingTryCatch.divide("10", "0"));

        Exception actual4 = Assert.assertThrows(Exception.class, () -> JavaExceptionHandlingTryCatch.divide("23.323", "0"));

        assertEquals("3", actual1);
        assertEquals(InputMismatchException.class, actual2.getClass());
        assertEquals("/ by zero", actual3.getMessage());
        assertEquals(ArithmeticException.class, actual3.getClass());
        assertEquals(InputMismatchException.class, actual4.getClass());
    }
}
