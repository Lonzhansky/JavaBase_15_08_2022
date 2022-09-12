package com.hillel.lonzhansky.lessons.lesson10.homeworkreview;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter team1 name");
        String team1name = scanner.nextLine();
        System.out.println("You entered: " + team1name);

        System.out.println("Please enter team2 name");
        String team2name = scanner.nextLine();
        System.out.println("You entered: " + team2name);

        int[][] game = new int[2][5];

        for (int i = 0; i < game.length; i++) {
            for (int j = 0; j < game[i].length; j++) {
                game[i][j] = getNumber(scanner, i == 0 ? team1name : team2name, j + 1);
            }
        }

        double resultTeam1 = 0;
        double resultTeam2 = 0;
        double avgResultTeam1;
        double avgResultTeam2;
//        for (int i = 0; i < game.length; i++) {
//            for (int j = 0; j < game[i].length; j++) {
//                if (i == 0) {
//                    resultTeam1 += game[i][j];
//                } else {
//                    resultTeam2 += game[i][j];
//                }
//            }
//        }

        for (int i = 0; i < game.length; i++) {
            for (int value : game[i]) {
                if (i == 0) {
                    resultTeam1 += value;
                } else {
                    resultTeam2 += value;
                }
            }
        }

        avgResultTeam1 = resultTeam1 / game[0].length;
        avgResultTeam2 = resultTeam2 / game[1].length;

        scanner.close();

        System.out.println(resultTeam2);
        System.out.println(avgResultTeam2);

        if (avgResultTeam1 > avgResultTeam2) {
            System.out.println("winner " + team1name);
        } else if (avgResultTeam1 < avgResultTeam2) {
            System.out.println("winner " + team2name);
        } else {
            System.out.println("draw");
        }
    }

    static int getNumber(Scanner scanner, String teamName, int player) {
        int number;
        while (true) {
            System.out.println("Please enter frags for " + teamName + " player " + player);
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                break;
            } else {
                System.out.println("WRONG DATA, RESTART!");
                scanner.nextLine();
            }
        }
        return number;
    }
}