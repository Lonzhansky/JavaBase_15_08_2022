package com.hillel.lonzhansky.lessons.lesson14.main;

public abstract class Animal {

    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    abstract void sayHello();

    public void sayGoodbye() {
        System.out.println("Goodbye");
    }

}
