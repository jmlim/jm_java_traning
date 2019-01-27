package io.jmlim.java.traning.java8.stream.groupingandsort;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupingCountTest {
    public static void main(String[] args) {
        List<String> items =
                Arrays.asList("apple", "apple", "banana","apple", "orange", "banana", "papaya");

        Map<String, Long> result = items.stream()
                .collect(Collectors.groupingBy(Function.identity() // <-- this,
                        , Collectors.counting()));
        System.out.println(result);
    }
}
