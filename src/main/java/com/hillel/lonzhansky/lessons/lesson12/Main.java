package com.hillel.lonzhansky.lessons.lesson12;

import com.hillel.lonzhansky.lessons.lesson12.Car;

public class Main {

    static {
        System.out.println("static main");
    }

    public static void main(String[] args) {

        {
            int a = 10;
            System.out.println(a * 20);
        }

//        System.out.println(a);  // ERROR

//        Car car = new Car("BMW", "B46");
//
//        car.start();
//
//        car.stop();
//
//        doSomething();

        System.out.println(Person.counter);
        Person.printHello();

//        Person person = new Person("Den");
//        System.out.println(person.name);
//
//        Person person2 = new Person("Alex");
//        System.out.println(person2.name);
//
//        Person.counter = 10;
//        System.out.println(Person.counter);
//
//
//        person.counter = 20;
//        System.out.println(Person.counter);

    }

    static void doSomething() {
        System.out.println("sdfds");
    }
}
