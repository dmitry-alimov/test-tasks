package com.gd.internship.alimov;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.*;
import static org.junit.Assert.assertEquals;

public class JavaStringsIntroductionTest {

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
    public void javaStringsIntroductionMain1Test() throws IOException {
        fips = new FileInputStream("./src/test/resources/javaStringsIntroductionMain1Test.txt");
        System.setIn(fips);
        JavaStringsIntroduction.main(null);
        System.setIn(original);
        assertEquals("9\n" +
                "No\n" +
                "Hello Java ", outContent.toString());
    }

}
