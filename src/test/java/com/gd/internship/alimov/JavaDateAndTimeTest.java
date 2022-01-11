package com.gd.internship.alimov;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JavaDateAndTimeTest {

    @Test
    public void findDayTest() {
        String actual = JavaDateAndTime.findDay(12, 28, 2021);
        String expected = "TUESDAY";
        assertEquals(expected, actual);
    }
}
