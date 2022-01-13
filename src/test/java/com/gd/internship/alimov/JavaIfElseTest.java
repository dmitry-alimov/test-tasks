package com.gd.internship.alimov;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JavaIfElseTest {

    @DisplayName("Should pass when method returns Not Weird")
    @ParameterizedTest
    @CsvSource({"24", "2", "4", "26"})
    public void weird_Or_Not_Test(int x) {
        String actual = JavaIfElse.weirdOrNot(x);
        assertEquals("Not Weird", actual);
    }

    @DisplayName("Should pass when method returns Weird")
    @ParameterizedTest
    @CsvSource({"3", "18", "29", "5"})
    public void weird_Test(int x) {
        String actual = JavaIfElse.weirdOrNot(x);
        assertEquals("Weird", actual);
    }

}
