package com.hillel.lonzhansky.lessons.lesson7;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//        int counter = 0;
//        for (int i = 0; i < 10; i++) {
//            counter++;
//            for (int j = 0; j < 10; j++) {
//                counter++;
//                for (int k = 0; k < 10; k++) {
//                    counter++;
//                    System.out.println(counter);
//                }
//            }
//        }


//        int[] array1 = new int[3];
//        int[] array2 = {23, -1, 67, 33, 77, 89, 1};
//        int[] array3 = new int[] {23, -1, 67, 33, 77, 89, 1};
//        int array4[] = new int[3];

//        array1[0] = 23;
//        array1[1] = -1;
//        array1[2] = 67;
//
//
//        System.out.println(array1[0]);
//        System.out.println(array1[1]);
//        System.out.println(array1[2]);
//
//        System.out.println();
//        System.out.println(array1.length);


//        array2[1] = 99;
//
//        System.out.println(array2[0]);
//        System.out.println(array2[1]);
//        System.out.println(array2[2]);


//        int[] array = new int[10];
//
//        for (int i = 0; i < array.length; i++) {
//            array[i] = i;
//        }

//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + " ");
//        }
//        System.out.println();
//
//        System.out.println(Arrays.toString(array));


//        for (int value : array) {
//            System.out.println(value);
//        }

        // створити масив на 10 елементів та заповнити його випадковими цифрами від 0 до 10
// вивести на екран в один рядок усі цифри, розділивши їх комою, але у
// останнього символу не виводити кому


//        int[] array = new int[10];
//
//        for (int i = 0; i < array.length; i++) {
//            array[i] = (int) (Math.random() * 11);
//
//            if (i < array.length - 1) {
//                System.out.print(array[i] + ", ");
//            } else {
//                System.out.print(array[i]);
//            }
//        }
//        System.out.println(Arrays.toString(array));

        //Variant 1
//        for (int i = 0; i < array.length - 1; i++) {
//            System.out.print(array[i] + ", ");
//        }
//        System.out.print(array[array.length - 1]);

//        for (int i = 0; i < array.length; i++) {
//            if (i < array.length - 1) {
//                System.out.print(array[i] + ", ");
//            } else {
//                System.out.print(array[i]);
//            }
//        }





/*
     У вбивстві Кеннеді є 10 підозрюваних. Для кожного підозрюваного
     встановлено ймовірність того, що він був убивцею. Всі ці ймовірності
     записані як масив чисел. Написати функцію, яка і визначить
     номер підозрюваного, якого треба ув'язнити.
*/

        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 101);
        }
        System.out.println(Arrays.toString(array));

//        int max = array[0];
//        int index = 0;
//        for (int i = 1; i < array.length; i++) {
//            if (array[i] > max) {
//                max = array[i];
//                index = i;
//            }
//        }

        int max = -1;
        for (int value : array) {
            if (value > max) {
                max = value;
            }
        }

        System.out.println("chance: " + max);


/*
     У вашій баскетбольній команді 10 людей. Очки гравців основного
     складу записані в парні комірки масиву, а запасних гравців - у
     непарні. Написати функцію, яка знайде наскільки більше балів
     заробив основний склад щодо запасних гравців.
*/

//        int[] team = new int[10];
//
//        for (int i = 0; i < team.length; i++) {
//            team[i] = (int) (Math.random() * 16);
//        }
//        System.out.println(Arrays.toString(team));
//
//
//        int sumMain = 0;
//        int sumReserve = 0;
//        for (int i = 0; i < team.length; i++) {
//            if (i % 2 == 0) {
//                sumMain += team[i];
//            } else {
//                sumReserve += team[i];
//            }
//        }
//
//        System.out.println("main = " + sumMain);
//        System.out.println("reserve = " + sumReserve);
//
//        if (sumMain == sumReserve) {
//            System.out.println("DRAW");
//        } else if (sumMain > sumReserve) {
//            System.out.println("team Main scored " + (sumMain - sumReserve) + " points more then team Reserve");
//        } else {
//            System.out.println("team Reserve scored " + (sumReserve - sumMain) + " points more then team Main");
//        }


    }
}











