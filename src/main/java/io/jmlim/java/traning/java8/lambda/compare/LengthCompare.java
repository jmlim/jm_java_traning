package io.jmlim.java.traning.java8.lambda.compare;

import java.util.Comparator;

public class LengthCompare implements Comparator<String> {
    @Override
    public int compare(String first, String second) {
        return Integer.compare(first.length(), second.length());
    }
}

