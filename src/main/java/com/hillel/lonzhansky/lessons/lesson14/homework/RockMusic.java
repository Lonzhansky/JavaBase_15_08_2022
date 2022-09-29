package com.hillel.lonzhansky.lessons.lesson14.homework;

public class RockMusic extends MusicStyles {
    public RockMusic(String name) {
        super(name);
    }

    @Override
    void playMusic() {
        System.out.println("Playing rock music: " + name);
    }
}
