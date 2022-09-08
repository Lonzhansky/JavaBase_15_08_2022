package com.hillel.lonzhansky.lessons.lesson8;

public class Homework {
    public static void main(String[] args) {

        int min = 30;
        int max = 77;

//        0.0 * 55 = 0.0 -> 0
//        0.9 * 55 = 54.99999 -> 54 // BAD
//        0.9 * 55 - 30 + 1 = 26 * 0.999 = 25.999999 -> 25


        int value =  min + (int) (Math.random() * (max - min + 1));


        final int COUNT_PLAYERS = 25;

        int[] team1 = new int[COUNT_PLAYERS];
        int[] team2 = new int[COUNT_PLAYERS];

        int sumTeam1 = 0;
        for (int i = 0; i < team1.length; i++) {
            sumTeam1 += team1[i];
        }

        int avgTeam1 = sumTeam1 / team1.length;

    }
}
