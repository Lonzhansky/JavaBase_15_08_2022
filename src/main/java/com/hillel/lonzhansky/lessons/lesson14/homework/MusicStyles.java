package com.hillel.lonzhansky.lessons.lesson14.homework;

public abstract class MusicStyles {

    protected String name;

    public MusicStyles(String name) {
        this.name = name;
    }

    abstract void playMusic();
}
