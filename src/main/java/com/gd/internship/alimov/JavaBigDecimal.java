package com.gd.internship.alimov;

import java.math.BigDecimal;
import java.util.*;

public class JavaBigDecimal {

    public static void descendingBigDecimals(String[] s) {
        Arrays.sort(s, 0, s.length, (o1, o2) -> {
            BigDecimal bigDecimal1 = new BigDecimal(o1);
            BigDecimal bigDecimal2 = new BigDecimal(o2);
            return bigDecimal2.compareTo(bigDecimal1);
        });
    }
}
