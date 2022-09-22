package com.hillel.lonzhansky.lessons.somepackage;

import com.hillel.lonzhansky.lessons.lesson12.Car;
import com.hillel.lonzhansky.lessons.lesson12.ChildCarInPackage;

public class Main {
    public static void main(String[] args) {
        ChildCar childCar = new ChildCar("Mercedes", "M113");
        childCar.stop();


        Car car = new ChildCarInPackage("BMW", "B46");

        System.out.println(car.getName());

    }


}
