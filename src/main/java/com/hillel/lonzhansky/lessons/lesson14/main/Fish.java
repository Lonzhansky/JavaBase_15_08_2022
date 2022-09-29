package com.hillel.lonzhansky.lessons.lesson14.main;

public class Fish extends Animal implements Swimmable {

    public Fish(String name) {
        super(name);
    }

    @Override
    void sayHello() {
        System.out.println("Fish " + name + " say hello");
    }

    @Override
    public void swim() {
        System.out.println("Fish " + name + " swimming...");
    }
}
