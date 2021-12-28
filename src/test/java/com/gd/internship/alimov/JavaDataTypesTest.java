package com.gd.internship.alimov;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.*;

import static org.junit.Assert.assertEquals;

public class JavaDataTypesTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;
    private final InputStream original = System.in;
    private FileInputStream fips = null;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }

    @Test
    public void javaDataTypesMain1Test() throws IOException {
        fips = new FileInputStream("./src/test/resources/javaDataTypes1Test.txt");
        System.setIn(fips);
        JavaDataTypes.main(null);
        System.setIn(original);
        assertEquals("-150 can be fitted in:\n" +
                "* short\n" +
                "* int\n" +
                "* long\n" +
                "150000 can be fitted in:\n" +
                "* int\n" +
                "* long\n" +
                "1500000000 can be fitted in:\n" +
                "* int\n" +
                "* long\n" +
                "213333333333333333333333333333333333 can't be fitted anywhere.\n" +
                "-100000000000000 can be fitted in:\n" +
                "* long\n", outContent.toString());
    }

    @Test
    public void javaDataTypesMain2Test() throws IOException {
        fips = new FileInputStream("./src/test/resources/javaDataTypes2Test.txt");
        System.setIn(fips);
        JavaDataTypes.main(null);
        System.setIn(original);
        assertEquals("9223372036854775808 can't be fitted anywhere.\n" +
                "9223372036854775807 can be fitted in:\n" +
                "* long\n" +
                "-9223372036854775808 can be fitted in:\n" +
                "* long\n" +
                "-9223372036854775807 can be fitted in:\n" +
                "* long\n" +
                "4294967296 can be fitted in:\n" +
                "* long\n" +
                "4294967295 can be fitted in:\n" +
                "* long\n" +
                "-4294967296 can be fitted in:\n" +
                "* long\n" +
                "-4294967295 can be fitted in:\n" +
                "* long\n" +
                "65536 can be fitted in:\n" +
                "* int\n" +
                "* long\n" +
                "65535 can be fitted in:\n" +
                "* int\n"+"* long\n" +
                "-65536 can be fitted in:\n" +
                "* int\n" +
                "* long\n" +
                "-65535 can be fitted in:\n" +
                "* int\n" +
                "* long\n" +
                "256 can be fitted in:\n" +
                "* short\n" +
                "* int\n" +
                "* long\n" +
                "255 can be fitted in:\n" +
                "* short\n" +
                "* int\n" +
                "* long\n" +
                "-256 can be fitted in:\n" +
                "* short\n" +
                "* int\n" +
                "* long\n" +
                "-255 can be fitted in:\n" +
                "* short\n" +
                "* int\n" +
                "* long\n" +
                "12222222222222222222222222222222222222222221 can't be fitted anywhere.\n", outContent.toString());
    }
}
