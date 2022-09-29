package com.hillel.lonzhansky.lessons.lesson14.main;

public class Kengyry implements RunnableChild2, RunnableChild1 {

    @Override
    public void run() {

    }

    @Override
    public void runChild() {

    }

    @Override
    public void runDefaultChild() {
//        System.out.println("new default");
//        RunnableChild1.super.runDefaultChild();
        RunnableChild2.super.runDefaultChild();
    }
}
