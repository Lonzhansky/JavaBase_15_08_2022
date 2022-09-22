package com.hillel.lonzhansky.lessons.lesson12;

public class Person {

    static {
        counter = 10;
        printHello();
    }

    static int counter;
    String name;

    public Person(String name) {
        this.name = name;
        counter++;
    }

    static {
        System.out.println("static 2");
    }


    static void printHello() {
        System.out.println("Hello");
    }
}
