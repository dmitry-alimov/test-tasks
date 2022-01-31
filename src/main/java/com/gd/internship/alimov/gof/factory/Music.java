package com.gd.internship.alimov.gof.factory;

public class Music implements IMusic{

    public void makeHappy() {
        System.out.println("I˙m listen music, I˙m happy");
    }

    public void awakenDance() {
        System.out.println("I˙m listen music, I˙m dance");
    }

    public Music createGenre(){
        return new Music();
    }
}
