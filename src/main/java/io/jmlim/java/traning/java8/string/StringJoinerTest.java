package io.jmlim.java.traning.java8.string;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class StringJoinerTest {
    public static void main(String[] args) {
        StringJoiner sj = new StringJoiner(",");
        sj.add("aaa");
        sj.add("bbb");
        sj.add("ccc");

        System.out.println(sj.toString());

        StringJoiner sj2 = new StringJoiner("/", "prefix-", "-suffix");

        sj2.add("2018");
        sj2.add("06");
        sj2.add("23");
        System.out.println(sj2.toString());

        //String.join Test
        String result = String.join("-","2018","06","23");
        System.out.println(result);

        //Join a List by a delimiter
        List<String> list = Arrays.asList("jmlim","aehee","muk");
        result = String.join(", ", list);
        System.out.println(result);

        //Collectors.joining
        List<String> joinTarget = Arrays.asList("java", "python", "nodejs", "ruby");
        result = joinTarget.stream().collect(Collectors.joining(" | "));
        System.out.println(result);
    }
}
