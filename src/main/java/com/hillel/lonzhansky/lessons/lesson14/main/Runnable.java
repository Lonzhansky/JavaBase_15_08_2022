package com.hillel.lonzhansky.lessons.lesson14.main;

public interface Runnable {

    int DISTANCE = 100;

    void run();

    default void runDefault() {
        System.out.println("default run");
    }
}
