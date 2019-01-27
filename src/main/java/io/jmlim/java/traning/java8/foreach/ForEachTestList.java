package io.jmlim.java.traning.java8.foreach;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEachTestList {
    public static void main(String[] args) {
        List<String> items = new ArrayList<>();
        items.add("A");
        items.add("B");
        items.add("C");
        items.add("D");
        items.add("E");

        //java7
        for(String item : items){
            System.out.println(item);
        }

        System.out.println();

        //java8
        items.forEach(item -> System.out.println(item));
        System.out.println();
        //Output : C
        items.forEach(item->{
            if("C".equals(item)){
                System.out.println(item);
            }
        });
        System.out.println();

        //method reference
        items.forEach(System.out::println);
        System.out.println();

        //stream filter
        items.stream()
                .filter(s -> s.contains("B"))
                .forEach(System.out::println);
    }
}
