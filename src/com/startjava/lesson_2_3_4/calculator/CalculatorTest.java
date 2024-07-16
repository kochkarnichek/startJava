package com.startjava.lesson_2_3_4.calculator;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String choice = "yes";
        do {
            if (choice.equals("yes")) {
                System.out.print("\nВведите математическое выражение: ");
                String input = scan.nextLine().trim();
                String[] expression = input.split(" ");
                int firstNum = Integer.parseInt(expression[0]);
                int secondNum = Integer.parseInt(expression[2]);
                String sign = expression[1];
                double result = Calculator.calculate(firstNum, sign, secondNum);
                System.out.print(firstNum + " " + sign + " " + secondNum + " = ");
                printResult(result);
                scan.nextLine();
            }
            System.out.println("\nХотите продолжить вычисления? [yes / no]: ");
            choice = scan.nextLine().toLowerCase();
            if (!choice.equals("yes") && !choice.equals("no")) {
                System.out.println("Введите корректный ответ [yes / no]:");
            }
        } while (!choice.equals("no"));
    }

    public static void printResult(double result) {
        String strPattern = "#####.###";
        DecimalFormat dFormat = new DecimalFormat(strPattern);
        String formattedResult = dFormat.format(result);
        System.out.print(formattedResult);
    }
}