package com.hillel.lonzhansky.lessons.lesson12;

public class ChildCarInPackage extends Car {
    public ChildCarInPackage(String name, String engine) {
        super(name, engine);
    }

    @Override
    protected void start() {
        super.start();
    }
}
