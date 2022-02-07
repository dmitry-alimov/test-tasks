package com.gd.internship.alimov.gof.proxy;

import java.util.HashMap;

public class InstagramCacheProxy implements InstagramLib {
    private InstagramLib instagramService;
    private HashMap<String, Content> cachePopular = new HashMap<>();
    private HashMap<String, Content> cacheAll = new HashMap<>();

    public InstagramCacheProxy() {
        this.instagramService = new InstagramClass();
    }

    @Override
    public HashMap<String, Content> popularContents() {
        if (cachePopular.isEmpty()) {
            cachePopular = instagramService.popularContents();
        } else {
            System.out.println("Retrieved list from cache.");
        }
        return cachePopular;
    }

    @Override
    public Content getContent(String username, String contentId) {
        Content content = cacheAll.get(contentId);
        if (content == null) {
            content = instagramService.getContent(username, contentId);
            cacheAll.put(contentId, content);
        } else {
            System.out.println("Retrieved content '" + contentId + "' from cache.");
        }
        return content;
    }

    public void reset() {
        cachePopular.clear();
        cacheAll.clear();
    }
}

