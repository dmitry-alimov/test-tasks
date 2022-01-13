package com.gd.internship.alimov;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class JavaStringsIntroductionTest {

    @DisplayName("Should pass when method returns String[]")
    @ParameterizedTest
    @MethodSource
    public void result_Test(String a, String b, String[] expected) {
        assertArrayEquals(expected, JavaStringsIntroduction.result(a, b));
    }

    private static Stream<Arguments> result_Test() {
        return Stream.of(
                Arguments.of(
                        "hello",
                        "java",
                        new String[]{
                                "9", "\nNo", "Hello", "Java"
                        }
                ),
                Arguments.of(
                        "java",
                        "java",
                        new String[]{
                                "8", "\nNo", "Java", "Java"
                        }
                ),
                Arguments.of(
                        "java",
                        "hello",
                        new String[]{
                                "9", "\nYes", "Java", "Hello"
                        }
                ),
                Arguments.of(
                        "ma",
                        "mad",
                        new String[]{
                                "5", "\nNo", "Ma", "Mad"
                        }
                )
        );
    }
}
