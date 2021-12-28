package com.gd.internship.alimov;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Anagrams {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        if (a.equalsIgnoreCase(b)) {
            return true;
        }

        if (b.equalsIgnoreCase(new StringBuilder().append(a)
                .reverse()
                .toString())) {
            return true;

        } else {
            String[][] resA = charsMapping(a);
            String[][] resB = charsMapping(b);
            return Arrays.deepEquals(resA, resB);
        }
    }

    static String[][] charsMapping(String string){
        char[] chars = new char[string.length()];
        int[] indexes = new int[string.length()];
        int[] indexesLimit = new int[string.length()];

        boolean isIncluded = true;

        int index = 0;
        int indexLimit = 0;
        int lastIndexInto = 0;

        for (int i=0;i<string.length();i++){

            int indexInto = 0;
            final int finalI = i;

            if (i!=0 && IntStream.of(indexesLimit).anyMatch(x->x == finalI)){
                continue;
            }

            char left;
            char right;

            for (int j=i+1;j<=string.length();j++){
                left = string.toLowerCase().charAt(i);

                if (isIncluded){
                    chars[index] = left;
                    index++;
                    indexInto++;
                    isIncluded = false;
                }
                if (j==string.length()){
                    break;
                }

                right = string.toLowerCase().charAt(j);

                if (left==right){
                    indexesLimit[indexLimit] = j;
                    indexLimit++;
                    indexInto++;
                }
            }

            //  because character always included 1 time as default
            isIncluded = true;
            indexes[lastIndexInto]=indexInto;
            lastIndexInto++;
        }

        chars = Arrays.copyOf(chars,index);
        indexes = Arrays.copyOf(indexes,lastIndexInto);

        // result mapping to String[][] as {{character,count},{character,count}, ...}
        String[][] result = new String[chars.length][2];

        for (int i=0;i<chars.length;i++) {
            for (int j = 0; j < 1; j++) {
                result[i][j] = String.valueOf(chars[i]);
                result[i][j+1] = String.valueOf(indexes[i]);
            }
        }

        sortMatrix(result);
        return result;
    }

    static void sortMatrix(String[][] matrix){
        Arrays.sort(matrix,(s1,s2) -> {
            for (int i = 0; i < matrix[i].length; i++) {
                if (!s1[i].equals(s2[i])) {
                    return Integer.parseInt(String.valueOf(s1[i].charAt(0) - s2[i].charAt(0)));
                }
            }
            return 1;
        });
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
