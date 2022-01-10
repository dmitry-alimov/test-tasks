package com.gd.internship.alimov;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JavaExceptionHandlingTest {

    @Test
    public void powerTest() throws Exception {

        String actual1 = JavaExceptionHandling.power(3, 5);
        String actual2 = JavaExceptionHandling.power(2, 4);

        assertEquals("243", actual1);
        assertEquals("16", actual2);

        Exception actual3 = Assert.assertThrows(Exception.class, () -> JavaExceptionHandling.power(0, 0));

        Exception actual4 = Assert.assertThrows(Exception.class, () -> JavaExceptionHandling.power(-1, -2));

        Exception actual5 = Assert.assertThrows(Exception.class, () -> JavaExceptionHandling.power(-1, 3));

        assertEquals("n and p should not be zero.", actual3.getMessage());
        assertEquals("n or p should not be negative.", actual4.getMessage());
        assertEquals("n or p should not be negative.", actual5.getMessage());
    }

}
