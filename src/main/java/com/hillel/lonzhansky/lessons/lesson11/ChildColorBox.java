package com.hillel.lonzhansky.lessons.lesson11;

public class ChildColorBox extends ColorBox {

    String brend;

    public ChildColorBox(int a, int b, int c, String color, String brend) {
        super(a, b, c, color);
        this.brend = brend;
    }

    void printBrend() {
        System.out.println(brend);
    }
}
