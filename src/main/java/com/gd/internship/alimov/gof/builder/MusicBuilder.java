package com.gd.internship.alimov.gof.builder;

public class MusicBuilder implements Builder {
    private String genre;
    private Synthesiser synthesiser;
    private Microphone microphone;

    @Override
    public void setMusicGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public void setSynthesiser(Synthesiser synthesiser) {
        this.synthesiser = synthesiser;
    }

    @Override
    public void setMicrophones(Microphone microphone) {
        this.microphone = microphone;
    }

    public Music build() {
        return new Music(genre, synthesiser, microphone);
    }
}
