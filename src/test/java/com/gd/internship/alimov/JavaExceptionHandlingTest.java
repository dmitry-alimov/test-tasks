package com.gd.internship.alimov;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class JavaExceptionHandlingTest {

    @DisplayName("Should pass when method returns num")
    @ParameterizedTest
    @CsvSource({"3, 5, 243", "2, 4, 16"})
    public void power_Test(int x, int y, int expected) throws Exception {
        assertEquals(expected, JavaExceptionHandling.power(x, y));
    }

    @DisplayName("Should pass when method returns Exception")
    @ParameterizedTest
    @CsvSource({"-1, -2", "-1, 3"})
    public void power_Test_With_Exception_Not_Be_Negative(int x, int y) {
        String expected = "n or p should not be negative.";
        assertEquals(expected, assertThrows(Exception.class,
                () -> JavaExceptionHandling.power(x, y)).getMessage());
    }

    @DisplayName("Should pass when method returns Exception")
    @ParameterizedTest
    @CsvSource({"0, 0"})
    public void power_Test_With_Exception_Not_Be_Zero(int x, int y) {
        String expected = "n and p should not be zero.";
        assertEquals(expected, assertThrows(Exception.class,
                () -> JavaExceptionHandling.power(x, y)).getMessage());
    }
}
