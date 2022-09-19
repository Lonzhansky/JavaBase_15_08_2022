package com.hillel.lonzhansky.lessons.lesson11;

public class ColorBox extends Box {

    String color;

    public ColorBox(int a, int b, int c, String color) {
        super(a, b, c);
        this.color = color;
    }

    void printColor() {
        System.out.println(color);
    }

    void printAllVariables() {
        System.out.println(this.a);
        System.out.println(super.b);
        System.out.println(super.c);
        System.out.println(this.color);
    }

    @Override
    public String toString() {
        return "ColorBox{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", color='" + color + '\'' +
                '}';
    }
}
