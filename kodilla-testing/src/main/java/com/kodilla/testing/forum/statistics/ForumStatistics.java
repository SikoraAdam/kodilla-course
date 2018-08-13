package com.kodilla.testing.forum.statistics;

import java.util.ArrayList;
import java.util.List;

public class ForumStatistics implements Statistics{

    Statistics statistics;
    int usersQuantity;
    int postsQuantity;
    int commentsQuantity;
    double averagePostsQuantity;
    double averageCommentsQuantity;
    double averageCommentsQuantityPerPost;

    public ForumStatistics(Statistics statistics)
    {
        this.statistics = statistics;
    }

    public void calculateAdvStatistics(Statistics statistics)
    {
        this.statistics = statistics;

        usersQuantity = usersNames().size();
        postsQuantity = postsCount();
        commentsQuantity = commentsCount();

        averagePostsQuantity = postsQuantity/usersQuantity;
        averageCommentsQuantity = commentsQuantity/usersQuantity;
        averageCommentsQuantityPerPost = commentsQuantity/postsQuantity;
    }

    public void showStatistics()
    {
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
        for(int i=0; i<100; i++)
        {
            String word = "a"+i;
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
