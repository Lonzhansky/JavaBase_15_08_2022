package com.hillel.lonzhansky.lessons.lesson11;

public class Person {

    String name;
    int age;

    public Person() {

    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(int age) {
        this.age = age;
    }

    void move() {
        System.out.println(this.name + " moving....");
    }

}
