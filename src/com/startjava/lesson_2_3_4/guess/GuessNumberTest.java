package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in, "cp866");

        System.out.println("Введите имя первого игрока: ");
        String player1Name = scan.nextLine();
        Player player1 = new Player(player1Name);

        System.out.println("Введите имя второго игрока: ");
        String player2Name = scan.nextLine();
        Player player2 = new Player(player2Name);

        String answer;
        do {
            GuessNumber game = new GuessNumber(player1, player2);
            game.play();

            do {
                System.out.println("Хотите продолжить игру? [yes/no]: ");
                answer = scan.nextLine().toLowerCase();
            } while (!answer.equals("yes") && !answer.equals("no"));
        } while (answer.equals("yes"));
    }
}