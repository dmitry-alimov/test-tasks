package com.gd.internship.alimov;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.*;
import java.util.Arrays;
import static org.junit.Assert.assertEquals;

public class JavaBigDecimalTest {

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
    public void javaBigDecimal1Test() throws IOException {
        fips = new FileInputStream("./src/test/resources/javaBigDecimal1Test.txt");
        System.setIn(fips);
        JavaBigDecimal.main(null);
        System.setIn(original);
        assertEquals(Arrays.asList("90",
                "56.6",
                "50",
                "02.34",
                "0.12",
                ".12",
                "0",
                "000.000",
                "-100",
                "null",
                "null")+"\n", outContent.toString());
    }

    @Test
    public void javaBigDecimal2Test() throws IOException {
        fips = new FileInputStream("./src/test/resources/javaBigDecimal2Test.txt");
        System.setIn(fips);
        JavaBigDecimal.main(null);
        System.setIn(original);
        assertEquals(Arrays.asList("324324",
                "4546",
                "766",
                "123",
                "100",
                "45",
                "0.325",
                ".324",
                "0",
                "-234",
                "null",
                "null")+"\n", outContent.toString());
    }

}
