package com.gd.internship.alimov;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import java.util.InputMismatchException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class JavaExceptionHandlingTryCatchTest {

    @DisplayName("Should pass when method returns num")
    @ParameterizedTest
    @CsvSource({"10,3,3", "4,2,2"})
    public void divide_Test(String x, String y, String expected) {
        String actual1 = JavaExceptionHandlingTryCatch.divide(x, y);
        assertEquals(expected, actual1);
    }

    @DisplayName("Should pass when method returns InputMismatchException")
    @ParameterizedTest
    @CsvSource({"10,Hello"})
    public void divide_Test_With_InputMismatchException(String a, String b) {
        Exception actual = assertThrows(Exception.class, () -> JavaExceptionHandlingTryCatch.divide(a, b));
        assertEquals(InputMismatchException.class, actual.getClass());
    }

    @DisplayName("Should pass when method returns / by zero ArithmeticException")
    @ParameterizedTest
    @CsvSource({"10, 0"})
    public void divide_Test_With_By_Zero_ArithmeticException(String a, String b) {
        Exception actual = assertThrows(Exception.class, () -> JavaExceptionHandlingTryCatch.divide(a, b));
        assertEquals("/ by zero", actual.getMessage());
        assertEquals(ArithmeticException.class, actual.getClass());
    }

    @DisplayName("Should pass when method returns ArithmeticException")
    @ParameterizedTest
    @CsvSource({"23.323, 0"})
    public void divide_Test_With_ArithmeticException(String a, String b) {
        Exception actual = assertThrows(Exception.class, () -> JavaExceptionHandlingTryCatch.divide(a, b));
        assertEquals(InputMismatchException.class, actual.getClass());
    }
}
