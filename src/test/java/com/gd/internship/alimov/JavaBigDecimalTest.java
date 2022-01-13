package com.gd.internship.alimov;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class JavaBigDecimalTest {

    @DisplayName("Should pass when method array is descending")
    @ParameterizedTest
    @MethodSource
    public void descending_Big_Decimals_Test(String[] actual, String[] expected) {
        JavaBigDecimal.descendingBigDecimals(actual);
        assertArrayEquals(expected, actual);
    }

    private static Stream<Arguments> descending_Big_Decimals_Test() {
        return Stream.of(
                Arguments.of(
                        new String[]{
                                "-100",
                                "50",
                                "0",
                                "56.6",
                                "90",
                                "0.12",
                                ".12",
                                "02.34",
                                "000.000"},
                        new String[]{
                                "90",
                                "56.6",
                                "50",
                                "02.34",
                                "0.12",
                                ".12",
                                "0",
                                "000.000",
                                "-100"}
                ),
                Arguments.of(
                        new String[]{
                                "0.325",
                                "4546",
                                "-234",
                                "0",
                                "123",
                                "766",
                                ".324",
                                "324324",
                                "100",
                                "45"},
                        new String[]{
                                "324324",
                                "4546",
                                "766",
                                "123",
                                "100",
                                "45",
                                "0.325",
                                ".324",
                                "0",
                                "-234"}
                )
        );
    }
}
