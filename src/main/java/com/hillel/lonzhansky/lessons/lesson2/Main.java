package com.hillel.lonzhansky.lessons.lesson2;

public class Main {
    public static void main(String[] args) {

        //lowerCamelCase
        byte byteVariable = 127;
        byte byteVariable2 = -128;

        System.out.println(127);
        System.out.println(byteVariable);
        System.out.println(byteVariable2);

        byteVariable = 5;
        System.out.println(byteVariable);

        short shortVariable = 32100;
        int intVariable = 2_000_000;
        long longVariable = 493274982343243L;

        float floatVariable = 1.11111111111f;
        double doubleVariable = 1.11111111111;

        System.out.println();
        System.out.println(floatVariable);
        System.out.println(doubleVariable);
        char charVariable = 'A';
        char charVariable2 = 1031;
        char charVariable3 = '\u0407';

        System.out.println(charVariable);
        System.out.println(charVariable2);
        System.out.println(charVariable3);

        boolean booleanVariableTrue = true;
        boolean booleanVariableFalse = false;

        System.out.println(booleanVariableTrue);
        System.out.println(booleanVariableFalse);


        System.out.println();
        String str1 = "Hello";
        String str2 = "Hello";
//        String str3 = new String("Hello");
//        String str4 = new String("Hello");

        final double VALUE_PI = 3.14;

        byte someByte = 120;
        short someShort = someByte;
        long someLong = someByte;

//        long someLong2 = 234234234324L;
//        byte someByte2 = someLong; // ERROR!!!

        char charValueA = 'A';

        int intValue = charValueA;
        System.out.println(intValue);

        double someDoubleValue = charValueA;
        System.out.println(someDoubleValue);


        System.out.println();
        System.out.println();

        byte overValue1 = (byte) 127;
        byte overValue2 = (byte) 128;
        byte overValue3 = (byte) 129;
        byte overValue4 = (byte) 130;
        byte overValue5 = (byte) 131;

        System.out.println(overValue1);
        System.out.println(overValue2);
        System.out.println(overValue3);
        System.out.println(overValue4);
        System.out.println(overValue5);

        System.out.println();


        byte overValue6 = (byte) -128;
        byte overValue7 = (byte) -129;
        byte overValue8 = (byte) -130;
        byte overValue9 = (byte) -131;
        byte overValue10 = (byte) -132;

        System.out.println(overValue6);
        System.out.println(overValue7);
        System.out.println(overValue8);
        System.out.println(overValue9);
        System.out.println(overValue10);

        System.out.println();

        int intVariableX = 125;
        System.out.println(intVariableX);
        byte b = (byte) intVariableX;
        System.out.println(b);
        intVariableX = b;
        System.out.println(intVariableX);

        System.out.println("Hello \u0407 " + "World " + intVariableX);
    }
}
