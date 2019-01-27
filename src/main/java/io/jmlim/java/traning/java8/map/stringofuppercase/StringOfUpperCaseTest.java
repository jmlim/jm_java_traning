package io.jmlim.java.traning.java8.map.stringofuppercase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringOfUpperCaseTest {
    public static void main(String[] args) {
        List<String> alpha = Arrays.asList("a", "b", "c", "d");

        //Before Java8
        List<String> alphaUpper7 = new ArrayList<>();
        for (String s : alpha) {
            alphaUpper7.add(s.toUpperCase());
        }
        System.out.println(alpha); //[a, b, c, d]
        System.out.println(alphaUpper7); //[A, B, C, D]

        System.out.println();
        //java 8
        List<String> alphaUpper8 = alpha.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(alphaUpper8);

        // Extra, streams apply to any data type.
        List<Integer> num = Arrays.asList(1,2,3,4,5);
        List<Integer> num2 = num.stream().map(n -> n * 2).collect(Collectors.toList());
        System.out.println(num2);

    }
}
