package com.gd.internship.alimov.gof.factory;

public class MusicFactory {

    public Music getMusic(MusicGenre musicGenre) {
        if (musicGenre == null) {
            return null;
        }
        if (musicGenre == MusicGenre.HIPHOP) {
            return new HipHopMusic();
        } else if (musicGenre == MusicGenre.HOUSE) {
            return new HouseMusic();
        }
        return new Music();
    }
}
