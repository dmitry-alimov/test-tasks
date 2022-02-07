package com.gd.internship.alimov.gof.factory;

public class MusicFactory {

    public Music getMusic(String musicType) {
        if (musicType == null) {
            return null;
        }
        if (musicType.equalsIgnoreCase("HIPHOP")) {
            return new HipHopMusic();
        } else if (musicType.equalsIgnoreCase("HOUSE")) {
            return new HouseMusic();
        }
        return new Music();
    }
}
