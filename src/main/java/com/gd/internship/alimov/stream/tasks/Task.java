package com.gd.internship.alimov.stream.tasks;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task {

    public Map<Integer, List<String>> groupByDigitNumbers(int[] input) {
        return Arrays.stream(input).boxed()
                .filter(i -> i >= 0)
                .map(string -> {
                    if (Integer.parseInt(String.valueOf(string)) % 2 == 0) {
                        return "e" + string;
                    } else {
                        return "o" + string;
                    }
                })
                .collect(Collectors.groupingBy(string -> string.length() - 1));
    }
}
