package io.jmlim.java.traning.java8.defaultmethod;

public interface Formula {
    double calculate(int a);
    default double sqrt(int a) {
        return Math.sqrt(a);
    }
}
