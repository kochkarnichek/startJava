package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    private static final int EXPRESSION_LENGTH = 3;
    private static int a;
    private static int b;
    private static String sign;

    public static double calculate(String input) throws RuntimeException {
        String[] args = input.split(" +");
        if (args.length != EXPRESSION_LENGTH) {
            throw new RuntimeException("Введите 3 символа, разделенных пробелами.");
        }
        a = isInteger(args[0]);
        b = isInteger(args[2]);
        sign = args[1];
        return switch (sign) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            case "/" -> {
                if (b == 0) {
                    throw new ArithmeticException("Делить на ноль нельзя.");
                }
                yield (double) a / b;
            }
            case "^" -> Math.pow(a, b);
            case "%" -> {
                if (b == 0) {
                    throw new ArithmeticException("Делить на ноль нельзя.");
                }
                yield Math.floorMod(a, b);
            }
            default ->
                throw new IllegalStateException("Ошибка: операция " + sign + " не поддерживается.\n" +
                        "Доступны следующие операции: +, -, *, /, ^, %");
        };
    }

    private static int isInteger (String arg) {
        int element;
        try {
            element = Integer.parseInt(arg);
        } catch (RuntimeException exc) {
            throw new RuntimeException(arg + " не является целым числом. Используйте только целые числа.");
        }
        return element;
    }
}