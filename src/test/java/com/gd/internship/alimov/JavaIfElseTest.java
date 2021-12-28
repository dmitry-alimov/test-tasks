package com.gd.internship.alimov;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.*;

import static org.junit.Assert.assertEquals;

public class JavaIfElseTest {
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
    public void javaIfElseMain1Test() throws IOException {
        fips = new FileInputStream("./src/test/resources/javaIfElseMain1Test.txt");
        System.setIn(fips);
        JavaIfElse.main(null);
        System.setIn(original);
        assertEquals("Weird\n", outContent.toString());
    }

}
