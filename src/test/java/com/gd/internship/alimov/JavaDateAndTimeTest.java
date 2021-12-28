package com.gd.internship.alimov;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.*;

import static org.junit.Assert.assertEquals;

public class JavaDateAndTimeTest {

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
    public void JavaDateAndTime1Test() throws IOException {
        fips = new FileInputStream("./src/test/resources/javaDateAndTime1Test.txt");
        System.setIn(fips);
        JavaDateAndTime.main(null);
        System.setIn(original);
        assertEquals("TUESDAY\n", outContent.toString());
    }

    @Test
    public void JavaDateAndTime2Test() throws IOException {
        fips = new FileInputStream("./src/test/resources/javaDateAndTime2Test.txt");
        System.setIn(fips);
        JavaDateAndTime.main(null);
        System.setIn(original);
        assertEquals("SATURDAY\n", outContent.toString());
    }
}
