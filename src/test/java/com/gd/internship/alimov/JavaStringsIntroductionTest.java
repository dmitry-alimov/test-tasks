package com.gd.internship.alimov;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JavaStringsIntroductionTest {

    @Test
    public void javaStringsIntroductionMain1Test() {
        String[] expected = new String[]{"9", "\nNo", "Hello", "Java"};
        String[] actual = JavaStringsIntroduction.result("hello", "java");

        assertEquals(expected, actual);
    }

}
