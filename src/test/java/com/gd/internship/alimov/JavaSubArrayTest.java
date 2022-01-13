package com.gd.internship.alimov;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JavaSubArrayTest {

    private JavaSubArray javaSubArray;

    @DisplayName("Should pass when method returns num")
    @ParameterizedTest
    @MethodSource
    public void count_Negative_Sub_Arrays(int[] actual, int range, int expected) {
        assertEquals(expected, new JavaSubArray().countNegativeSubArrays(actual, range));
    }

    private static Stream<Arguments> count_Negative_Sub_Arrays() {
        return Stream.of(
                Arguments.of(
                        new int[]{1, -2, 4, -5, 1},
                        5,
                        9
                ),
                Arguments.of(
                        new int[]{4, -6, 7, 3, -10},
                        5,
                        6
                )
        );
    }

    @DisplayName("Should pass when method returns zero")
    @Test
    public void count_Negative_Sub_Arrays_With_Empty_Array() {
        assertEquals(0, new JavaSubArray().countNegativeSubArrays(new int[]{}, 0));
    }

    @DisplayName("Should pass when method returns zero")
    @Test
    public void count_Negative_Sub_Arrays_With_Null_Array() {
        assertEquals(0, new JavaSubArray().countNegativeSubArrays(null, 0));
    }

    @DisplayName("Should pass when method returns zero")
    @Test
    public void negative_Sum_Sub_Arrays() {
        javaSubArray = new JavaSubArray();
        javaSubArray.sum(new int[]{1, 2, 3}, 0,0);
        assertEquals(0, javaSubArray.count);
    }

    @DisplayName("Should pass when method sum from discardFromTheBeginning to discardFromTheEnd returns num")
    @ParameterizedTest
    @MethodSource
    public void negative_Sum_Sub_Arrays_Discard_From_The_Beginning_To_Discard_From_The_End(int[] array, int discardFromTheBeginning, int discardFromTheEnd, int expected) {
        javaSubArray = new JavaSubArray();
        javaSubArray.sum(array, discardFromTheBeginning, discardFromTheEnd);
        assertEquals(expected, javaSubArray.count);
    }

    private static Stream<Arguments> negative_Sum_Sub_Arrays_Discard_From_The_Beginning_To_Discard_From_The_End() {
        return Stream.of(
                Arguments.of(
                        new int[]{1, 2, 3, -1, -2, -5, -30, -40, -34},
                        0,
                        0,
                        4
                ),
                Arguments.of(
                        new int[]{1, 2, 3, -1, -2, -5, -30, -40, -34},
                        3,
                        3,
                        3
                )
        );
    }
}
