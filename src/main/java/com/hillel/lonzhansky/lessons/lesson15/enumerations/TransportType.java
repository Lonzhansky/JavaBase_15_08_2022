package com.hillel.lonzhansky.lessons.lesson15.enumerations;

public enum TransportType {

    MOTORCYCLE("Мотоцикл"),
    CAR("Автомобiль"),
    BUS("Автобус"),
    TRUCK("Вантажiвка");

    private String title;

    TransportType(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

}
