package com.hillel.lonzhansky.lessons.lesson10;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//        printHello();

        String text = "qwerty";

//        printText("Java best");
//        printText(text);

//        int age = 28;
//        increaseNumber(age);
//        System.out.println("after method");
//        System.out.println(age);


//        int[] array = {1, 2, 3};
//        changeArray(array);
//        System.out.println("after method");
//        System.out.println(Arrays.toString(array));

//        printText(1, 2, 3, 4, 5, 6, 77);
//        printText(new int[] {1, 2, 3, 4, 5, 6}, 77);

        System.out.println(getFactorial(5));
    }


    static int getFactorial(int number) {
        if (number <= 1) {
            return 1;
        }
        return number * getFactorial(number - 1);
    }

    // BAD EXAMPLE
//    static void demoRecursion() {
//       int asdasdsa = 2343432;
//        System.out.println(asdasdsa);
//        demoRecursion();
//    }

//    static void demoRecursion(int count) {
//        System.out.println(count);
//        if (count == 0) {
//            return;
//        }
//        demoRecursion(--count);
//    }


//    static void printText(int[] varargs, int element) {
//
//        for (int i = 0; i < varargs.length; i++) {
//            System.out.println(varargs[i]);
//        }
////        System.out.println(Arrays.toString(varargs));
//
//    }

    static void printText(int element, int... varargs) {

        for (int i = 0; i < varargs.length; i++) {
            System.out.println(varargs[i]);
        }
//        System.out.println(Arrays.toString(varargs));

    }

    static void changeArray(int[] mass) {
        int[] newArray = Arrays.copyOf(mass, mass.length);
        System.out.println(Arrays.toString(newArray));
        newArray[0] = 99;
        System.out.println(Arrays.toString(newArray));
    }

    static void increaseNumber(int age) {
        System.out.println(age);
        age = 35;
        System.out.println(age);
    }

    static void printHello() {
        System.out.println("Hello world!");
    }

    static void printText(String text) {
        System.out.println(text);
    }

    // Overload
    static void printText() {
        String text = "1 start";
        System.out.println(text);
        System.out.println("1 end");
    }

    static void printText(int x) {
        System.out.println(x);
    }

    static void printText(byte x) {
        String text = "1 start";
        System.out.println(text);
        System.out.println("1 end");
    }

}
