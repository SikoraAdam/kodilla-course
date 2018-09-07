package com.kodilla.patterns.singleton;

public class Logger {
    private static Logger lastLogInstance = null;
    private String lastLog = "";

    public String getLastLog() {
        return lastLog;
    }

    public static Logger getInstance() {
        if (lastLogInstance == null) {
            synchronized(Logger.class) {
                if (lastLogInstance == null) {
                    lastLogInstance = new Logger();
                }
            }
        }
        return lastLogInstance;
    }

    public void log(final String log) {
        this.lastLog = log;
        System.out.println("Log: [" + log + "]");
    }
}