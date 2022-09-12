package com.hillel.lonzhansky.lessons.lesson10;

//Фабрика літаків
//        a. Параметри літаків:
//        String type = "Jet";
//        String name = "F52";
//        int firstClassPassengers = 20;
//        int secondClassPassengers = 250;
//        b. Фабрика випускає три типи літаків:
//        винищувачі: тип + ім'я
//        пасажирські без бізнес класу: тип + ім'я + кільк. пасажирів 2-го класу
//        пасажирські з бізнес класом: тип + ім'я + кільк. пасажирів 1 класу + кільк. пасажирів 2-го класу
//        c. Зробити три методи з однією назвою для кожного типу літака
//        buildAirplane("Jet", "F52");
//        buildAirplane("Boeing", "747", 300);
//        buildAirplane("Boeing", "747", 300, 25);
//        d. Кожен метод повинен виводити на екран параметри літака

public class AirCraftFactory {
    public static void main(String[] args) {
//        String type = "Jet";
//        String name = "F52";
//        int firstClassPassengers = 20;
//        int secondClassPassengers = 250;

        buildAirplane("Jet", "F52");
        buildAirplane("Boeing", "747", 300);
        buildAirplane("Boeing", "747", 300, 25);
    }

    static void buildAirplane(String type, String name) {
        System.out.println("винищувач: тип: " + type + ",  назва: " + name);
    }

    static void buildAirplane(String type, String name, int secondClassPassengers) {
        System.out.println(
                "пасажирські без бізнес класу: тип: " + type
                + " " + name
                + ", кільк. пасажирів 2-го класу: " + secondClassPassengers);
    }

    static void buildAirplane(String type, String name, int firstClassPassengers, int secondClassPassengers) {
        System.out.println(
                "пасажирські з бізнес класу: тип: " + type
                        + " " + name
                        + ", кільк. пасажирів 1-го класу: " + firstClassPassengers
                        + ", кільк. пасажирів 2-го класу: " + secondClassPassengers);
    }
}
