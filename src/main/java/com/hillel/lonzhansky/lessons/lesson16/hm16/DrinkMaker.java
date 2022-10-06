package com.hillel.lonzhansky.lessons.lesson16.hm16;

public class DrinkMaker {

    public static void makeCoffee() {
        System.out.println("Please, wait. " + DrinksMachine.COFFEE.getTitle() + " is preparing ");
        new Drink();
        System.out.println("Please take your " + DrinksMachine.COFFEE.getTitle());
    }

    public static void makeDrink(DrinksMachine drinksMachine) {
        System.out.println("Please, wait. " + drinksMachine.getTitle() + " is preparing ");
        make();
        System.out.println("Please take your " + drinksMachine.getTitle());
    }

    private static void make() {
        try {
            Thread.sleep(5000);
            new Drink();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
