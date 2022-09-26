package com.hillel.lonzhansky.lessons.lesson13.abstracts;

public class Fish extends Animal {

    @Override
    void swim() {
        System.out.println("Fish swimming...");
    }

    @Override
    void run() {
        System.out.println("I cant");
    }
}
