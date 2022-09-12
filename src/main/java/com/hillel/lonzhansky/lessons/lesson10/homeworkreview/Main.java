package com.hillel.lonzhansky.lessons.lesson10.homeworkreview;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter team1 name");
        String team1name = scanner.nextLine();
        System.out.println("You entered: " + team1name);

        int player1team1 = getNumber(scanner, team1name, 1);
        int player2team1 = getNumber(scanner, team1name, 2);
        int player3team1 = getNumber(scanner, team1name, 3);
        int player4team1 = getNumber(scanner, team1name, 4);
        int player5team1 = getNumber(scanner, team1name, 5);

        scanner.nextLine();

        System.out.println("Please enter team2 name");
        String team2name = scanner.nextLine();
        System.out.println("You entered: " + team2name);

        int player1team2 = getNumber(scanner, team2name, 1);
        int player2team2 = getNumber(scanner, team2name, 2);
        int player3team2 = getNumber(scanner, team2name, 3);
        int player4team2 = getNumber(scanner, team2name, 4);
        int player5team2 = getNumber(scanner, team2name, 5);

        System.out.println();
        scanner.close();

        double resultTeam1 = (player1team1 + player2team1 + player3team1 + player4team1 + player5team1);
        double resultpoint = resultTeam1 / 5;

        System.out.println(resultTeam1);
        System.out.println(resultpoint);

        double resultTeam2 = (player1team2 + player2team2 + player3team2 + player4team2 + player5team2);
        double resultpoint2 = resultTeam2 / 5;

        System.out.println(resultTeam2);
        System.out.println(resultpoint2);

        if (resultpoint > resultpoint2) {
            System.out.println("winner " + team1name);
        } else if (resultpoint < resultpoint2) {
            System.out.println("winner " + team2name);
        } else {
            System.out.println("draw");
        }

        System.out.println("Winner lion + 55 frags + 11 Point");
    }

    static int getNumber(Scanner scanner, String teamName, int player) {
        int number;
        while (true) {
            System.out.println("Please enter frags for "+teamName+" player " + player);
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