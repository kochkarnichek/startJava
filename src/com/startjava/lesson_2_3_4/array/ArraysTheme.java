package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysTheme {
    public static void main(String[] args) {
        reverseArrayValues();
        calculateFactorial();
        deleteArrayValues();
        printAlphabet();
        fillUniqueNums();
        playHangman();
    }

    public static void reverseArrayValues() {
        System.out.println("1. Реверс значений массива");
        int[] numsToReverse = {1, 7, 2, 6, 3, 5, 4};
        System.out.println("До реверса: " + Arrays.toString(numsToReverse));
        int length = numsToReverse.length;
        for (int i = 0; i < length / 2; i++) {
            int swap = numsToReverse[i];
            numsToReverse[i] = numsToReverse[--length];
            numsToReverse[length] = swap;
        }
        System.out.println("После реверса: " + Arrays.toString(numsToReverse));
    }

    public static void calculateFactorial() {
        System.out.println("\n2. Вычисление факториала");
        int[] multipliers = new int[10];
        int length = multipliers.length;
        for (int i = 0; i < length; i++) {
            multipliers[i] = i;
        }
        int factorial = 1;
        for (int i = 1; i <= length - 2; i++) {
            System.out.print((i == 1 ? "" : " * ") + multipliers[i]);
            factorial *= multipliers[i];
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
        printArray(randomNums);

        double middleNum = randomNums[length / 2];
        int count = 0;
        for (int i = 0; i < length; i++) {
            if (randomNums[i] > middleNum) {
                randomNums[i] = 0;
                count++;
            }
        }
        System.out.println("\nИзмененный массив:");
        printArray(randomNums);
        System.out.println("\nКоличество обнуленных ячеек: " + count);
    }

    public static void printArray(double[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%6.3f", array[i]);
            int middleIndex = array.length / 2;
            if ((i + 1) % (middleIndex + 1) == 0) {
                System.out.println();
            }
        }
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

    public static void fillUniqueNums() {
        System.out.println("\n5. Заполнение массива уникальными числами");
        int[] uniqueNums = new int[30];
        int length = uniqueNums.length;
        for (int i = 0; i < length; i++) {
            boolean isUniqueNum;
            do {
                uniqueNums[i] = (int) (Math.random() * (40)) + 60;
                isUniqueNum = true;
                for (int j = 0; j < i; j++) {
                    if (uniqueNums[i] == uniqueNums[j]) {
                        isUniqueNum = false;
                        break;
                    }
                }
            } while (!isUniqueNum);
        }
        Arrays.sort(uniqueNums);
        for (int i = 0; i < length; i++) {
            if (i % 10 == 0 && i != 0) {
                System.out.println();
            }
            System.out.print(uniqueNums[i] + " ");
        }
    }

    public static void playHangman() {
        System.out.println("\n\n6. Игра Виселица");
        String[] wordsToGuess = {"КОШКА", "КРОШКА", "КАРТОШКА", "БЭКЕНД", "СУРИКАТ",
                "ГОЛАНГ", "КОГТЕТОЧКА", "МЫШЕЛОВКА", "ГАМАЮН"};
        String[] gallow = {" _______",
                "|   |",
                "|   O ",
                "|  / \\",
                "|   |",
                "|  / \\"};

        System.out.println("Попробуйте угадать слово, не оказавшись на виселице");

        String secretWord = wordsToGuess[(int) (Math.random() * wordsToGuess.length)];
        char[] chosenWord = secretWord.toCharArray();
        char[] wordMask = chosenWord.clone();
        Arrays.fill(wordMask, '_');

        Scanner scan = new Scanner(System.in);
        boolean isPlaying = true;
        int counterUsedSymbols = 0;
        int triesTotal = 6;
        int currTry = 0;
        int triesLeft = triesTotal - currTry;
        int unluckyTries = 0;
        char[] usedSymbols = new char[33];

        do {
            printLetters(usedSymbols, counterUsedSymbols, wordMask);
            StringBuilder sb = new StringBuilder();
            for (char m : wordMask) {
                sb.append(m).append(" ");
            }
            System.out.println(sb);
            System.out.print("\nВведите любую букву: ");
            char playerGuess = Character.toUpperCase(scan.next().charAt(0));
            for (char usedSymbol : usedSymbols) {
                if (playerGuess == usedSymbol) {
                    System.out.println("Этот символ уже использован");
                }
            }
            boolean isFound = false;
            int index = counterUsedSymbols + 1;
            if (searchLetter(usedSymbols, playerGuess, index) == -1) {
                usedSymbols[counterUsedSymbols++] = playerGuess;
                for (int i = 0; i < chosenWord.length; i++) {
                    if (chosenWord[i] == playerGuess) {
                        isFound = true;
                        wordMask[i] = playerGuess;
                    }
                }
                if (isFound) {
                    currTry++;
                    unluckyTries--;
                    if (unluckyTries < 0) {
                        unluckyTries = 0;
                    }
                    if (currTry >= triesTotal) {
                        currTry = triesTotal;
                    }
                } else {
                    if (!Character.toString(playerGuess).matches("[а-яА-Я]")) {
                        System.out.println("Неверный символ! Используйте только кириллицу");
                    } else {
                        currTry++;
                        unluckyTries++;
                        if (triesLeft > 0) {
                            System.out.printf("\nУ вас осталось %d попыток\n", triesLeft - unluckyTries);
                        } else {
                            System.out.println("Упс! У вас закончились попытки");
                        }
                    }
                }
                for (int i = 0; i < unluckyTries; i++) {
                    sb.append(gallow[i]).append("\n ");
                    System.out.print(sb);
                }
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

    private static void printLetters(char[] array, int index, char[] wordMask) {
        if (index > 0) {
            System.out.print("\nИспользованы буквы: ");
        }
        for (int i = 0; i < index; i++) {
            if ((searchLetter(wordMask, array[i], wordMask.length) == -1)) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
    }

    private static int searchLetter(char[] array, char elementToSearch, int index) {
        for (int i = 0; i < index; i++) {
            if (array[i] == elementToSearch) {
                return i;
            }
        }
        return -1;
    }
}
