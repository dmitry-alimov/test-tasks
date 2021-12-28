package com.gd.internship.alimov;

import java.util.*;
import java.util.stream.IntStream;

public class JavaSubArray {

    static int count;

    static int count(String a, int range){
        if(range==1){
            return Integer.parseInt(a)<0 ? 1:0;
        }
        String[] arrayString = a.split(" ");

        int[] array = Arrays.stream(arrayString)
                .flatMapToInt(num-> IntStream.of(Integer.parseInt(num)))
                .toArray();
        /*
           int[] a = new int[]{1,-2,-5,4,5};
                               1,-2,-5,4,5 +
                               1,-2,-5,4 +
                               1,-2,-5 +
                               1,-2 +
                               1 +
                                 -2,-5,4,5 +
                                 -2,-5,4 +
                                 -2,-5 +
                                 -2 +
                                    -5,4,5 +
                                    -5,4 +
                                    -5 +
                                       4,5 +
                                       4 +
                                      5 +
         */

        int countNegative = 0;
        int[] temp;

        for (int i=0;i<array.length-1;i++){
            for (int j=i;j<array.length-1;j++){
                temp = new int[array.length];
                if (array.length-countNegative<1){
                    break;
                }
                System.arraycopy(array,countNegative,temp,0,array.length-countNegative);
                sum(temp,countNegative);
                countNegative++;
            }
        }
        return count;
    }

    static void sum(int[] array, int countOtr){
        int count = 0;
        int[] a = new int[array.length];

        System.arraycopy(array,0,a,0,array.length-countOtr);

        for (int i=0;i<a.length;i++){
            if (a[i]==0) break;
            count += a[i];
        }

        if (count<0) JavaSubArray.count++;

        if (countOtr==array.length){}
        else sum(array,++countOtr);
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int range = scan.nextInt();
        scan.nextLine();
        String a = scan.nextLine();
        scan.close();
        System.out.println(count(a,range));
    }
}
