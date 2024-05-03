package com.startjava.lesson_1.final_;

public class MyFirstGame {
    public static void main(String[] args) {
        int playerNum = 9;
        int numToGuess = 99;
        while (playerNum != numToGuess) {
            if (playerNum < numToGuess) {
                System.out.println("Число " + playerNum + " меньше того, что загадал компьютер");
                if (numToGuess / playerNum >= 2) {
                    playerNum += 15;
                } else {
                    playerNum++;
                } 
            } else if (playerNum < numToGuess) {
                System.out.println("Число " + playerNum + " больше того, что загадал компьютер");
                if (playerNum / numToGuess >= 2) {
                    playerNum -= 15;
                } else {
                    playerNum--;
                }
            }
        }
        System.out.println("Вы победили!");
    }
}