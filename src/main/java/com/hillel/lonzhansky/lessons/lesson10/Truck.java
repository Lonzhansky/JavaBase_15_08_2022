package com.hillel.lonzhansky.lessons.lesson10;

//    Створити клас Truck
//    b. Додати параметри length, width, height у main-методі
//    c. Додати метод countVolume() для розрахунку обсягу
//    public static int countVolume(int length, int width, int height) {}
//    d. Викликати метод countVolume() у main-методі та передати в нього параметри
public class Truck {
    public static void main(String[] args) {

        int width = 3, height = 4;

//        int volume = countVolume(length, width, height);
//
//        System.out.println(volume);


//        System.out.println(countVolume(length, width, height));

        int length = getLength();
        countVolume(length, width, height);
    }

    static int countVolume(int length, int width, int height) {
//        int volume = length * width * height;
//        return volume;

        return length * width * height;
    }

    static int getLength() {
        return 2;
    }
}
