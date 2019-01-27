package io.jmlim.java.traning.java8.stream.supplier;

import java.util.function.Supplier;
import java.util.stream.Stream;

public class ReuseAStreamTest {
    public static void main(String[] args) {

        String[] array = {"a", "b", "c", "d", "e"};

        Supplier<Stream<String>> streamSupplier = () -> Stream.of(array);

        streamSupplier.get().forEach(System.out::println);
        long count = streamSupplier.get().filter(x -> "b".equals(x)).count();
        System.out.println(count);
    }
}
