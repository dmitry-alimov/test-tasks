package com.gd.internship.alimov.gof.proxy;

import java.util.HashMap;

public interface InstagramLib {
    HashMap<String, Content> popularContents();

    Content getContent(String username, String videoId);
}
