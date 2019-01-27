package io.jmlim.java.traning.java8.stream.filterandcollect;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterAndCollectTest {
    public static void main(String[] args) {
        List<String> lines = Arrays.asList("jmlim", "aehee", "muksoon");

        //java7
        List<String> result7 = new ArrayList<>();
        for (String line : lines) {
            if (!"jmlim".equals(line)) {
                result7.add(line);
            }
        }
        for (String temp : result7) {
            System.out.println(temp);
        }

        System.out.println();
        //java8
        List<String> result8 = lines.stream()
                .filter(s -> !"muksoon".equals(s))
                .collect(Collectors.toList());
        result8.forEach(System.out::println);
    }
}
