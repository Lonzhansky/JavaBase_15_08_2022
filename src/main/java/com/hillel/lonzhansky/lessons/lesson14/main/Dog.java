package com.hillel.lonzhansky.lessons.lesson14.main;

public final class Dog extends Animal implements Runnable, Swimmable, Cloneable {

    int[] array;

    public Dog(String name) {
        super(name);
    }

    public String getName() {
        return name;
    }

    @Override
    void sayHello() {
        System.out.println("Dog " + name + " say hello");
    }

    @Override
    public void run() {
        System.out.println("Dog " + name + " running...");
    }

    @Override
    public void swim() {
        System.out.println("Dog " + name + " swimming...");
    }

    @Override
    public void runDefault() {
        System.out.println("override default");
    }

    @Override
    protected Dog clone() throws CloneNotSupportedException {

        Dog dog = new Dog("");
        dog.name = this.name;
//        dog.array = this.array;   //BAD!!!!

        dog.array = new int[this.array.length];
        for (int i = 0; i < this.array.length; i++) {
           dog.array[i] =  this.array[i];
        }

        return dog;
    }

}
