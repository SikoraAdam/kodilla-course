package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.*;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Classifier;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookSignature;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.Statistics;

import java.util.*;

public class MedianAdapter extends MedianAdaptee implements Classifier {

    @Override
    public int publicationYearMedian(Set<Book> bookSet) {

        Statistics statistics = new Statistics();
        Map<BookSignature, com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book> mapBook = new HashMap<>();

        for (Book bookA : bookSet) {
            com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book bookB =
                    new com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book (bookA.getAuthor(), bookA.getTitle(), bookA.getPublicationYear());
            mapBook.put(new BookSignature(bookA.getSignature()), bookB);
        }

        return statistics.medianPublicationYear(mapBook);
    }
}
