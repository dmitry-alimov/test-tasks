package com.gd.internship.alimov;

public class JavaSubArray {

    static int count;

    static int countNegativeSubArrays(int[] a, int range) {
        if (range == 1) {
            return a[0] < 0 ? 1 : 0;
        }

        int countNegative = 0;
        int[] temp;

        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i; j < a.length - 1; j++) {
                temp = new int[a.length];
                if (a.length - countNegative < 1) {
                    break;
                }
                System.arraycopy(a, countNegative, temp, 0, a.length - countNegative);
                sum(temp, countNegative);
                countNegative++;
            }
        }
        return count;
    }

    static void sum(int[] array, int countNegative) {
        int count = 0;
        int[] a = new int[array.length];

        System.arraycopy(array, 0, a, 0, array.length - countNegative);

        for (int j : a) {
            if (j == 0) break;
            count += j;
        }

        if (count < 0) JavaSubArray.count++;

        if (countNegative == array.length) {
        } else sum(array, ++countNegative);
    }
}
