package io.jmlim.java.traning.java8.stream.flatmap;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamStringArrFlatMapTest {
    public static void main(String[] args) {
        String[][] data = new String[][]{{"a", "b"}, {"c", "d"}, {"e", "f"}};
        Stream<String[]> temp = Arrays.stream(data);

        //{ {'a','b'}, {'c','d'}, {'e','f'} } -> flatMap -> {'a','b','c','d','e','f'}
        Stream<String> stringStream = temp.flatMap(x -> Arrays.stream(x));
        Stream<String> stream2 = stringStream.filter(x -> "a".equals(x.toString()));
        stream2.forEach(System.out::println);

    }
}
