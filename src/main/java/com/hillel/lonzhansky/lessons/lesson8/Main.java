package com.hillel.lonzhansky.lessons.lesson8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Integer[] array = {10, 2, 55, -1, 0, 88, -22, 65, 34, 12, 1};


        int temp;
        int count = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                count++;
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        System.out.println("count = " + count);
//
//
        System.out.println(Arrays.toString(array));

//        int temp;
//        int count = 0;
//        for (int i = 0; i < array.length - 1; i++) {
//            for (int j = 0; j < array.length - 1 - i; j++) {
//                count++;
//                if (array[j] < array[j + 1]) {
//                    temp = array[j];
//                    array[j] = array[j + 1];
//                    array[j + 1] = temp;
//                }
//            }
//        }
//
//        System.out.println("count = " + count);


//        Arrays.sort(array);
//        Arrays.sort(array, Collections.reverseOrder());

//        System.out.println(Arrays.binarySearch(array, 10));


//        System.out.println(Arrays.toString(array));



//        int[] array = {10, 2, 55, -1, 0, 88, -22, 65, 34, 12, 1};
//
//        // BAD
////        int[] array2 = array;
//
////        int[] array2 = Arrays.copyOf(array, array.length + 10);
////        int[] array3 = Arrays.copyOfRange(array, (array.length / 2), array.length + 10);
//
//
//        int[] array2 = new int[array.length];
//
//        System.arraycopy(array, 0, array2, 5, array.length - 5);
//
//
//        System.out.println(Arrays.toString(array));
//        System.out.println(Arrays.toString(array2));
//
//        array2[0] = 99;
//        System.out.println();
//
//        System.out.println(Arrays.toString(array));
//        System.out.println(Arrays.toString(array2));




        // Створити масив із N чисел (вводимо з консолі)
        // Розбити його на 2 масиви рівної довжини
        // Відсортувати першу половину масиву за зростанням та вивести на екран
        // другу половину масиву відсортувати у зворотному порядку і теж вивести на екран

//        int N = -1;
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter array length:");
//        do {
//            if (scanner.hasNextInt()) {
//                N = scanner.nextInt();
//                if (N % 2 == 0 && N >= 0) {
//                    break;
//                } else {
//                    System.out.println("Please enter positive number and % 2 == 0");
//                }
//            } else {
//                System.out.println("wrong data, try again");
//                scanner.nextLine();
//            }
//        } while (true);
//
//
//        int[] array = new int[N];
//
//        for (int i = 0; i < array.length; i++) {
//            array[i] = (int) (Math.random() * 26);
//        }
//
//        System.out.println();
//        System.out.println(Arrays.toString(array));
//
//        int middle = array.length / 2;
//        int[] array1 = Arrays.copyOf(array, middle);
//        int[] array2 = Arrays.copyOfRange(array, middle, array.length);
//        Integer[] array3 = new Integer[array2.length];
//
//        for (int i = 0; i < array2.length; i++) {
//            array3[i] = array2[i];
//        }
//
////        System.arraycopy(array, middle, array2, 0, middle);
//
//
////        Integer[] array2 = Arrays.stream(array).boxed().toArray(Integer[]::new);
//
//        System.out.println();
//        System.out.println(Arrays.toString(array1));
//        System.out.println(Arrays.toString(array2));
//
//        Arrays.sort(array1);
//        Arrays.sort(array3, Collections.reverseOrder());
////        int temp;
////        for (int i = 0; i < array2.length - 1; i++) {
////            for (int j = 0; j < array2.length - 1 - i; j++) {
////                if (array2[j] < array2[j + 1]) {
////                    temp = array2[j];
////                    array2[j] = array2[j + 1];
////                    array2[j + 1] = temp;
////                }
////            }
////        }
//        System.out.println();
//        System.out.println(Arrays.toString(array1));
//        System.out.println(Arrays.toString(array3));

    }


    static void demo1() {
        // O(N)
        for (int i = 0; i < 50; i++) {

        }


        int counter = 0;
        // O(N^2)
        // O(N) * O(N) = O(N^2)
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                counter++;
            }
        }

        System.out.println(counter);


        // O(N^2 + N) = O(N^2)


//        counter = 0;
//        // O(N^3)
//        // O(N) * O(N) * O(N) = O(N^3)
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 5; j++) {
//                for (int k = 0; k < 5; k++) {
//                    counter++;
//                }
//            }
//        }
//
//        System.out.println(counter);
    }
}
