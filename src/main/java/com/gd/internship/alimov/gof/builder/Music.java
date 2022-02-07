package com.gd.internship.alimov.gof.builder;

public class Music {

    private String genre;
    private Synthesiser synthesiser;
    private Microphone microphone;

    public Music(String genre, Synthesiser synthesiser, Microphone microphone) {
        this.genre = genre;
        this.synthesiser = synthesiser;
        this.microphone = microphone;
    }
}
