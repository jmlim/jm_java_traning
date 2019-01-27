package io.jmlim.java.traning.java8.optional;

import java.util.Optional;

public class IntegerOptionalTest {
    public static void main(String[] args) {
        IntegerOptionalTest t = new IntegerOptionalTest();
        Integer value1 = null;
        Integer value2 = new Integer(10);

        // null 파라미터를 허용한다.
        Optional<Integer> a = Optional.ofNullable(value1);
        Optional<Integer> b = Optional.of(value2);

        System.out.println(t.sum(a,b));
    }

    private Integer sum(Optional<Integer> a, Optional<Integer> b) {
        System.out.println("First parameter is present: " + a.isPresent());
        System.out.println("Second parameter is present: " + b.isPresent());

        //Optional.orElse - returns the value if present otherwise returns
        //the default value passed.
        Integer value1 = a.orElse(new Integer(0));

        //Optional.get - gets the value, value should be present
        Integer value2 = b.get();
        return value2;
    }
}
