package com.gd.internship.alimov.gof.observer;

public class Instagram {
    public EventManager events;
    private String username;

    public Instagram() {
        this.events = new EventManager("subscribe", "like");
    }

    public void subscribe(String username) {
        this.username = username;
        events.notify("subscribe to", username);
    }

    public void like(String username) throws Exception {
        events.notify("like", username);
    }
}
