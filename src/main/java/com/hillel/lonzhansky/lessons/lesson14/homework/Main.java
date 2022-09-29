package com.hillel.lonzhansky.lessons.lesson14.homework;

public class Main {
    public static void main(String[] args) {
        MusicStyles[] musics = {
                new ClassicMusic("Beethoven"),
                new RockMusic("Rammstain"),
                new PopMusic("Kalush")
        };

        for (MusicStyles music : musics) {
            music.playMusic();
        }
    }
}
