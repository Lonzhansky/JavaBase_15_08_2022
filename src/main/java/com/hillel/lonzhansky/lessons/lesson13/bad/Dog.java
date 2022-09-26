package com.hillel.lonzhansky.lessons.lesson13.bad;

public class Dog {

    String name;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    void swim() {
        System.out.println(name + " swim");
    }


    void run() {
        System.out.println(name + " run");
    }
}
