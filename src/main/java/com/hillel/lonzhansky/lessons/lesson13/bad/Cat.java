package com.hillel.lonzhansky.lessons.lesson13.bad;

public class Cat {

    String name;

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void jump() {
        System.out.println(name + " jumping....");
    }


    void swim() {
        System.out.println(name + " swim");
    }


    void run() {
        System.out.println(name + " run");
    }


    void printHello() {
        System.out.println("Cat say hello!");
    }
}
