package com.hillel.lonzhansky.lessons.lesson13.abstracts;

public class RunningTrack extends Obstacles {

    @Override
    void start(Animal animal) {
        animal.run();
    }
}
