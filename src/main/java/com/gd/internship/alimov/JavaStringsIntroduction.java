package com.gd.internship.alimov;

import java.util.*;

public class JavaStringsIntroduction {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length()+B.length());

        if (A.compareTo(B)>0) {
            System.out.println("Yes");
        } else System.out.println("No");

        List<String> listStrings = new ArrayList<>(Arrays.asList(A,B));

        printList(rebaseStringsToFirstCharacterUpperCase(listStrings));
    }

    public static List<String> rebaseStringsToFirstCharacterUpperCase(List<String> list){

        ListIterator<String> i = list.listIterator();

        while (i.hasNext()) {
            String s = i.next();
            i.set(s.substring(0,1)
                    .toUpperCase(Locale.ROOT) + s.substring(1));
        }
        return list;
    }

    public static void printList(List<String> list){
        for (Object item: list) {
            System.out.print(item +" ");
        }
    }
}




