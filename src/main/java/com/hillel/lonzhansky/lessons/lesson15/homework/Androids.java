package com.hillel.lonzhansky.lessons.lesson15.homework;

public class Androids implements Smartphones, LinuxOS {
    @Override
    public void call() {
        System.out.println("call from Androin");
    }

    @Override
    public void sms() {
        System.out.println("sms from Androin");
    }

    @Override
    public void internet() {
        System.out.println("internet from Androin");
    }

    @Override
    public void getLixusOS() {
        System.out.println("Linux OS 9.9");
    }
}
