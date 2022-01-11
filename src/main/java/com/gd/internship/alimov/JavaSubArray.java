package com.gd.internship.alimov;

public class JavaSubArray {

    static int count;

    static int countNegativeSubArrays(int[] a, int range) {
        if (a == null) {
            return 0;
        }

        if (range == 1) {
            return a[0] < 0 ? 1 : 0;
        }

        int discardFromTheBeginning = 0;

        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i; j < a.length - 1; j++) {
                if (a.length - discardFromTheBeginning < 1) {
                    break;
                }
                sum(a, discardFromTheBeginning, 0);
                discardFromTheBeginning++;
            }
        }
        return count;
    }

    static void sum(int[] array, int discardFromTheBeginning, int discardFromTheEnd) {
        int sumSubArray = 0;

        for (int j = discardFromTheBeginning; j < array.length - discardFromTheEnd; j++) {
            sumSubArray += array[j];
        }

        if (sumSubArray < 0) count++;

        if (discardFromTheEnd == array.length) {
        } else sum(array, discardFromTheBeginning, ++discardFromTheEnd);
    }
}
