package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysTheme {
    public static void main(String[] args) {
        reverseArrayValues();
        calculateFactorial();
        deleteArrayValues();
        printAlphabet();
        generateUniqueNums();
        playHangman();
    }

    public static void reverseArrayValues() {
        System.out.println("1. Реверс значений массива");
        int[] numsToReverse = {1, 7, 2, 6, 3, 5, 4};
        System.out.println("До реверса: " + Arrays.toString(numsToReverse));
        int length = numsToReverse.length;
        for (int i = 0; i < length / 2; i++) {
            int temp = numsToReverse[i];
            numsToReverse[i] = numsToReverse[length - i - 1];
            numsToReverse[length - i - 1] = temp;
        }
        System.out.println("После реверса: " + Arrays.toString(numsToReverse));
    }

    public static void calculateFactorial() {
        System.out.println("\n2. Вычисление факториала");
        int[] numsToFactorial = new int[10];
        int length = numsToFactorial.length;
        for (int i = 0; i < length; i++) {
            numsToFactorial[i] = i;
        }
        int factorial = 1;
        for (int i = 1; i <= length - 2; i++) {
            System.out.print((i == 1 ? "" : " * ") + numsToFactorial[i]);
            factorial *= numsToFactorial[i];
        }
        System.out.print(" = " + factorial);
    }

    public static void deleteArrayValues() {
        System.out.println("\n\n3. Удаление элементов массива");
        double[] randomNums = new double[15];
        int length = randomNums.length;
        for (int i = 0; i < length; i++) {
            randomNums[i] = Math.random();
        }
        System.out.println("Исходный массив:");
        for (int i = 0; i < length; i++) {
            System.out.printf("%10.3f", randomNums[i]);
            if ((i + 1) % 8 == 0) {
                System.out.println();
            }
        }
        int middle = length / 2;
        double middleNum = randomNums[middle];
        int count = 0;
        for (int i = 0; i < length; i++) {
            if (randomNums[i] > middleNum) {
                randomNums[i] = 0;
                count++;
            }
        }
        System.out.println("\nИзмененный массив:");
        for (int i = 0; i < length; i++) {
            System.out.printf("%10.3f", randomNums[i]);
            if ((i + 1) % 8 == 0) {
                System.out.println();
            }
        }
        System.out.println("\nКоличество обнуленных ячеек: " + count);
    }

    public static void printAlphabet() {
        System.out.println("\n4. Вывод алфавита лесенкой");
        char[] alphabet = new char[26];
        int length = alphabet.length;
        for (int i = 0; i < length; i++) {
            alphabet[i] = (char) ('A' + i);
        }
        for (int i = 1; i <= length; i++) {
            for (int j = length - 1; j >= length - i; j--) {
                System.out.print(alphabet[j]);
            }
            System.out.println();
        }
    }

    public static void generateUniqueNums() {
        System.out.println("\n5. Заполнение массива уникальными числами");
        int[] randIntNums = new int[30];
        int length = randIntNums.length;
        for (int i = 0; i < length; i++) {
            boolean isUniqueNum;
            do {
                randIntNums[i] = (int) (Math.random() * (40)) + 60;
                isUniqueNum = true;
                for (int j = 0; j < i; j++) {
                    if (randIntNums[i] == randIntNums[j]) {
                        isUniqueNum = false;
                        break;
                    }
                }
            } while (!isUniqueNum);
        }
        Arrays.sort(randIntNums);
        for (int i = 0; i < length; i++) {
            if (i % 10 == 0 && i != 0) {
                System.out.println();
            }
            System.out.print(randIntNums[i] + " ");
        }
    }

    public static void playHangman() {
        System.out.println("\n\n6. Игра Виселица");
        String[] wordsToGuess = {"КОШКА", "КРОШКА", "КАРТОШКА", "БЭКЕНД", "СУРИКАТ",
                "ГОЛАНГ", "КОГТЕТОЧКА", "МЫШЕЛОВКА", "ГАМАЮН"};
        System.out.println("Попробуйте угадать слово, не оказавшись на виселице");

        String secretWord = wordsToGuess[(int) (Math.random() * wordsToGuess.length)];
        char[] chosenWord = secretWord.toCharArray();
        char[] wordMask = chosenWord.clone();
        Arrays.fill(wordMask, '_');

        Scanner scan = new Scanner(System.in);
        boolean isPlaying = true;
        int counterUsedSymbols = 0;
        int triesTotal = 7;
        int tries = 0;
        int triesLeft = triesTotal - tries;
        int unluckyTries = 0;
        char[] symbolsArray = new char[33];

        do {
            printLetters(symbolsArray, counterUsedSymbols, wordMask);
            for (char m : wordMask) {
                System.out.print(m + " ");
            }
            System.out.print("\nВведите любую букву: ");
            char playerGuess = Character.toUpperCase(scan.next().charAt(0));
            boolean isFound = false;
            int toIndex = counterUsedSymbols + 1;
            if (searchLetter(symbolsArray, playerGuess, toIndex) == -1) {
                symbolsArray[counterUsedSymbols++] = playerGuess;
                for (int i = 0; i < chosenWord.length; i++) {
                    if (chosenWord[i] == playerGuess) {
                        isFound = true;
                        wordMask[i] = playerGuess;
                    }
                }
                if (isFound) {
                    tries++;
                    unluckyTries--;
                    if (unluckyTries < 0) {
                        unluckyTries = 0;
                    }
                    if (tries >= triesTotal) {
                        tries = triesTotal;
                    }
                } else {
                    if (Character.isDigit(playerGuess) || (playerGuess >= 'A' && playerGuess <= 'Z')) {
                        System.out.println("Неверный символ! Используйте только кириллицу");
                    } else {
                        tries++;
                        unluckyTries++;
                        if (triesLeft > 0) {
                            System.out.printf("\nУ вас осталось %d попыток\n", triesLeft - unluckyTries);
                        } else {
                            System.out.println("Упс! У вас закончились попытки");
                        }
                    }
                }
                printGallow(unluckyTries);

                isPlaying = false;
                if (searchLetter(wordMask, '_', wordMask.length) == -1) {
                    System.out.println("\nВы отгадали слово " + secretWord);
                } else if (triesLeft == 0) {
                    System.out.println("Вы проиграли! Мы загадали слово " + secretWord);
                } else {
                    isPlaying = true;
                }
            }
        } while (isPlaying);
    }

    private static int searchLetter(char[] array, char elementToSearch, int toIndex) {
        for (int i = 0; i < toIndex; i++) {
            if (array[i] == elementToSearch) {
                return i;
            }
        }
        return -1;
    }

    private static void printLetters(char[] array, int index, char[] wordMask) {
        if (index > 0) {
            System.out.print("\nВы использовали буквы: ");
        }
        for (int i = 0; i < index; i++) {
            if ((searchLetter(wordMask, array[i], wordMask.length) == -1)) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
    }

    public static void printGallow(int unluckyTries) {
        switch (unluckyTries) {
            case 1:
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                break;
            case 2:
                System.out.println(" _______");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                break;
            case 3:
                System.out.println(" _______");
                System.out.println("|   |");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                break;
            case 4:
                System.out.println(" _______");
                System.out.println("|   |");
                System.out.println("|   O ");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                break;
            case 5:
                System.out.println(" _______");
                System.out.println("|   |");
                System.out.println("|   O ");
                System.out.println("|  / \\");
                System.out.println("|");
                System.out.println("|");
                break;
            case 6:
                System.out.println(" _______");
                System.out.println("|   |");
                System.out.println("|   O ");
                System.out.println("|  / \\");
                System.out.println("|   |");
                System.out.println("|");
                break;
            case 7:
                System.out.println(" _______");
                System.out.println("|   |");
                System.out.println("|   O ");
                System.out.println("|  / \\");
                System.out.println("|   |");
                System.out.println("|  / \\");
                break;
            default:
                System.out.print("Вы угадали букву!\n");
                break;
        }
    }
}
