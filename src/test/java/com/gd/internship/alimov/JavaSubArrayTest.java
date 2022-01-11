package com.gd.internship.alimov;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JavaSubArrayTest {

    @Test
    public void count_Negative_Sub_Arrays() {
        int[] array = new int[]{1, -2, 4, -5, 1};
        int result = JavaSubArray.countNegativeSubArrays(array, 5);
        assertEquals(9, result);
    }

    @Test
    public void count_Negative_Sub_Arrays_With_Empty_Array() {
        int[] array = new int[]{};
        int result = JavaSubArray.countNegativeSubArrays(array, 0);
        assertEquals(0, result);
    }

    @Test
    public void count_Negative_Sub_Arrays_With_Null_Array() {
        int result = JavaSubArray.countNegativeSubArrays(null, 0);
        assertEquals(0, result);
    }

    @Test
    public void negative_Sum_Sub_Arrays() {
        JavaSubArray.sum(new int[]{1, 2, 3}, 0, 0);
        assertEquals(0, JavaSubArray.count);
    }

    @Test
    public void negative_Sum_Sub_Arrays_From_Index_0_To_End() {
        JavaSubArray.sum(new int[]{1, 2, 3, -1, -2, -5, -30, -40, -34}, 0, 0);
        assertEquals(4, JavaSubArray.count);
    }

    @Test
    public void negative_Sum_Sub_Arrays_From_Index_3_To_5() {
        JavaSubArray.sum(new int[]{1, 2, 3, -1, -2, -5, -30, -40, -34}, 3, 3);
        assertEquals(3, JavaSubArray.count);
    }

}
