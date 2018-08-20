package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {
    private int userId;
    private String userName;
    private char userSex;
    private LocalDate userBirthDate;
    private int userPostsQuantity;

    public ForumUser(int userId, String userName, char userSex, LocalDate userBirthDate, int userPostsQuantity) {
        this.userId = userId;
        this.userName = userName;
        this.userSex = userSex;
        this.userBirthDate = userBirthDate;
        this.userPostsQuantity = userPostsQuantity;
    }

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public char getUserSex() {
        return userSex;
    }

    public LocalDate getUserBirthDate() {
        return userBirthDate;
    }

    public int getUserPostsQuantity() {
        return userPostsQuantity;
    }
}
