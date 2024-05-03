package com.startjava.lesson_1.base;

public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел");
        int sumEven = 0;
        int sumOdd = 0;
        int startPoint = -10;
        int endPoint = 21;
        int counter = startPoint;
        do {
            if (counter % 2 == 0) {
                sumEven += counter;
            } else {
                sumOdd += counter;
            }
            counter++;
        } while (counter <= endPoint);
        System.out.println("В отрезке [" + startPoint + ", " + endPoint +
                "] сумма четных чисел = " + sumEven + ", а нечетных = " + sumOdd);

        System.out.println("\n2. Вывод чисел в порядке убывания");
        int a = 10;
        int b = 5;
        int c = -1;

        int max = a;
        if (b > max) {
            max = b;
        } else if (c > max) {
            max = c;
        }

        int min = c;
        if (b < min) {
            min = b;
        } else if (a < min) {
            min = a;
        }

        for (int i = max - 1; i > min; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр");
        int originNum = 1234;
        int sum = 0;
        while (originNum > 0) {
            int digit = originNum % 10;
            System.out.print(digit);
            sum += digit;
            originNum /= 10;
        }
        System.out.println(", сумма цифр числа: " + sum);

        System.out.println("\n4. Вывод чисел в несколько строк");
        int count = 0;
        for (int i = 1; i < 24; i++) {
            if (i % 2 != 0) {
                System.out.printf("%3d", i);
                count++;
                if (count % 5 == 0) {
                    System.out.println();
                }
            }
        }
        while (count % 5 != 0) {
            System.out.printf("%3d", 0);
            count++;
        }

        System.out.println("\n\n5. Проверка количества двоек числа на четность/нечетность");
        originNum = 3242592;
        int originNumCopy = originNum;
        int countTwos = 0;
        while (originNumCopy > 0) {
            if ((originNumCopy % 10) == 2) {
                countTwos++;
            }
            originNumCopy /= 10;
        }
        if (countTwos % 2 != 0) {
            System.out.println("В " + originNum + " нечетное количество двоек - " + countTwos);
        } else {
            System.out.println("В " + originNum + " четное количество двоек - " + countTwos);
        }

        System.out.println("\n6. Отображение геометрических фигур");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        int row = 5;
        while (row >= 1) {
            int column = 1;
            while (column <= row) {
                System.out.print("#");
                column++;
            }
            System.out.println();
            row--;
        }
        System.out.println();

        int column = 1;
        row = 1;
        count = 0;
        do {
            System.out.print("$");
            count++;
            if (count == row) {
                if (column < 3) {
                    row++;
                } else {
                    row--;
                }
                count = 0;
                column++;
                System.out.println();
            }
        } while (column <= 5);

        System.out.println("\n7. Отображение ASCII-символов");
        System.out.printf("%-9s %-11s %-13s\n", "DECIMAL", "CHARACTER", "DESCRIPTION");
        for (int i = 33; i < 126; i++) {
            String characterName = Character.getName(i);
            if (i < 47 && i % 2 != 0) {
                System.out.printf("  %-11d %-7c %-10s\n", i, i, characterName);
            }

            if (Character.isLowerCase(i) && i % 2 == 0) {
                System.out.printf("  %-11d %-7c %-10s\n", i, i, characterName);
            }
        }

        System.out.println("\n8. Проверка, является ли число палиндромом");
        originNum = 1234321;
        originNumCopy = originNum;
        int reversedNum = 0;
        while (originNumCopy > 0) {
            int digit = originNumCopy % 10;
            reversedNum = reversedNum * 10 + digit;
            originNumCopy /= 10;
        }
        if ((originNum == reversedNum)) {
            System.out.println("Число " + originNum + " является палиндромом");
        } else {
            System.out.println("Число " + originNum + " не является палиндромом");
        }

        System.out.println("\n9. Проверка, является ли число счастливым");
        int luckyNum = 290820;
        int rightHalf = luckyNum % 1000;
        int rightHalfCopy = rightHalf;
        int sumRightHalf = 0;
        int leftHalf = luckyNum / 1000;
        int leftHalfCopy = leftHalf;
        int sumLeftHalf = 0;
        while (leftHalfCopy > 0) {
            sumRightHalf += rightHalfCopy % 10;
            rightHalfCopy /= 10;
            sumLeftHalf += leftHalfCopy % 10;
            leftHalfCopy /= 10;
        }
        if (sumRightHalf == sumLeftHalf) {
            System.out.printf("Число %d является счастливым\n", luckyNum);
        } else {
            System.out.printf("Число %d не является счастливым\n", luckyNum);
        }
        System.out.printf("Сумма цифр %d = %d, а сумма %d = %d\n", 
                leftHalf, sumLeftHalf, rightHalf, sumRightHalf);

        System.out.println("\n10. Отображение таблицы умножения Пифагора");
        System.out.println("\n     |  2  3  4  5  6  7  8  9");
        System.out.println("   ---------------------------");

        for (int i = 2; i <= 9; i++) {
            System.out.printf("%4d | ", i);
            for (int j = 2; j <= 9; j++) {
                System.out.printf("%2d ", i * j);
            }
            System.out.println();
        }
    }
}