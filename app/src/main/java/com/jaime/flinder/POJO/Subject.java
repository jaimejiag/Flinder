package com.jaime.flinder.POJO;

/**
 * Created by jaime on 05/01/2017.
 */

public class Subject {
    private String name;
    private int color;

    public Subject(String name, int color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }
}
