package com.hillel.lonzhansky.lessons.lesson12;

public class Car {

    //package-private
    private String name;
    private String engine;

    public Car(String name, String engine) {
        this.name = name;
        this.engine = engine;
    }

    public String getName() {
        return name;
    }

    public String getEngine() {
        return engine;
    }

    void start() {
        startElectronicDevice();
        startFuelSystem();
        startEngine();
    }

    protected void stop() {
        stoptEngine();
        stopFuelSystem();
        stopElectronicDevice();
    }

    private void startElectronicDevice() {
        System.out.println("Electronic device starting...");
    }

    private void startFuelSystem() {
        System.out.println("Fuel system starting...");
    }

    private void startEngine() {
        System.out.println("Engine starting...");
    }

    private void stopElectronicDevice() {
        System.out.println("Electronic device stopping...");
    }

    private void stopFuelSystem() {
        System.out.println("Fuel system stopping...");
    }

    private void stoptEngine() {
        System.out.println("Engine stopping...");
    }
}
