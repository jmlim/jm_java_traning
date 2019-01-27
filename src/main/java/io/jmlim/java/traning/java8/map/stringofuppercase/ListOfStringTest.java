package io.jmlim.java.traning.java8.map.stringofuppercase;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListOfStringTest {
    public static void main(String[] args) {
        List<Staff> staff = Arrays.asList(
                new Staff("jmlim", 30, new BigDecimal(10000)),
                new Staff("aehee", 27, new BigDecimal(20000)),
                new Staff("baybay", 33, new BigDecimal(30000))
        );

        //Before Java 8
        List<String> result7 = new ArrayList<>();
        for (Staff x : staff) {
            result7.add(x.getName());
        }
        System.out.println(result7);

        System.out.println();
        //java 8
        List<String> result8 = staff.stream().map(Staff::getName).collect(Collectors.toList());
        System.out.println(result8);
        result8 = staff.stream().map(s -> s.getName()).collect(Collectors.toList());
        System.out.println(result8);

    }
}
