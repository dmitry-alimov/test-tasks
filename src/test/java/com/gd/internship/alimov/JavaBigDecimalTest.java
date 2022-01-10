package com.gd.internship.alimov;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JavaBigDecimalTest {

    @Test
    public void descendingBigDecimalsTest1() {
        String[] expected = new String[]{
                "90",
                "56.6",
                "50",
                "02.34",
                "0.12",
                ".12",
                "0",
                "000.000",
                "-100"
        };

        String[] actual = new String[]{
                "-100",
                "50",
                "0",
                "56.6",
                "90",
                "0.12",
                ".12",
                "02.34",
                "000.000"
        };

        JavaBigDecimal.descendingBigDecimals(actual);
        assertEquals(expected, actual);
    }

    @Test
    public void descendingBigDecimalsTest2() {

        String[] expected = new String[]{
                "324324",
                "4546",
                "766",
                "123",
                "100",
                "45",
                "0.325",
                ".324",
                "0",
                "-234"
        };

        String[] actual = new String[]{
                "0.325",
                "4546",
                "-234",
                "0",
                "123",
                "766",
                ".324",
                "324324",
                "100",
                "45"
        };

        JavaBigDecimal.descendingBigDecimals(actual);
        assertEquals(expected, actual);
    }

}
