package com.kodilla.patterns.prototype.library;

import java.util.ArrayList;
import java.util.List;

public class BooksList {
    final private String name;
    final private List<Book> books = new ArrayList<>();

    public BooksList(final String name) {
        this.name = name;
    }

    public List<Book> getBooks() {
        return books;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        String s = "   List [" + name + "]";
        for(Book book : books) {
            s = s + "\n" + book.toString();
        }
        return s;
    }
}
