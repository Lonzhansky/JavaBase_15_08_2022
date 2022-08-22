package com.hillel.lonzhansky.lessons.lesson3;

public class Main {
    public static void main(String[] args) {

        int a = 20;
        int b = 10;
        int c = 5;

        int sum = a + b;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);

        int result = (a + b) * c;
        System.out.println(result);

        String str = "Hello " + (a - b) * c;

        System.out.println();
        System.out.println(str);

        System.out.println(10 % 3); // 3*3 = 9; 10 - 9 = 1
        System.out.println(10 % 2); // 0
        System.out.println(10 % 4); // 2
        System.out.println(10 % 5); // 0
        System.out.println(10 % 6); // 4

        int x = 10;

//        x = x + 5; // довга форма
//        x = x + a + b; // довга форма
        x += a + b * 10; // коротка форма

        System.out.println();
        System.out.println(x);
    }
}
