package com.hillel.lonzhansky.lessons.lesson14.homework;

public class ClassicMusic extends MusicStyles {
    public ClassicMusic(String name) {
        super(name);
    }

    @Override
    void playMusic() {
        System.out.println("Playing classic music: " + name);
    }
}
