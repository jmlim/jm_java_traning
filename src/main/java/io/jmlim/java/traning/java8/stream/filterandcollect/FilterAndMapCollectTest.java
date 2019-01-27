package io.jmlim.java.traning.java8.stream.filterandcollect;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterAndMapCollectTest {
    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(
                new Person("jmlim", 30),
                new Person("aehee", 20),
                new Person("bay", 40)
        );

        //java8 filter map
        String name = persons.stream()
                .filter(s -> "bay".equals(s.getName()))
                .map(Person::getName)
                .findAny()
                .orElse("not found");

        System.out.println(name);
        System.out.println();
        //java 8 map string list
        List<String> collect = persons.stream()
                .map(Person::getName)
                .collect(Collectors.toList());

        collect.forEach(System.out::println);
    }
}
