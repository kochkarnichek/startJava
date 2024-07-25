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
                double result = Calculator.calculate(input);
                printResult(input, result);
                scan.nextLine();
            }
            System.out.println("\nХотите продолжить вычисления? [yes / no]: ");
            choice = scan.nextLine().toLowerCase();
            if (choice.equals("no")) {
                System.out.println("Калькулятор завершил работу");
            } else {
                System.out.println("Введите корректный ответ [yes / no]:");
            }
        } while (!choice.equals("no"));
    }

    public static void printResult(String input, double result) {
        System.out.print(input + " = ");
        DecimalFormat df = new DecimalFormat("#####.###");
        System.out.print(df.format(result));
    }
}