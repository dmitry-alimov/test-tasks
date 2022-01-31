package com.gd.internship.alimov.gof.proxy;

public class InstagramDownloader {
    private InstagramLib api;

    public InstagramDownloader(InstagramLib api) {
        this.api = api;
    }

    public void renderContentPage(String username, String contentId) {
        Content content = api.getContent(username, contentId);
        System.out.println("\n-------------------------------");
        System.out.println("ID: " + content.id);
        System.out.println("Title: " + content.title);
        System.out.println("Content: " + content.data);
        System.out.println("-------------------------------\n");
    }
}
