package com.gd.internship.alimov;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JavaDataTypesTest {

    @DisplayName("Should pass when method returns ... can't be fitted anywhere")
    @ParameterizedTest
    @CsvSource({"-150 can be fitted in: " +
            "* short " +
            "* int " +
            "* long" +
            ",-150",
            "150000 can be fitted in: " +
                    "* int " +
                    "* long" + ",150000",
            "1500000000 can be fitted in: " +
                    "* int " +
                    "* long" + ",1500000000",
            "-100000000000000 can be fitted in: " +
                    "* long" + ",-100000000000000"
    })
    public void ints_Fitted_Can_Be_Fitted_Test(String expected, String actual) {
        assertEquals(expected, JavaDataTypes.intsFitted(actual));
    }

    @DisplayName("Should pass when method returns ... can't be fitted anywhere")
    @ParameterizedTest
    @CsvSource({"213333333333333333333333333333333333 can't be fitted anywhere.," +
            "213333333333333333333333333333333333"})
    public void ints_Fitted_Can_not_Be_Fitted_Test(String expected, String actual) {
        assertEquals(expected, JavaDataTypes.intsFitted(actual));
    }
}
