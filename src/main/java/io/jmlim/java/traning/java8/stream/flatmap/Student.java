package io.jmlim.java.traning.java8.stream.flatmap;

import java.util.HashSet;
import java.util.Set;

public class Student {

    private String name;
    private Set<String> book;

    public void addBook(String book) {
        if (this.book == null) {
            this.book = new HashSet<>();
        }
        this.book.add(book);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<String> getBook() {
        return book;
    }

    public void setBook(Set<String> book) {
        this.book = book;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", book=" + book +
                '}';
    }
}
