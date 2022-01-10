package com.gd.internship.alimov;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JavaDateAndTimeTest {

    @Test
    public void findDayTest() {
        String actual = JavaDateAndTime.findDay(12, 28, 2021);
        String expected = "TUESDAY";
        assertEquals(expected, actual);
    }
}
