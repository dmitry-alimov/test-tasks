package com.gd.internship.alimov;

import java.math.BigDecimal;
import java.util.*;

public class JavaBigDecimal{
    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];

        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();

        //Write your code here
        Arrays.sort(s, 0, n, (o1, o2) -> {
            BigDecimal bigDecimal1 = new BigDecimal(o1);
            BigDecimal bigDecimal2 = new BigDecimal(o2);
            return bigDecimal2.compareTo(bigDecimal1);
        });
        //Output
        System.out.println(Arrays.asList(s));
    }
}