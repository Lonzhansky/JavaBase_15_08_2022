package com.hillel.lonzhansky.lessons.lesson15.enumerations;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//        String str = "Мотоцикл";
//
//        if (str.equals(TransportTypeClass.MOTORCYCLE.getTitle())) {
//
//        }
//
//        System.out.println(TransportTypeClass.MOTORCYCLE.getTitle());


//        System.out.println(TransportType.CAR.getTitle());
//        System.out.println(TransportType.TRUCK);

        TransportType transportType = TransportType.CAR;

//        if (transportType == TransportType.CAR) {
//            System.out.println("Авто!");
//        }
//
//        if (transportType == TransportType.BUS) {
//            System.out.println("Автобус");
//        }

        System.out.println(Arrays.toString(TransportType.values()));

        TransportType.valueOf("CAR");

//        switch (transportType) {
//            case CAR: {
//                System.out.println("Авто!");
//                break;
//            }
//            case BUS: {
//                System.out.println("Автобус");
//                break;
//            }
//            default: {
//                System.out.println("default");
//                break;
//            }
//        }

    }
}
