package com.gd.internship.alimov.gof.observer;

public class InstagramNotificationListener implements EventListener {
    private final String username;

    public InstagramNotificationListener(String username) {
        this.username = username;
    }

    @Override
    public void update(String eventType, String username) {
        System.out.println("Action with " + username + ": Someone has performed " + eventType);
    }
}
