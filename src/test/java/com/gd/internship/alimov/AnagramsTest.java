package com.gd.internship.alimov;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.*;
import static org.junit.Assert.*;

public class AnagramsTest {

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
    public void anagramMain1Test() throws IOException {
            fips = new FileInputStream("./src/test/resources/anagram1Test.txt");
            System.setIn(fips);
            Anagrams.main(null);
            System.setIn(original);
            assertEquals("Anagrams\n", outContent.toString());
    }

    @Test
    public void anagramMain2Test() throws IOException {
        fips = new FileInputStream("./src/test/resources/anagram2Test.txt");
        System.setIn(fips);
        Anagrams.main(null);
        System.setIn(original);
        assertEquals("Anagrams\n", outContent.toString());
    }

    @Test
    public void anagramMain3Test() throws IOException {
        fips = new FileInputStream("./src/test/resources/anagram3Test.txt");
        System.setIn(fips);
        Anagrams.main(null);
        System.setIn(original);
        assertEquals("Not Anagrams\n", outContent.toString());
    }

    @Test
    public void isAnagram1Test() {
        assertTrue(Anagrams.isAnagram("hello", "Hello"));
        assertTrue(Anagrams.isAnagram("bbcccxxxyyy", "yyxxyxccbcb"));
        assertTrue(Anagrams.isAnagram("Abul", "BulA"));
        assertTrue(Anagrams.isAnagram("madam", "amadm"));
    }

    @Test
    public void isAnagram2Test() {
        assertFalse(Anagrams.isAnagram("anagramm", "marganaa"));
        assertFalse(Anagrams.isAnagram("abbce", "ffort"));
        assertFalse(Anagrams.isAnagram("calculate", "etaluclace"));
        assertFalse(Anagrams.isAnagram("madam", "amadmm"));
    }

    @Test
    public void charsMapping1Test() {
        String string = "hello";
        String[][] mappingMatrix = new String[][]{{"e","1"},{"h","1"},{"l","2"},{"o","1"}};
        assertArrayEquals(Anagrams.charsMapping(string),mappingMatrix);
    }

    @Test
    public void charsMapping2Test() {
        String string = "hello";
        // Need to look like
        // {"e","1"},{"h","1"},{"l","2"},{"o","1"}
        // because then matrix is sort by alphabet
        String[][] mappingMatrix = new String[][]{{"h","1"},{"e","1"},{"l","2"},{"o","1"}};
        assertNotEquals(Anagrams.charsMapping(string),mappingMatrix);
    }

    @Test
    public void charsMapping3Test() {
        String string = "bbcccxxxyyy";
        String[][] mappingMatrix = new String[][]{{"b","2"},{"c","3"},{"x","3"},{"y","3"}};
        assertArrayEquals(Anagrams.charsMapping(string),mappingMatrix);
    }

    @Test
    public void sortMatrix1Test() {
        String[][] mappingMatrix = new String[][]{{"h","1"},{"e","1"},{"l","2"},{"o","1"}};
        String[][] sortMatrix = new String[][]{{"e","1"},{"h","1"},{"l","2"},{"o","1"}};
        Anagrams.sortMatrix(mappingMatrix);
        assertArrayEquals(mappingMatrix,sortMatrix);
    }

    @Test
    public void sortMatrix2Test() {
        String[][] mappingMatrix = new String[][]{{"m","2"},{"a","2"},{"d","1"}};
        String[][] sortMatrix = new String[][]{{"a","2"},{"d","1"},{"m","2"}};
        Anagrams.sortMatrix(mappingMatrix);
        assertArrayEquals(mappingMatrix,sortMatrix);
    }

    @Test
    public void sortMatrix3Test() {
        String[][] mappingMatrix = new String[][]{{"m","2"},{"a","2"},{"d","2"}};
        String[][] sortMatrix = new String[][]{{"m","2"},{"a","2"},{"d","2"}};
        Anagrams.sortMatrix(mappingMatrix);
        assertNotEquals(mappingMatrix,sortMatrix);
    }

}
