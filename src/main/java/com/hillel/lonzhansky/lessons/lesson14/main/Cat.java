package com.hillel.lonzhansky.lessons.lesson14.main;

public class Cat extends Animal implements Runnable {

    private String color = "Grey";

    public Cat(String name) {
        super(name);
    }

    @Override
    void sayHello() {
        System.out.println("Cat " + name + " say hello");
    }

    @Override
    public void run() {
        System.out.println("Cat " + name + " running...");
    }

    public String getName() {
        return name;
    }

    void demo() {

        System.out.println("demo");
        System.out.println("demsdfsdfsdo");
        System.out.println("demo2dsfas");


        class DemoLocalClass {
            public int x = 10;
            String name = "Den";

            void doSomething() {
                System.out.println("i do something");
                System.out.println(color);
            }
        }

        class DemoLocalClassChild extends DemoLocalClass {

        }


        DemoLocalClass localClass = new DemoLocalClass();
        localClass.doSomething();
        System.out.println(localClass.x);
        System.out.println(localClass.name);

    }
}
