package com.gd.internship.alimov.stream.tasks;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TaskTest {

    @DisplayName("Should pass when method returns map")
    @ParameterizedTest
    @MethodSource
    void groupByDigitNumbersTest_All(int[] actual, Map<Integer, List<String>> expected) {
        assertEquals(expected, new Task().groupByDigitNumbers(actual));
    }

    @DisplayName("Should pass when method returns map with \"e\" in values")
    @ParameterizedTest
    @MethodSource
    void groupByDigitNumbersTest_Even(int[] actual, Map<Integer, List<String>> expected) {
        assertEquals(expected, new Task().groupByDigitNumbers(actual));
    }

    @DisplayName("Should pass when method returns map with \"o\" in values")
    @ParameterizedTest
    @MethodSource
    void groupByDigitNumbersTest_Odd(int[] actual, Map<Integer, List<String>> expected) {
        assertEquals(expected, new Task().groupByDigitNumbers(actual));
    }

    public static Stream<Arguments> groupByDigitNumbersTest_All() {
        Map<Integer, List<String>> map1 = new HashMap<>();
        map1.put(1, List.of("o3", "e8"));
        map1.put(2, List.of("e44", "o51"));
        map1.put(3, List.of("e108"));

        Map<Integer, List<String>> map2 = new HashMap<>();
        map2.put(1, List.of("e2", "o1"));
        map2.put(2, List.of("o21", "e48", "o33"));

        Map<Integer, List<String>> map3 = new HashMap<>();
        map3.put(1, List.of("e0"));
        map3.put(2, List.of("o11", "o83"));
        map3.put(3, List.of("e232"));
        map3.put(4, List.of("o1645"));

        return Stream.of(
                Arguments.of(
                        new int[]{3, 44, 108, 8, 51},
                        map1
                ),
                Arguments.of(
                        new int[]{2, 21, 48, 33, 1},
                        map2
                ),
                Arguments.of(
                        new int[]{11, 83, 1645, 232, 0},
                        map3
                )
        );
    }

    public static Stream<Arguments> groupByDigitNumbersTest_Even() {
        Map<Integer, List<String>> map1 = new HashMap<>();
        map1.put(1, List.of("e2", "e0"));
        map1.put(2, List.of("e44", "e22"));
        map1.put(3, List.of("e100"));

        Map<Integer, List<String>> map2 = new HashMap<>();
        map2.put(1, List.of("e4"));
        map2.put(2, List.of("e48", "e88", "e92", "e12"));

        Map<Integer, List<String>> map3 = new HashMap<>();
        map3.put(1, List.of("e4", "e8"));
        map3.put(2, List.of("e56", "e78"));
        map3.put(3, List.of("e128"));

        return Stream.of(
                Arguments.of(
                        new int[]{2, 44, 100, 0, 22},
                        map1
                ),
                Arguments.of(
                        new int[]{4, 48, 88, 92, 12},
                        map2
                ),
                Arguments.of(
                        new int[]{56, 78, 128, 4, 8},
                        map3
                )
        );
    }


    public static Stream<Arguments> groupByDigitNumbersTest_Odd() {
        Map<Integer, List<String>> map1 = new HashMap<>();
        map1.put(1, List.of("o3", "o1"));
        map1.put(2, List.of("o47", "o45"));
        map1.put(3, List.of("o321"));

        Map<Integer, List<String>> map2 = new HashMap<>();
        map2.put(1, List.of("o5", "o9"));
        map2.put(2, List.of("o33", "o51", "o41"));

        Map<Integer, List<String>> map3 = new HashMap<>();
        map3.put(1, List.of("o1"));
        map3.put(2, List.of("o31", "o53"));
        map3.put(3, List.of("o543"));
        map3.put(4, List.of("o3269"));

        return Stream.of(
                Arguments.of(
                        new int[]{3, 1, 47, 45, 321},
                        map1
                ),
                Arguments.of(
                        new int[]{5, 9, 33, 51, 41},
                        map2
                ),
                Arguments.of(
                        new int[]{1, 31, 53, 543, 3269},
                        map3
                )
        );
    }
}