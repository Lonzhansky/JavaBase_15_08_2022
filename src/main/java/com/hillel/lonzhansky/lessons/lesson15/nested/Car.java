package com.hillel.lonzhansky.lessons.lesson15.nested;

public class Car {

    private Engine engine = new Engine();
    private Wheel[] wheels = new Wheel[4];
    private Door rightDoor = new Door();
    private Door leftDoor = new Door();

    private int somePrivateVariable = 10;
    private static int someStaticPrivateVariable = 10;

    void demo() {
//        System.out.println(volume);
    }


    class Engine {
        public double volume = 5.5;

        public void start() {
            System.out.println(someStaticPrivateVariable);
            demo();
            System.out.println("engine starting...");
        }
    }

    class EngineChild extends Engine implements Cloneable {

    }

    class Wheel {
        private double radius = 20;

        public void inflair(int psi) {

        }
    }

    static class Door {
        public void rollUp() {
            System.out.println(someStaticPrivateVariable);
        }

        public void rollDown() {

        }
    }


}
