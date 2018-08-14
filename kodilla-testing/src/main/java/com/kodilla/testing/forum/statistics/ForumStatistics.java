package com.kodilla.testing.forum.statistics;

import java.util.*;

public class ForumStatistics implements Statistics {

    Statistics statistics;

    List<String> usersList = usersNames();
    int usersQuantity = usersList.size();
    int postsQuantity = postsCount();
    int commentsQuantity = commentsCount();
    double averagePostsQuantity;
    double averageCommentsQuantity;
    double averageCommentsQuantityPerPost;

    public ForumStatistics(Statistics statistics) {
        this.statistics = statistics;
    }

    public void calculateAdvStatistics(Statistics statistics) {
        this.statistics = statistics;

        averagePostsQuantity = postsQuantity / usersQuantity;
        averageCommentsQuantity = commentsQuantity / usersQuantity;
        averageCommentsQuantityPerPost = commentsQuantity / postsQuantity;
    }

    public void showStatistics() {
        System.out.println("liczba użytkowników - " + usersQuantity);
        System.out.println("liczba postów - " + postsQuantity);
        System.out.println("liczba komentarzy - " + commentsQuantity);
        System.out.println("średnia liczba postów na użytkownika - " + averagePostsQuantity);
        System.out.println("średnia liczba komentarzy na użytkownika - " + averageCommentsQuantity);
        System.out.println("średnia liczba komentarzy na post - " + averageCommentsQuantityPerPost);
    }

    @Override
    public List<String> usersNames() {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            String word = "a" + i;
            list.add(word);
        }
        return list;
    }

    @Override
    public int postsCount() {
        return 1000;
    }

    @Override
    public int commentsCount() {
        return 100;
    }

    public List<String> getUsersList() {
        return usersList;
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
