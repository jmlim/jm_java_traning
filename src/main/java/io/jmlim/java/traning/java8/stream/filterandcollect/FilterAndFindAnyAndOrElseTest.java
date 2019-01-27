package io.jmlim.java.traning.java8.stream.filterandcollect;

import java.util.Arrays;
import java.util.List;

public class FilterAndFindAnyAndOrElseTest {
    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(
                new Person("jmlim", 30),
                new Person("aehee", 20),
                new Person("sunyoung", 40)
        );

        //java7 find
        Person result7 = null;
        for (Person temp : persons) {
            if ("aehee".equals(temp.getName())) {
                result7 = temp;
            }
        }
        System.out.println(result7);

        System.out.println();
        //java8 find
        Person resultFindAny8 = persons.stream().filter(s -> "jmlim".equals(s.getName())).findAny().orElse(null);
        System.out.println(resultFindAny8);
        //java8 not find
        Person resultOrElse8 = persons.stream().filter(s -> "babo".equals(s.getName())).findAny().orElse(null);
        System.out.println(resultOrElse8);

    }
}
