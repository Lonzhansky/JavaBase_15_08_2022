package com.hillel.lonzhansky.lessons.lesson14.homework;

public class PopMusic extends MusicStyles {
    public PopMusic(String name) {
        super(name);
    }

    @Override
    void playMusic() {
        System.out.println("Playing pop music: " + name);
    }
}
