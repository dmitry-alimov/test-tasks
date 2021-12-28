package com.gd.internship.alimov;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.*;

import static org.junit.Assert.assertEquals;

public class JavaSubArrayTest {
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
    public void JavaSubArrayMain1Test() throws IOException {
        fips = new FileInputStream("./src/test/resources/JavaSubArrayMain1Test.txt");
        System.setIn(fips);
        JavaSubArray.main(null);
        System.setIn(original);
        assertEquals("9\n", outContent.toString());
    }

    @Test
    public void JavaSubArrayCount1Test() throws IOException {
        int result = JavaSubArray.count("15 -5 -100 -35 64", 5);
        assertEquals(20, result);
    }
}
