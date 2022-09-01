package com.hillel.lonzhansky.lessons.lesson6;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        for(  БЛОК ІНІЦІАЛІЗАЦІЇ ІТЕРАТОРА;
//              БЛОК УМОВИ ВИХОДУ З ЦИКЛУ;
//              БЛОК ЗБІЛЬШЕННЯ ІТЕРАТОРА
//              )
//              {
//                  код
//              }
//        for (int i = 100; i >= 90; i--) {
//            System.out.println(i);
//        }


//        -- BREAK --
//        ОБРИВАННЯ ВСЬОГО ЦИКЛУ

//        -- CONTINUE --
//        ОБРИВАЄ ПОТОЧНУ ІТЕРАЦІЮ

//        int i = 0;
//        for (; i <= 50 ; i++) {
//
//            if (i == 5 || i == 7) {
//                continue;
//            }
//
//            System.out.println(i);
//
//            if (i >= 10) {
//                break;
//            }
//
//        }

//        виведення лише парних за допомогою циклу FOR


//        for (int i = 0; i <= 10; i++) {
//            if (i % 2 == 0) {
//                System.out.println(i);
//            }
//        }

//        for (int i = 0; i <= 10; i++) {
//            if (i % 2 != 0) {
//                System.out.println(i);
//            }
//        }


//        Виведіть на екран перші 11 членів послідовності Фібоначчі
//        0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55

//        int number1 = 0;
//        int number2 = 1;
//        int sum = 0;
//        System.out.print(number1 + " " + number2 + " ");
//
//        for (int i = 0; i < 9; i++) {
//            sum = number1 + number2;
//            System.out.print(sum + " ");
//            number1 = number2;
//            number2 = sum;
//        }

//        int i = 0;
//        while (true) {
//            if (i > 10) {
//                break;
//            }
//            System.out.println(i);
//            i++;
//        }

        Scanner scanner = new Scanner(System.in);
//        int value = -1;
//
//        while (true) {
//            if (scanner.hasNextInt()) {
//                value = scanner.nextInt();
//                break;
//            } else {
//                System.out.println("Wrong data, Try again");
//                scanner.nextLine();
//            }
//        }
//
//        System.out.println("your number: " + value);


//        int i = 0;
//        do {
//            System.out.println(i);
//            i++;
//        } while (i < 10);


//        a. Зробіть бомбу зі зворотним відліком від 10 до 0 за допомогою циклу WHILE
//        b. додайте до вашої бомби умову, якщо бомба розмінована, вона не вибухне

//        int timer = 10;
//        while (true) {
//
//            if (Math.random() * 101 > 90) {
//                System.out.println("DEFUSE");
//                break;
//            }
//
//            if (timer == 0) {
//                System.out.println("BOOOM!");
//                break;
//            }
//
//            System.out.println(timer);
//
//            timer--;
//
//        }


//        Обчислити факторіал числа від 0 до N (вводимо з консолі)

//        int N = -1;
//
//        do {
//            if (scanner.hasNextInt()) {
//                N = scanner.nextInt();
//                if (N < 0 || N > 10) {
//                    System.out.println("Wrong data, please enter integer from 0 to 10");
//                } else {
//                    break;
//                }
//            } else {
//                System.out.println("Wrong data, try again");
//                scanner.nextLine();
//            }
//
//        } while (true);
//
//
////        if (N == 0) {
////            System.out.println(1);
////        } else {
//            int number = 1;
//            for (int i = 1; i <= N; i++) {
//                number *= i;
//            }
//            System.out.println(number);
////        }
//


//        У Японії числа 4 та 9 вважаються нещасливими. Вам потрібно пронумерувати
//        100 космічних шатлів для перевезення людей на Марс так, щоб в
//        У номерах шатлів не траплялося нещасливих чисел. Напишіть функцію,
//        яка виводить усі номери таких шатлів.

//        int number = 89;
//
//        System.out.println(number / 10);
//        System.out.println(number % 10);

        int counter = 0;
        for (int i = 10; i <= 99; i++) {
            if ((i / 10 == 4) || (i / 10 == 9) || (i % 10 == 4) || (i % 10 == 9)) {
                continue;
            }
            System.out.println(i);
            counter++;
        }

        System.out.println("counter shuttle: " + counter);


    }
}




















