package com.gd.internship.alimov;

public class JavaDataTypes {

    public static String intsFitted(String str) {

        StringBuilder sb = new StringBuilder();

        long x;

        try {

            x = Long.parseLong(str);
            String res = x + " can be fitted in:\n";
            sb.append(res);

            if (x >= -128 && x <= 127)
                sb.append("* byte\n");
            if (x >= Short.MIN_VALUE && x <= Short.MAX_VALUE)
                sb.append("* short\n");
            if (x >= Integer.MIN_VALUE && x <= Integer.MAX_VALUE)
                sb.append("* int\n");
            if (x >= Long.MIN_VALUE && x <= Long.MAX_VALUE)
                sb.append("* long\n");

        } catch (Exception e) {
            sb.append(str).append(" can't be fitted anywhere.\n");
        }
        return sb.toString();
    }
}
