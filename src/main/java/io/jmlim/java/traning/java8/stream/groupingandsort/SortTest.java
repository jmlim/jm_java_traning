package io.jmlim.java.traning.java8.stream.groupingandsort;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SortTest {
    public static void main(String[] args) {
        List<String> items =
                Arrays.asList("apple", "apple", "banana","apple", "orange", "banana", "papaya");

        Map<String, Long> result = items.stream()
                .collect(Collectors.groupingBy(Function.identity() // <-- this,
                        , Collectors.counting()));
        System.out.println(result);

        //순서를 유지하는 hashmap
        Map<String, Long> finalMap = new LinkedHashMap<>();

        //Sort a map and add to finalMap
        result.entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue()
                        .reversed()).forEachOrdered(e -> finalMap.put(e.getKey(), e.getValue()));

        System.out.println(finalMap);
    }
}
