package com.gd.internship.alimov;

public class JavaDataTypes {

    public static String intsFitted(String str) {

        StringBuilder sb = new StringBuilder();

        long x;

        try {

            x = Long.parseLong(str);
            String res = x + " can be fitted in: ";
            sb.append(res);

            if (x >= -128 && x <= 127)
                sb.append("* byte ");
            if (x >= Short.MIN_VALUE && x <= Short.MAX_VALUE)
                sb.append("* short ");
            if (x >= Integer.MIN_VALUE && x <= Integer.MAX_VALUE)
                sb.append("* int ");
            if (x >= Long.MIN_VALUE && x <= Long.MAX_VALUE)
                sb.append("* long");

        } catch (Exception e) {
            sb.append(str).append(" can't be fitted anywhere.");
        }
        return sb.toString();
    }
}
