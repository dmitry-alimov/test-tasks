package com.gd.internship.alimov;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class JavaExceptionHandlingTest {

    @Test
    public void power_Test() throws Exception {

        String actual1 = JavaExceptionHandling.power(3, 5);
        String actual2 = JavaExceptionHandling.power(2, 4);

        assertEquals("243", actual1);
        assertEquals("16", actual2);
    }

    @Test
    public void power_Test_With_Exception() {

        Exception actual3 = assertThrows(Exception.class, () -> JavaExceptionHandling.power(0, 0));

        Exception actual4 = assertThrows(Exception.class, () -> JavaExceptionHandling.power(-1, -2));

        Exception actual5 = assertThrows(Exception.class, () -> JavaExceptionHandling.power(-1, 3));

        assertEquals("n and p should not be zero.", actual3.getMessage());
        assertEquals("n or p should not be negative.", actual4.getMessage());
        assertEquals("n or p should not be negative.", actual5.getMessage());
    }
}
