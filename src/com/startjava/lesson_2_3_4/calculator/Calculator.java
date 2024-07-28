package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    private static int a;
    private static int b;
    private static String sign;

    public static double calculate(String input) {
        String[] args = input.split(" ");
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[2]);
        String sign = args[1];
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