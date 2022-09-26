package com.hillel.lonzhansky.lessons.lesson13.abstracts;

public class Main {
    public static void main(String[] args) {

//        Cat cat = new Cat("Nick");
//        Dog dog = new Dog();
//
//        cat.printHello();
//
//        dog.printHello();
//        dog.move();


//        Animal cat = new Cat("Nick");
//        Animal dog = new Dog();

//
//        cat.printHello();
//        cat.jump();

//        dog.printHello();


        Animal[] animals = {
                new Cat("Nick"),
                new Cat("Tom"),
                new Dog("Jack"),
                new Dog("Bobik"),
                new Kengory(),
                new Fish()
        };

        Obstacles[] obstacles = {
                new RunningTrack(),
                new ObstaclePool(),
                new ObstaclePool()
        };

        for (Obstacles obstacle : obstacles) {
            for (Animal animal : animals) {
                obstacle.start(animal);
            }
        }
    }
}
