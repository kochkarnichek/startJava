package com.startjava.lesson_1.final_;

public class Calculator {
    public static void main(String[] args) {
        int a = 9;
        int b = 3;
        char sign = '^';
        int result = 0;
        if (sign == '+') {
            result = a + b;
        } else if (sign == '-') {
            result = a - b;
        } else if (sign == '*') {
            result = a * b;
        } else if (sign == '/') {
            result = a / b;
        } else if (sign == '^') {
            result = a;
            for (int i = 1; i < b; i++) {
                result *= a;
            }
        } else if (sign == '%') {
            result = a % b;
        } else {
            System.out.println("You've chosen wrong sign");
        }
        System.out.println(a + " " + sign + " " + b + " = " + result);
    }
}