package io.jmlim.java.traning.java8.lambda.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CompareTest {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("aawebawv");
        stringList.add("qqweq");
        stringList.add("qqweqww");
        for(String s : stringList) {
            System.out.println(s);
        }
        System.out.println();
        //java7
        Collections.sort(stringList, new Comparator<String>() {
            @Override
            public int compare(String first, String second) {
                return  Integer.compare(first.length(), second.length());
            }
        });
        for(String s : stringList) {
            System.out.println(s);
        }

        stringList.clear();
        stringList.add("aaaaaaaaawqwev");
        stringList.add("aaaaaaaaaa");
        stringList.add("aaawaaaaaaaaaqwev");
        for(String s : stringList) {
            System.out.println(s);
        }
        System.out.println();
        //java8
        Collections.sort(stringList, (first, second) -> {
            return Integer.compare(first.length(), second.length());
        });
        for(String s : stringList) {
            System.out.println(s);
        }
    }
}
