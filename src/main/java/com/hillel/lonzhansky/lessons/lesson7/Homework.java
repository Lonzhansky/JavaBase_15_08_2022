package com.hillel.lonzhansky.lessons.lesson7;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {

//        int number = 147;
//
//        System.out.println(number / 100);
//        System.out.println(number / 10 % 10);
//        System.out.println(number % 10);


        int number = (int) (Math.random() * 11);
        System.out.println(number);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter integer from 0 to 10");
        for (int i = 0; i < 3; i++) {
            System.out.println("a request: " + (i + 1));
            if (scanner.hasNextInt()) {
                int answer = scanner.nextInt();
                if (answer == number) {
                    System.out.println("WIN!!!");
                    break;
                } else if (i != 2) {
                    System.out.println("Try again");
                } else {
                    System.out.println("LOSE");
                }
            } else {
                System.out.println("WRONG DATA! TRY AGAIN!");
                i--;
                scanner.nextLine();
            }
        }


    }
}
