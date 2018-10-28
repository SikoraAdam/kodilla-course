package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class HomeworkModules implements HomeworkQueue {
    private final List<Observer> observers;
    private final List<String> messages;
    private final String homeworkName;

    public HomeworkModules(String homeworkName) {
        observers = new ArrayList<>();
        messages = new ArrayList<>();
        this.homeworkName = homeworkName;
    }

    public void addHomework (String homework) {
        messages.add(homework);
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observers) {
            observer.update(this);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public List<Observer> getObservers() {
        return observers;
    }

    public List<String> getMessages() {
        return messages;
    }

    public String getHomeworkName() {
        return homeworkName;
    }
}
