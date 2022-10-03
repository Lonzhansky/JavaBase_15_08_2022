package com.hillel.lonzhansky.lessons.lesson15.homework;

public class IPhones implements Smartphones, IOS {
    @Override
    public void call() {
        System.out.println("call from IPhone");
    }

    @Override
    public void sms() {
        System.out.println("sms from IPhone");
    }

    @Override
    public void internet() {
        System.out.println("internet from IPhone");
    }

    @Override
    public void getIOS() {
        System.out.println("IOS version 11");
    }

}
