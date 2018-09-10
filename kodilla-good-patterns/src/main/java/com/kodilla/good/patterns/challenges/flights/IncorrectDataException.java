package com.kodilla.good.patterns.challenges.flights;

public class IncorrectDataException extends RuntimeException {
    public IncorrectDataException(String message) {
        super(message);
    }
}
