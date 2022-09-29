package com.hillel.lonzhansky.lessons.lesson14.task;

public class Boat implements Swimmable, Transportable {

    @Override
    public void swim() {
        System.out.println("Boat swimming...");
    }

    @Override
    public void move() {
        System.out.println("Boat moving...");
    }
}
