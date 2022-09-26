package com.hillel.lonzhansky.lessons.lesson13.bad;

public class Main {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Nick");
        Cat cat2 = new Cat("Nick");
        Dog dog1 = new Dog("Jack");
        Dog dog2 = new Dog("Jack");
        Kengory kengory = new Kengory();


        RunningTrack runningTrack = new RunningTrack();
        ObstaclePool obstaclePool = new ObstaclePool();
        ObstaclePool obstaclePool2 = new ObstaclePool();


        runningTrack.start(cat1);
        runningTrack.start(cat2);
        runningTrack.start(dog1);
        runningTrack.start(dog2);
        runningTrack.start(kengory);

        obstaclePool.start(cat1);
        obstaclePool.start(cat2);
        obstaclePool.start(dog1);
        obstaclePool.start(dog2);
        obstaclePool.start(kengory);

        obstaclePool2.start(cat1);
        obstaclePool2.start(cat2);
        obstaclePool2.start(dog1);
        obstaclePool2.start(dog2);
        obstaclePool2.start(kengory);



    }
}
