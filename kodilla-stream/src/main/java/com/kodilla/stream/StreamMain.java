package com.kodilla.stream;

/*
import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.reference.FunctionalCalculator;
*/
import com.kodilla.stream.forumuser.*;

import java.time.*;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        Forum theForum = new Forum();

        Map<Integer, ForumUser> theResultMapOfUsers = theForum.getUserList().stream()
                .filter(user -> user.getUserSex() == 'M')
                .filter(user -> (Period.between(user.getUserBirthDate(), LocalDate.now()).getYears()) > 20)
                .filter(user -> user.getUserPostsQuantity() > 0)
                .collect(Collectors.toMap(ForumUser::getUserId, user -> user));

        System.out.println("# elements: " + theResultMapOfUsers.size());
        theResultMapOfUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue().getUserName() + ", " + entry.getValue().getUserSex() + ", " + entry.getValue().getUserBirthDate() + ", " + entry.getValue().getUserPostsQuantity())
                .forEach(System.out::println);


        //Module_7.1 + Module_7.2
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
}