package com.gd.internship.alimov.stream.tasks;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task {

    public Map<Integer, List<String>> groupByDigitNumbers(int[] input) {

        List<String> list = Arrays.stream(input).boxed()
                .map(String::valueOf).collect(Collectors.toList());

        for (int i = 0; i < list.size(); i++) {
            if (Integer.parseInt(list.get(i)) % 2 == 0) {
                list.set(i, "e" + list.get(i));
            } else list.set(i, "o" + list.get(i));
        }

        return list.stream()
                .map(String::valueOf)
                .collect(Collectors.groupingBy(i -> i.length() - 1));
    }
}
