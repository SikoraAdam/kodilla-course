package com.kodilla.patterns.prototype.library;

import com.kodilla.patterns.prototype.Prototype;

import java.util.HashSet;
import java.util.Set;

public final class Library extends Prototype {
    private String name;
    private Set<BooksList> books = new HashSet<>();

    public Library(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Set<BooksList> getBooks() {
        return books;
    }

    public Library shallowCopy() throws CloneNotSupportedException {
        return (Library) super.clone();
    }

    @Override
    public String toString() {
        String s = "Library [" + name + "]\n";
        for(BooksList list : books) {
            s = s + list.toString() + "\n";
        }
        return s;
    }

    public Library deepCopy() throws CloneNotSupportedException {
        Library clonedLibrary = (Library) super.clone();
        clonedLibrary.books = new HashSet<>();
        for(BooksList theList : books) {
            BooksList clonedList = new BooksList(theList.getName());
            for(Book task : theList.getBooks()) {
                clonedList.getBooks().add(task);
            }
            clonedLibrary.getBooks().add(clonedList);
        }
        return clonedLibrary;
    }
}