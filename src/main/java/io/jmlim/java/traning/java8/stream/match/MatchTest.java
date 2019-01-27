package io.jmlim.java.traning.java8.stream.match;

import java.util.ArrayList;
import java.util.List;

public class MatchTest {
    public static void main(String[] args) {
        List<String> stringCollection = new ArrayList<>();
        stringCollection.add("jmlim");
        stringCollection.add("okboy");
        stringCollection.add("eyeq");
        stringCollection.add("aehee");
        stringCollection.add("study");
        stringCollection.add("babo");
        stringCollection.add("bbbbb");
        stringCollection.add("kuu");

        //하나만 맞아도 트루
        boolean anyStartsWithB = stringCollection.stream().anyMatch((s) -> s.startsWith("b"));
        System.out.println(anyStartsWithB);

        // 다 맞아야 트루
        boolean allStartsWithB = stringCollection.stream().allMatch((s) -> s.startsWith("b"));
        System.out.println(allStartsWithB);

        //하나도 맞지 않아야 트루
        boolean noneStartsWithY =
                stringCollection
                        .stream()
                        .noneMatch((s) -> s.startsWith("z"));

        System.out.println(noneStartsWithY);      // true
    }
}
