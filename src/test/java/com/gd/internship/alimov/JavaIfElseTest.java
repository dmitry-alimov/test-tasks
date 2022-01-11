package com.gd.internship.alimov;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JavaIfElseTest {

    @Test
    public void weird_Or_Not_Test() {
        String actual1 = JavaIfElse.weirdOrNot(3);
        String actual2 = JavaIfElse.weirdOrNot(24);
        String actual3 = JavaIfElse.weirdOrNot(23);
        String actual4 = JavaIfElse.weirdOrNot(3);
        String actual5 = JavaIfElse.weirdOrNot(4);

        assertEquals("Weird", actual1);
        assertEquals("Not Weird", actual2);
        assertEquals("Weird", actual3);
        assertEquals("Weird", actual4);
        assertEquals("Not Weird", actual5);
    }

}
