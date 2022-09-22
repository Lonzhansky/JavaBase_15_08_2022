package com.hillel.lonzhansky.lessons.somepackage;

import com.hillel.lonzhansky.lessons.lesson12.Car;
import com.hillel.lonzhansky.lessons.lesson12.ChildCarInPackage;

public class ChildCar extends ChildCarInPackage {
    public ChildCar(String name, String engine) {
        super(name, engine);
    }

    @Override
    public void stop() {
        super.stop();
    }

    @Override
    public void start() {
        super.start();
    }
}
