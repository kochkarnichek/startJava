package com.startjava.lesson_2_3_4.guess;

import java.lang.Math;
import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;
    private int hiddenNumber;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void play() {
        Scanner scan = new Scanner(System.in, "cp866");
        hiddenNumber = (int) (Math.random() * 100 + 1);
        do {
            System.out.println(player1.getName() + ", введите число");
            player1.setNumber(scan.nextInt());
            int number1 = player1.getNumber();

            if (number1 == hiddenNumber) {
                System.out.println("Вы угадали! Компьютер загадал число " + hiddenNumber);
                break;
            }
            if (number1 < hiddenNumber) {
                System.out.println("Число " + number1 + " меньше того, что загадал компьютер");
            } else {
                System.out.println("Число " + number1 + " больше того, что загадал компьютер");
            }

            System.out.println(player2.getName() + ", введите число");
            player2.setNumber(scan.nextInt());
            int number2 = player2.getNumber();

            if (number2 == hiddenNumber) {
                System.out.println("Вы угадали! Компьютер загадал число " + hiddenNumber);
                break;
            }
            if (number2 < hiddenNumber) {
                System.out.println("Число " + number2 + " меньше того, что загадал компьютер");
            } else {
                System.out.println("Число " + number2 + " больше того, что загадал компьютер");
            }
        } while (true);
    }
}