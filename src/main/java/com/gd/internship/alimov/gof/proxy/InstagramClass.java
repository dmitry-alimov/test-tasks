package com.gd.internship.alimov.gof.proxy;

import java.util.HashMap;

public class InstagramClass implements InstagramLib {

    @Override
    public HashMap<String, Content> popularContents() {
        connectToServer("http://www.instagram.com");
        return getRandomContents();
    }

    @Override
    public Content getContent(String username, String contentId) {
        connectToServer("http://www.instagram.com/" + username + "/" + contentId);
        return getSomeContent(contentId);
    }

    private void connectToServer(String server) {
        System.out.print("Connecting to " + server + "... ");
        System.out.print("Connected!" + "\n");
    }

    private HashMap<String, Content> getRandomContents() {
        System.out.print("Downloading contents... ");

        HashMap<String, Content> hmap = new HashMap<>();
        hmap.put("dm_triy", new Content("dm_triy", "Music content"));
        hmap.put("jook", new Content("jook", "Dancing"));

        System.out.print("Done!" + "\n");
        return hmap;
    }

    private Content getSomeContent(String videoId) {
        System.out.print("Downloading content... ");

        Content video = new Content(videoId, "Some content title");

        System.out.print("Done!" + "\n");
        return video;
    }

}
