package com.gd.internship.alimov;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.*;

import static org.junit.Assert.assertEquals;

public class JavaExceptionHandlingTryCatchTest {

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
    public void JavaExceptionHandlingTryCatchMain1Test() throws IOException {
        fips = new FileInputStream("./src/test/resources/JavaExceptionHandlingTryCatch1Test.txt");
        System.setIn(fips);
        JavaExceptionHandlingTryCatch.main(null);
        System.setIn(original);
        assertEquals("3\n", outContent.toString());
    }

    @Test
    public void JavaExceptionHandlingTryCatchMain2Test() throws IOException {
        fips = new FileInputStream("./src/test/resources/JavaExceptionHandlingTryCatch2Test.txt");
        System.setIn(fips);
        JavaExceptionHandlingTryCatch.main(null);
        System.setIn(original);
        assertEquals("java.util.InputMismatchException\n", outContent.toString());
    }

    @Test
    public void JavaExceptionHandlingTryCatchMain3Test() throws IOException {
        fips = new FileInputStream("./src/test/resources/JavaExceptionHandlingTryCatch3Test.txt");
        System.setIn(fips);
        JavaExceptionHandlingTryCatch.main(null);
        System.setIn(original);
        assertEquals("java.lang.ArithmeticException: / by zero\n", outContent.toString());
    }

    @Test
    public void JavaExceptionHandlingTryCatchMain4Test() throws IOException {
        fips = new FileInputStream("./src/test/resources/JavaExceptionHandlingTryCatch4Test.txt");
        System.setIn(fips);
        JavaExceptionHandlingTryCatch.main(null);
        System.setIn(original);
        assertEquals("java.util.InputMismatchException\n", outContent.toString());
    }
}
