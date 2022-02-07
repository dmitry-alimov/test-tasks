package com.gd.internship.alimov.gof.singletone;

public class Earth {

    private static Earth earth;

    private long people;

    private Earth(long people) {
        this.people = people;
    }

    public static Earth getInstance(long people) {
        if (earth == null) {
            earth = new Earth(people);
        }
        return earth;
    }
}
