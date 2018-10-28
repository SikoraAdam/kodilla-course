package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class MedianAdapterTestSuite {

    @Test
    public void publicationYearMedianTest() {
        //Given
        Book bookA1 = new Book("Grzes", "Cierpienie", 1990, "189");
        Book bookA2 = new Book("Jan", "Ego", 1991, "190");
        Book bookA3 = new Book("Wies", "Jajko", 2000, "200");

        Set<Book> librarySet = new HashSet<>();
        librarySet.add(bookA1);
        librarySet.add(bookA2);
        librarySet.add(bookA3);

        MedianAdapter medianAdapter = new MedianAdapter();

        //When
        int mediana = medianAdapter.publicationYearMedian(librarySet);

        //Then
        System.out.println(mediana);
        assertEquals(mediana, 1991);
    }
}
