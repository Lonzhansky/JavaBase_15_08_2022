package com.hillel.lonzhansky.lessons.lesson5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        System.out.println("enter number");
//        int someInt = scanner.nextInt();
//        scanner.nextLine();

        System.out.println("Please enter team1 name");
        String str = scanner.nextLine();
        System.out.println("You entered: " + str);

        int intVariable = -1;
        System.out.println("Please enter frags for player 1");
        if (scanner.hasNextInt()) {
            intVariable = scanner.nextInt();
            System.out.println("You entered number: " + intVariable);
        } else {
            System.out.println("WRONG DATA, RESTART!");
            System.exit(0);
        }

        System.out.println(intVariable);
        scanner.close();
    }


    static void demo3() {
        int a = 20;
        int b = 20;


//        if (a < b) {
//            System.out.println("a < b");
//        } else {
//            System.out.println("a >= b");
//        }


        // умова ? выраз 1 : выраз 2
        System.out.println((a < b) ? "a < b" : "a >= b");


        if (a < b) {
            System.out.println("a < b");
        } else {
            if (a == b) {
                System.out.println("a == b");
            } else {
                System.out.println("a > b");
            }
        }

        if (a < b) {
            System.out.println("a < b");
        } else if (a == b) {
            System.out.println("a == b");
        } else {
            System.out.println("a > b");
        }

        System.out.println((a < b) ? "a < b" : (a == b) ? "a == b" : "a > b");
    }


    static void demo2() {
        int a = 10;

//        if (a == 1) {
//            System.out.println(1);
//        } else if (a == 2) {
//            System.out.println(2);
//        } else if (a == 3) {
//            System.out.println(3);
//        } else if (a == 4) {
//            System.out.println(4);
//        } else if (a == 5) {
//            System.out.println(5);
//        } else if (a == 6) {
//            System.out.println(6);
//        }


//        switch (a) {
//
//            case 1: {
//                System.out.println(1);
//                break;
//            }
//            case 2: {
//                System.out.println(2);
//                break;
//            }
//            case 3: {
//                System.out.println(3);
//                break;
//            }
//            case 4: {
//                System.out.println(4);
//                break;
//            }
//            case 5: {
//                System.out.println(5);
//                break;
//            }
//            default: {
//                System.out.println("default");
//                break;
//            }
//
//        }


//        String str = "Hello";
////
//        switch (str) {
//            case "QWERTY": {
//                System.out.println("dsfgdsfgfd");
//            }
//            case "Hello": {
//                System.out.println("Hello World!!!!");
//            }
//        }


        String str1 = "AaA";
        String str2 = "AAA";
        String str3 = new String("AAA");


//        System.out.println(str1 == str2);
//        System.out.println(str1 == str3);
//        System.out.println();
//
//        System.out.println(str1.equals(str2));
//        System.out.println(str1.equals(str3));


//        String newStr = str3.intern();
//
//        System.out.println(str1 == str3);
//        System.out.println(str1 == newStr);

//        System.out.println(str1.equals("aAa"));
    }


    static void demo1() {
//        int a = 11;
//        int b = 20;
//        int c = 30;

//        if (a > b) {
//            System.out.println("a > b");
//        } else {
//            System.out.println("a <= b");
//        }


//        if (a > b) {
//            System.out.println("a > b");
//        } else if (a < b) {
//            System.out.println("a < b");
//        }

//        if (a > b) {
//            System.out.println("a > b");
//        } else if (a < b) {
//            System.out.println("a < b");
//        } else {
//            System.out.println("a = b");
//        }

//        if (a >= b) {
//
//            if (a > b) {
//                System.out.println("a > b");
//            } else {
//                System.out.println("a = b");
//            }
//
//        } else if (a < b) {
//            System.out.println("a < b");
//        } else {
//            System.out.println("sfdgsdgsdf");
//        }


        // BAD PRACTISE
//        if (a > b)
//            System.out.println("a > b");
//            System.out.println("Hello");
    }
}


























