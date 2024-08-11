package com.startjava.lesson_2_3_4.calculator;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculatorTest {
    private static final String YES = "yes";
    private static final String NO = "no";

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String choice = "yes";
        do {
            try {
                if (choice.equals(YES)) {
                    System.out.print("\nВведите математическое выражение: ");
                    String expression = scan.nextLine().trim();
                    double result = Calculator.calculate(expression);
                    printResult(expression, result);
                    System.out.print("\nХотите продолжить вычисления? [yes / no]: ");
                } else {
                    System.out.println("Введите корректный ответ [yes / no]:");
                }
                choice = scan.nextLine().toLowerCase().trim();
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }
        } while (!choice.equals(NO));
    }

    public static void printResult(String inputExpression, double result) {
        DecimalFormat df = new DecimalFormat("#####.###");
        System.out.print(inputExpression.replaceAll("\\s+", " ") + " = " + df.format(result));
    }
}