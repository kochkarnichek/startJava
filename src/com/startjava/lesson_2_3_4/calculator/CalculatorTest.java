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
                String expression = scan.nextLine().trim();
                double result = Calculator.calculate(expression);
                printResult(expression, result);
                System.out.print("\nХотите продолжить вычисления? [yes / no]: ");
            } else {
                System.out.println("Введите корректный ответ [yes / no]:");
            }
            choice = scan.nextLine().toLowerCase();
        } while (!choice.equals("no"));
    }

    public static void printResult(String input, double result) {
        DecimalFormat df = new DecimalFormat("#####.###");
        System.out.print(input + " = " + df.format(result));
    }
}