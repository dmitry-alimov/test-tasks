package com.gd.internship.alimov;

import org.junit.Assert;
import org.junit.Test;

public class JavaDataTypesTest {

    @Test
    public void intsFittedTest(){
        String expected1 = "-150 can be fitted in:\n" +
                "* short\n" +
                "* int\n" +
                "* long\n";

        String expected2 = "150000 can be fitted in:\n" +
                "* int\n" +
                "* long\n";

        String expected3 = "1500000000 can be fitted in:\n" +
                "* int\n" +
                "* long\n";

        String expected4 = "213333333333333333333333333333333333 can't be fitted anywhere.\n";

        String expected5 = "-100000000000000 can be fitted in:\n" +
                "* long\n";

        String actual1 = JavaDataTypes.intsFitted("-150");
        String actual2 = JavaDataTypes.intsFitted("150000");
        String actual3 = JavaDataTypes.intsFitted("1500000000");
        String actual4 = JavaDataTypes.intsFitted("213333333333333333333333333333333333");
        String actual5 = JavaDataTypes.intsFitted("-100000000000000");

        Assert.assertEquals(expected1,actual1);
        Assert.assertEquals(expected2,actual2);
        Assert.assertEquals(expected3,actual3);
        Assert.assertEquals(expected4,actual4);
        Assert.assertEquals(expected5,actual5);
    }
}
