package com.gd.internship.alimov;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JavaSubArrayTest {

    @Test
    public void countNegativeSubArraysTest() {
        int[] array = new int[]{1, -2, 4, -5, 1};
        int result = JavaSubArray.countNegativeSubArrays(array, 5);
        assertEquals(9, result);
    }
}
