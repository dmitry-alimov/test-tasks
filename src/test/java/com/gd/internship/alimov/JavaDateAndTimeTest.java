package com.gd.internship.alimov;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JavaDateAndTimeTest {

    @DisplayName("Should pass when method returns TUESDAY")
    @ParameterizedTest
    @CsvSource({"12, 21, 2021", "03, 01, 2022", "11, 01, 2022"})
    public void findDayTest(int month, int day, int year) {
        String actual = JavaDateAndTime.findDay(month, day, year);
        String expected = "TUESDAY";
        assertEquals(expected, actual);
    }
}
