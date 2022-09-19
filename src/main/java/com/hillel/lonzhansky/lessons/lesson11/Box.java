package com.hillel.lonzhansky.lessons.lesson11;

public class Box {

    int a;
    int b;
    int c;

    public Box(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    int getVolume() {
        return a * b * c;
    }

    @Override
    public String toString() {
        return "Box{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
