package com.hillel.lonzhansky.lessons.lesson15.enumerations;

public class TransportTypeClass {

    private String title;

    public static final TransportTypeClass MOTORCYCLE = new TransportTypeClass("Мотоцикл");
    public static final TransportTypeClass CAR = new TransportTypeClass("Автомобiль");
    public static final TransportTypeClass BUS = new TransportTypeClass("Автобус");
    public static final TransportTypeClass TRUCK = new TransportTypeClass("Вантажiвка");

    private TransportTypeClass(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
