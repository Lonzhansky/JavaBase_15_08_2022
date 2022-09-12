package com.hillel.lonzhansky.lessons.lesson9;

import java.util.Scanner;

public class DemoMethods {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int value1 = getNumber(scanner);
        int value2 = getNumber(scanner);
        int value3 = getNumber(scanner);


        System.out.println(value1);
        System.out.println(value2);
        System.out.println(value3);

        for (int i = 0; i < 10; i++) {
            printGreating();
        }

    }

    static int getNumber(Scanner scanner) {
        int temp = -1;
        System.out.println("Please enter integer: ");
        while (true) {
            if (scanner.hasNextInt()) {
                temp = scanner.nextInt();
                break;
            } else {
                System.out.println("Wrong data!");
                scanner.nextLine();
            }
        }
        return temp;
    }

    static void printGreating() {
        System.out.println("Hello world");
    }


}
