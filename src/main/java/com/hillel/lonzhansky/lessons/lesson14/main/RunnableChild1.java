package com.hillel.lonzhansky.lessons.lesson14.main;

public interface RunnableChild1 extends Runnable {

    void runChild();

    default void runDefaultChild() {
        System.out.println("default child1");
    }
}
