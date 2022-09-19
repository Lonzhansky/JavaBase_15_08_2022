package com.hillel.lonzhansky.lessons.lesson11;

public class Main {

    public static void main(String[] args) {

//        demo1();
//        demo2();
        demo3();

    }

    static void demo3() {
        ColorBox colorBox = new ColorBox(1, 2, 3, "RED");
        System.out.println(colorBox.getVolume());
        colorBox.printColor();

        ChildColorBox childColorBox = new ChildColorBox(2, 4, 6, "BLUE", "Addidas");
        System.out.println(childColorBox.getVolume());
        childColorBox.printColor();
        childColorBox.printBrend();
    }


    static void demo2() {
        Box box1 = new Box(10, 2, 5);
        Box box2 = new Box(4, 3, 6);


        System.out.println(box1.getVolume());
        System.out.println(box2.getVolume());

        System.out.println(box1);

    }


    static void demo1() {
        Person person2 = new Person();

        Person den = new Person("Den", 28);
        Person alex = new Person("Alex", 33);


//        den.name = "Den";
//        den.age = 28;
//
//        alex.name = "Alex";
//        alex.age = 33;


        System.out.println("DEN: ");
        System.out.println(den.name);
        System.out.println(den.age);

        System.out.println("ALEX: ");
        System.out.println(alex.name);
        System.out.println(alex.age);
        System.out.println();

        den.move();
        alex.move();


//        Person alex = null;
//        if (alex != null) {
//            alex.name = "Alex";
//        }
    }

}
