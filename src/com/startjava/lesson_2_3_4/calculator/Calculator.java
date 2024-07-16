package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    public static double calculate(int firstNum, String sign, int secondNum) {
        return switch (sign) {
            case "+" -> firstNum + secondNum;
            case "-" -> firstNum - secondNum;
            case "*" -> firstNum * secondNum;
            case "/" -> (double) firstNum / secondNum;
            case "^" -> Math.pow(firstNum, secondNum);
            case "%" -> Math.floorMod(firstNum, secondNum);
            default -> Double.NaN;
        };
    }
}