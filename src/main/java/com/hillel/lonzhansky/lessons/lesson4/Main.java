package com.hillel.lonzhansky.lessons.lesson4;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int a = 4;
        int b = 10;
        int c = 5;

//        System.out.println(a > b);
//        System.out.println(a < b);
//
//        System.out.println(a >= b);
//        System.out.println(a <= b);
//
//        System.out.println(a == b);
//        System.out.println(a != b);
//        System.out.println();
//
//        System.out.println(!true);
//        System.out.println(!false);
//        System.out.println();
//
//                     // вираз 1 || вираз 2 = ?
//        System.out.println(true || true);
//        System.out.println(true || false);
//        System.out.println(false || true);
//        System.out.println(false || false);
//        System.out.println();
//
//        System.out.println(true && true);
//        System.out.println(true && false);
//        System.out.println(false && true);
//        System.out.println(false && false);



//                         true && false || true
//        System.out.println( (a < b && b < c) && (b < c || a < c));

//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);
//
//                //           false  || true
//        System.out.println(a > c && ++a == c);
//
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);


//        System.out.println(Integer.toBinaryString(0));
//        System.out.println(Integer.toBinaryString(1));
//        System.out.println(Integer.toBinaryString(2));
//        System.out.println(Integer.toBinaryString(3));
//        System.out.println(Integer.toBinaryString(4));
//        System.out.println(Integer.toBinaryString(5));
//        System.out.println(Integer.toBinaryString(6));
//        System.out.println(Integer.toBinaryString(7));
//        System.out.println(Integer.toBinaryString(8));
//        System.out.println(Integer.toBinaryString(9));
        System.out.println("0000000000000000000000000000" + Integer.toBinaryString(3));
        System.out.println("0000000000000000000000000000" + Integer.toBinaryString(2));

//        System.out.println(Integer.toBinaryString(~10));
        System.out.println("00000000000000000000000000" + Integer.toBinaryString(3 & 2));

        System.out.println(3 & 2);

        System.out.println("00000000000000000000000000" + Integer.toBinaryString(3 | 2));
        System.out.println(3 | 2);


        System.out.println("000000000000000000000000" + Integer.toBinaryString(3 << 2));
        System.out.println(3 << 2);

        System.out.println("00000000000000000000000000" + Integer.toBinaryString(3 ^ 2));
        System.out.println(3 ^ 2);


    }


    public static void demo1() {
        int a = 10;
        int b = 3;

//        System.out.println((double) a / (double) b);
//        System.out.println(10.0 + 3);

//        a = a + 1;
//        a += 1;
//        a++; // інкремент
//        a--; // декремент


//        System.out.println(a);
//        System.out.println(a++);
//        System.out.println(a);

//        System.out.println(a);
//        System.out.println(a--);
//        System.out.println(a);


//                            10 + 2
//        System.out.println(a++ + --b); // 12 13 14 ?
//                            10  +   2  +  10 +   3
//        System.out.println(a++ + --b + --a + ++b); // ?


//        double result = Math.pow(5, 3);
//        System.out.println(result);
//
//
//        System.out.println(Math.sqrt(16));
//
//        System.out.println(Math.PI + 10);
//
//        System.out.println(Math.abs(10));
//        System.out.println(Math.abs(-10));

//        System.out.println(Math.round(10.5));
//        System.out.println(Math.round(10.6));
//        System.out.println(Math.round(10.4));


//
//        System.out.println();
//
//        System.out.println((int)10.5);
//        System.out.println((int)10.6);
//        System.out.println((int)10.3);

        System.out.println(Math.random()); // from 0.0 to 0.999999999999999999999999999

//        int value = (int) Math.random() * 11; // 0 - 11


        // 5 - 15

        int min = 5;
        int max = 15;

//                                            0.0 * 10 = 0.0 -> 0
//                                            0.9 * 10 = 9.9999 -> 9 + 1 = 10
        System.out.println(min + (int) (Math.random() * (max - min + 1)));
        System.out.println(min + (int) (Math.random() * (max - min + 1)));
        System.out.println(min + (int) (Math.random() * (max - min + 1)));
        System.out.println(min + (int) (Math.random() * (max - min + 1)));
        System.out.println(min + (int) (Math.random() * (max - min + 1)));
        System.out.println(min + (int) (Math.random() * (max - min + 1)));
        System.out.println(min + (int) (Math.random() * (max - min + 1)));
        System.out.println(min + (int) (Math.random() * (max - min + 1)));
        System.out.println(min + (int) (Math.random() * (max - min + 1)));
        System.out.println(min + (int) (Math.random() * (max - min + 1)));
        System.out.println(min + (int) (Math.random() * (max - min + 1)));
        System.out.println(min + (int) (Math.random() * (max - min + 1)));
        System.out.println(min + (int) (Math.random() * (max - min + 1)));
        System.out.println(min + (int) (Math.random() * (max - min + 1)));
        System.out.println(min + (int) (Math.random() * (max - min + 1)));
        System.out.println(min + (int) (Math.random() * (max - min + 1)));
        System.out.println(min + (int) (Math.random() * (max - min + 1)));
        System.out.println(min + (int) (Math.random() * (max - min + 1)));
        System.out.println(min + (int) (Math.random() * (max - min + 1)));
        System.out.println(min + (int) (Math.random() * (max - min + 1)));

        BigDecimal bigDecimal = new BigDecimal(55.4343434);
        System.out.println(bigDecimal.setScale(3, RoundingMode.DOWN));


        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        System.out.println(decimalFormat.format(55.4343434));

        System.out.println(String.format("%.3f", 55.4343434));
    }
}
