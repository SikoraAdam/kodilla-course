package com.kodilla.patterns2.observer.homework;

public class User implements Observer {
    private final String username;
    private int updateCount;

    public User(String username) {
        this.username = username;
    }

    @Override
    public void update(HomeworkModules homeworkModules) {
        System.out.println(username + ": New homeworkModules in " + homeworkModules.getHomeworkName() + " (total: " + homeworkModules.getMessages().size() + " homeworks)");
        updateCount++;
    }

    public String getUsername() {
        return username;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
