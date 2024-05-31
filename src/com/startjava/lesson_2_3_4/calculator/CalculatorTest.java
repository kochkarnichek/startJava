package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner scan = new Scanner(System.in);
        String choice;
        do {
            System.out.println("Введите первое число: ");
            calc.setA(scan.nextInt());
            System.out.println("Введите знак математической операции: ");
            calc.setSign(scan.next().charAt(0));
            System.out.println("Введите второе число: ");
            calc.setB(scan.nextInt());

            System.out.println("Результат равен: " + calc.calculate());
            scan.nextLine();

            do {
                System.out.println("Хотите продолжить вычисления? [yes/no]: ");
                choice = scan.nextLine();
            } while (!choice.equals("no") && !choice.equals("yes"));
        } while (choice.equals("yes"));
    }
}