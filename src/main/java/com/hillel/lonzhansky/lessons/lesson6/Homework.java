package com.hillel.lonzhansky.lessons.lesson6;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String team1;

        int player1 = 0;


//        System.out.println("Please enter team name");
//        team1 = scanner.nextLine();

        System.out.println("Please enter player1 frags");
        if (scanner.hasNextInt() ) {
            player1 = scanner.nextInt();
            if (player1 <= 0) {

            }
        }

        System.out.println(player1);


        System.out.println(scanner.nextLine());
    }
}
