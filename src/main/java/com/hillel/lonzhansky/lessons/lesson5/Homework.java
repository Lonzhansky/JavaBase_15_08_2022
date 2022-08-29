package com.hillel.lonzhansky.lessons.lesson5;

public class Homework {
    public static void main(String[] args) {

        int warriorLi = 43;
        int archer = 22;
        int horseman = 34;

        int count = 860;

        double result = warriorLi * count + archer * count + horseman * count;
        double result2 = (warriorLi + archer + horseman) * count;

        System.out.println(result);
        System.out.println(result2);

    }
}
