package com.gd.internship.alimov;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.*;

import static org.junit.Assert.assertEquals;

public class JavaExceptionHandlingTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;
    private final InputStream original = System.in;
    private FileInputStream fips;

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
    public void JavaExceptionHandling1Test() throws IOException {
        fips = new FileInputStream("./src/test/resources/javaExceptionHandling1Test.txt");
        System.setIn(fips);
        JavaExceptionHandling.main(null);
        System.setIn(original);

        assertEquals("243\n" +
                "16\n" +
                "java.lang.Exception: n and p should not be zero.\n" +
                "java.lang.Exception: n or p should not be negative.\n" +
                "java.lang.Exception: n or p should not be negative.\n", outContent.toString());
        fips.close();
    }
}
