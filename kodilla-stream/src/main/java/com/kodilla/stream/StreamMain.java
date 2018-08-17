package com.kodilla.stream;

/*
import com.kodilla.stream.person.People;
import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.reference.FunctionalCalculator;
*/

import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class StreamMain {
    public static void main(String[] args) {
        BookDirectory theBookDirectory = new BookDirectory();
        String theResultStringOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .map(Book::toString)
                .collect(Collectors.joining(",\n","<<",">>"));

        System.out.println(theResultStringOfBooks);

        //Module_7.3
        /*
        BookDirectory theBookDirectory = new BookDirectory();

        Map<String, Book> theResultMapOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .collect(Collectors.toMap(Book::getSignature, book -> book));

        System.out.println("# elements: " + theResultMapOfBooks.size());
        theResultMapOfBooks.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);


        People.getList().stream()
                .forEach(System.out::println);
        System.out.println("-----------------");

        //(transformacje) 'map' dziala jak for each, a na koncu zwracana jest inna kolekcja
        People.getList().stream()
                .map(s -> s.toUpperCase())
                .forEach(System.out::println);
        System.out.println("-----------------");

        People.getList().stream()
                .map(String::toUpperCase)
                .forEach(s -> System.out.println(s));
        System.out.println("-----------------");

        //(filtracje) 'filter' zwraca true lub false decydujac czy obiekt przejdzie dalej
        People.getList().stream()
                .filter(s -> s.length() > 11)
                .forEach(System.out::println);
        System.out.println("-----------------");

        //mieszanie transformacji i filtracji
        People.getList().stream()
                .map(String::toUpperCase)
                .filter(s -> s.length() > 11)
                .map(s -> s.substring(0, s.indexOf(' ') + 2) + ".")
                .filter(s -> s.substring(0, 1).equals("M"))
                .forEach(System.out::println);
        */
    }

        //Module_7.1 + Module7.2
        /*
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

        System.out.println("Beautified texts:");
        poemBeautifier.beautify("malina", (malina) -> malina.toUpperCase());
        poemBeautifier.beautify("porzeczka", (porzeczka) -> porzeczka.replace('p', 'P'));
        poemBeautifier.beautify("melon", (melon) -> melon.substring(2,4));
        poemBeautifier.beautify("kosmos", (kosmos) ->kosmos.trim());
        */

}