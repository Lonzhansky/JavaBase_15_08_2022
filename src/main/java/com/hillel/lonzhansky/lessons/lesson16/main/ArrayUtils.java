package com.hillel.lonzhansky.lessons.lesson16.main;


// Задано метод, який приймає масив.
// Реалізувати пошук елементу массиву. Повертати номер комірки
// Якщо не знайшли, повернути -1
// Якщо масив порожній, повернути -2.
// Якщо масив дорівнює null, повернути -3.

public class ArrayUtils {
    public static int getIndexElementInArray(int[] array, int element) {
        if (array == null) {
            return -3;
        }

        if (array.length == 0) {
            return -2;
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                return i;
            }
        }

        return -1;
    }
}
