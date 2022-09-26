package com.hillel.lonzhansky.lessons.lesson13.abstracts;

public class Cat extends Animal {

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

    @Override
    void swim() {
        System.out.println(name + " swim");
    }

    @Override
    void run() {
        System.out.println(name + " run");
    }

    @Override
    void printHello() {
        System.out.println("Cat say hello!");
    }
}
