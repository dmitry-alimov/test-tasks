package com.gd.internship.alimov.gof.builder;

public interface Builder {
    void setMusicGenre(String genre);

    void setSynthesiser(Synthesiser synthesiser);

    void setMicrophones(Microphone microphone);
}
