package com.hillel.lonzhansky.lessons.lesson14.main;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

//        System.out.println(Runnable.DISTANCE);
//
//        Animal[] animals = {
//                new Cat("Tom"),
//                new Dog("Tyzik"),
//                new Fish("Vanda")
//        };
//
//        for (Animal animal : animals) {
//            animal.sayHello();
//
//            if (animal instanceof Swimmable) {
//                ((Swimmable) animal).swim();
//            }
//            if (animal instanceof Runnable) {
//                ((Runnable) animal).run();
//                System.out.println();
//                ((Runnable) animal).runDefault();
//                System.out.println();
//            }
//
//        }

//        Kengyry kengyry = new Kengyry();
//
//        kengyry.runDefaultChild();

//        Dog dog = new Dog("Tyzik");
//
//        Dog dog2 = dog.clone();


//        Runnable[] runnables = {
//                new Cat("Tom"),
//                new Dog("Tyzik"),
////                new Fish("Vanda")     // ERROR!
//        };
//
//        Swimmable[] swimmables = {
////                new Cat("Tom"),       // ERROR!
//                new Dog("Tyzik"),
//                new Fish("Vanda")
//        };
//
//        Dog dog = new Dog("Tyzik");
//
//        dog.run();
//        dog.swim();
//
//        dog.sayHello();


//        Animal animal = new Animal("Tom") {
//            @Override
//            void sayHello() {
//                System.out.println("This object say hello");
//            }
//        };
//        animal.sayHello();
//
//
//        Swimmable swimmable = new Swimmable() {
//            @Override
//            public void swim() {
//                System.out.println("some object swim");
//            }
//        };
//        swimmable.swim();


        Cat cat = new Cat("Tom") {
            @Override
            public void run() {
                System.out.println("I am running...");
            }

        };


        cat.demo();


    }
}
