package com.gd.internship.alimov;

import org.junit.jupiter.api.Test;
import java.util.InputMismatchException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class JavaExceptionHandlingTryCatchTest {

    @Test
    public void divide_Test() {
        String actual1 = JavaExceptionHandlingTryCatch.divide("10", "3");
        assertEquals("3", actual1);
    }

    @Test
    public void divide_Test_With_Exception() {

        Exception actual1 = assertThrows(Exception.class, () -> JavaExceptionHandlingTryCatch.divide("10", "Hello"));
        Exception actual2 = assertThrows(Exception.class, () -> JavaExceptionHandlingTryCatch.divide("10", "0"));
        Exception actual3 = assertThrows(Exception.class, () -> JavaExceptionHandlingTryCatch.divide("23.323", "0"));

        assertEquals(InputMismatchException.class, actual1.getClass());

        assertEquals("/ by zero", actual2.getMessage());
        assertEquals(ArithmeticException.class, actual2.getClass());

        assertEquals(InputMismatchException.class, actual3.getClass());
    }
}
