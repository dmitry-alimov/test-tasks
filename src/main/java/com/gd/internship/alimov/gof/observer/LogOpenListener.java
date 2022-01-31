package com.gd.internship.alimov.gof.observer;

import java.io.File;

public class LogOpenListener implements EventListener {
    private final File log;

    public LogOpenListener(String fileName) {
        this.log = new File(fileName);
    }

    @Override
    public void update(String eventType, String username) {
        System.out.println("Save to log " + log + ": Someone has performed " + eventType + " operation with username: " + username);
    }
}
