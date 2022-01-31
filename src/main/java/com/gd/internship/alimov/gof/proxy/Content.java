package com.gd.internship.alimov.gof.proxy;

public class Content {
    public String id;
    public String title;
    public String data;

    Content(String id, String title) {
        this.id = id;
        this.title = title;
        this.data = "Random content.";
    }
}
