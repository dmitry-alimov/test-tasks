package com.gd.internship.alimov;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JavaStringsIntroductionTest {

    @Test
    public void result_Test() {
        String[] expected = new String[]{"9", "\nNo", "Hello", "Java"};
        String[] actual = JavaStringsIntroduction.result("hello", "java");

        assertEquals(expected, actual);
    }

}
