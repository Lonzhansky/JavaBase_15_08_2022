package com.hillel.lonzhansky.lessons.lesson13.abstracts;

public class ObstaclePool extends Obstacles {

    @Override
    void start(Animal animal) {
        animal.swim();
    }

}
