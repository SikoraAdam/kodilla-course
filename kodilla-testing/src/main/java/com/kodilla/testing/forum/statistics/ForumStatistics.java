package com.kodilla.testing.forum.statistics;

import java.util.*;

public class ForumStatistics {

    int usersQuantity;
    int postsQuantity;
    int commentsQuantity;
    double averagePostsQuantity;
    double averageCommentsQuantity;
    double averageCommentsQuantityPerPost;

    public void calculateAdvStatistics(Statistics statistics) {

        usersQuantity = statistics.usersNames().size();
        postsQuantity = statistics.postsCount();
        commentsQuantity = statistics.commentsCount();

        averagePostsQuantity = (double) postsQuantity / usersQuantity;
        averageCommentsQuantity = (double) commentsQuantity / usersQuantity;
        averageCommentsQuantityPerPost = (double) commentsQuantity / postsQuantity;
    }

    public void showStatistics() {
        System.out.println("liczba użytkowników - " + usersQuantity);
        System.out.println("liczba postów - " + postsQuantity);
        System.out.println("liczba komentarzy - " + commentsQuantity);
        System.out.println("średnia liczba postów na użytkownika - " + averagePostsQuantity);
        System.out.println("średnia liczba komentarzy na użytkownika - " + averageCommentsQuantity);
        System.out.println("średnia liczba komentarzy na post - " + averageCommentsQuantityPerPost);
    }

    public int getUsersQuantity() {
        return usersQuantity;
    }

    public int getPostsQuantity() {
        return postsQuantity;
    }

    public int getCommentsQuantity() {
        return commentsQuantity;
    }

    public double getAveragePostsQuantity() {
        return averagePostsQuantity;
    }

    public double getAverageCommentsQuantity() {
        return averageCommentsQuantity;
    }

    public double getAverageCommentsQuantityPerPost() {
        return averageCommentsQuantityPerPost;
    }
}
