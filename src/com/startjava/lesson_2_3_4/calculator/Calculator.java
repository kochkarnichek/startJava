package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    public static double calculate(String input) {
        String[] expression = input.split(" ");
        int a = Integer.parseInt(expression[0]);
        int b = Integer.parseInt(expression[2]);
        String sign = expression[1];
        return switch (sign) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            case "/" -> (double) a / b;
            case "^" -> Math.pow(a, b);
            case "%" -> Math.floorMod(a, b);
            default ->
                throw new IllegalStateException("Ошибка: операция" + sign + "не поддерживается.\n" +
                                                    "Доступны следующие операции: +, -, *, /, ^, %");
        };
    }
}