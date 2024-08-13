package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    private Calculator() {
    }

    private static final int EXPRESSION_LENGTH = 3;

    public static double calculate(String input) {
        String[] args = input.split(" +");
        if (args.length != EXPRESSION_LENGTH) {
            throw new RuntimeException("Ошибка! Введите 3 символа, разделенные пробелами.");
        }
        int a = checkArg(args[0]);
        int b = checkArg(args[2]);
        String sign = args[1];
        return switch (sign) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            case "/", "%" -> {
                if (b == 0) {
                    throw new ArithmeticException("Делить на ноль нельзя.");
                }
                yield (sign.equals("/") ? (double) a / b : Math.floorMod(a, b));
            }
            case "^" -> Math.pow(a, b);
            default ->
                throw new IllegalStateException("Ошибка: операция " + sign + " не поддерживается.\n" +
                        "Доступны следующие операции: +, -, *, /, ^, %");
        };
    }

    private static int checkArg(String arg) {
        try {
            return Integer.parseInt(arg);
        } catch (RuntimeException e) {
            throw new RuntimeException(arg + " не является целым числом. Используйте только целые числа.");
        }
    }
}