package com.kodilla.patterns.prototype.library;

import org.junit.*;

import java.time.LocalDate;
import java.util.stream.IntStream;

public class LibraryTestSuite {

    @Test
    public void testGetBooks() {
        //given
        //creating the BooksList for books to rent
        BooksList listToDo = new BooksList("books to rent");
        IntStream.iterate(1, n -> n + 1)
                .limit(10)
                .forEach(n -> listToDo.getBooks().add(new Book("Book " + n, "Author " + n, LocalDate.now())));

        //creating the BooksList for books rent in progress
        BooksList listInProgress = new BooksList("books rent in progress");
        IntStream.iterate(1, n -> n + 1)
                .limit(10)
                .forEach(n -> listInProgress.getBooks().add(new Book("Book " + n, "Author " + n, LocalDate.now())));

        //creating the BooksList for rented books
        BooksList listDone = new BooksList("rented books");
        IntStream.iterate(1, n -> n + 1)
                .limit(10)
                .forEach(n -> listDone.getBooks().add(new Book("Book " + n, "Author " + n, LocalDate.now())));

        //creating the library and assigning the lists
        Library library = new Library("Library number 1");
        library.getBooks().add(listToDo);
        library.getBooks().add(listInProgress);
        library.getBooks().add(listDone);

        //making a shallow copy of object library
        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Library number 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //making a deep copy of object library
        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Library number 3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        library.getBooks().remove(listToDo);

        //Then
        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);
        Assert.assertEquals(2, library.getBooks().size());
        Assert.assertEquals(2, clonedLibrary.getBooks().size());
        Assert.assertEquals(3, deepClonedLibrary.getBooks().size());
        Assert.assertEquals(clonedLibrary.getBooks(), library.getBooks());
        Assert.assertNotEquals(deepClonedLibrary.getBooks(), library.getBooks());
    }
}
