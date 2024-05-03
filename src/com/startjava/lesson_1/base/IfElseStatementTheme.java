package com.startjava.lesson_1.base;

public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("1. Перевод псевдокода на язык Java");
        String gender = "male";
        if (gender != "male") {
            System.out.println("Пройдите в женскую раздевалку");
        } else {
            System.out.println("Пройдите в мужскую раздевалку");
        }

        int age = 25;
        if (age > 18) {
            System.out.println("Вы совершеннолетний");
        } else {
            System.out.println("Вы несовершеннолетний");
        }

        float height = 1.75f;
        if (height < 1.8) {
            System.out.println("Вы ниже среднестатистического датчанина");
        } else {
            System.out.println("Ваш рост равен или выше роста среднестатистического датчанина");
        }

        String name = "Liubov";
        char firstLetterName = name.charAt(0);
        if (firstLetterName == 'M') {
            System.out.println("Возможно, вы Максим");
        } else if (firstLetterName == 'I') {
            System.out.println("Скорее всего, вы Игорь");
        } else {
            System.out.println("Кто вы?");
        }

        System.out.println("\n2. Поиск большего числа");
        int a = 25;
        int b = 125;
        if (a > b) {
            System.out.println("Число " + a + " больше числа " + b);
        } else if (b > a) {
            System.out.println("Число " + b + " больше числа " + a);
        } else {
            System.out.println("Числа " + a + " и " + b + " равны");
        }

        System.out.println("\n3. Проверка числа");
        int num = -435;
        if (num == 0) {
            System.out.println(num + " является нулем");
        } else {
            String evenOrOdd = "";
            String positiveOrNegative = "";
            if (num > 0) {
                positiveOrNegative = "положительным и ";
            } else {
                positiveOrNegative = "отрицательным и ";
            }
            if (num % 2 == 0) {
                evenOrOdd = "четным";
            } else {
                evenOrOdd = "нечетным";
            }
            System.out.println(num + " является " + positiveOrNegative + evenOrOdd);
        }

        System.out.println("\n4. Поиск одинаковых цифр в числах");
        int c = 456;
        int d = 789;
        int cHundreds = c / 100;
        int cTens = c % 100 / 10;
        int cOnes = c % 10;
        int dHundreds = d / 100;
        int dTens = d % 100 / 10;
        int dOnes = d % 10;
        boolean hasEqualDigits = (cHundreds == dHundreds || cTens == dTens || cOnes == dOnes);

        if (hasEqualDigits) {
            System.out.println("В числах " + c + " и " + d + " есть одинаковые цифры :");
            if (cHundreds == dHundreds) {
                System.out.println("Совпадают " + cHundreds + " и " +
                        dHundreds + " в третьем разряде");
            }
            if (cTens == dTens) {
                System.out.println("Совпадают " + cTens + " и " +
                        dTens + " во втором разряде");
            }
            if (cOnes == dOnes) {
                System.out.println("Совпадают " + cOnes + " и " +
                        dOnes + " в первом разряде");
            }
        } else {
            System.out.println("В числах " + c + " и " + d + " нет одинаковых цифр");
        }

        System.out.println("\n5. Определение символа по его коду");
        char symbol = '\u0057';
        if (symbol >= 'A' && symbol <= 'Z') {
            System.out.println("Символ " + symbol + " является заглавной буквой");
        } else if (symbol >= 'a' && symbol <= 'z') {
            System.out.println("Символ " + symbol + " является строчной буквой");
        } else if (symbol >= '0' && symbol <= '9') {
            System.out.println("Символ " + symbol + " является цифрой");
        } else {
            System.out.println("Символ " + symbol + " является не буквой и не цифрой");
        }

        System.out.println("\n6. Подсчет суммы вклада и начисленных банком %");
        int deposit = 301000;
        double rate = 0.10;
        if (deposit < 100000) {
            rate = 0.05;
        } else if (deposit >= 100000 && deposit < 300000) {
            rate = 0.07;
        } 

        System.out.println("Сумма вклада: " + deposit +
                "\nСумма начисленного %: " + (deposit * rate) +
                "\nИтоговая сумма с %: " + (deposit * (1 + rate)));

        System.out.println("\n7. Определение оценки по предметам");
        int historyPercentage = 59;
        int historyGrade = 2;

        if (historyPercentage > 60 && historyPercentage <= 73) {
            historyGrade = 3;
        } else if (historyPercentage > 73 && historyPercentage <= 91) {
            historyGrade = 4;
        } else if (historyPercentage > 91) {
            historyGrade = 5;
        }

        int programmingPercentage = 92;
        int programmingGrade = 5;

        if (programmingPercentage <= 60) {
            programmingGrade = 2;
        } else if (programmingPercentage > 60 && programmingPercentage <= 73) {
            programmingGrade = 3;
        } else if (programmingPercentage > 73 && programmingPercentage <= 91) {
            programmingGrade = 4;
        }

        int gpa = (historyGrade + programmingGrade) / 2;
        int averagePercentage = (historyPercentage + programmingPercentage) / 2;
        System.out.println("История: " + historyGrade +
                "\nПрограммирование: " + programmingGrade +
                "\nСредний балл по предметам: " + gpa +
                "\nСредний процент по предметам " + averagePercentage);

        System.out.println("\n8. Расчет годовой прибыли");
        int earnings = 13000;
        int rent = 5000;
        int primeCost = 9000;
        int annualProfit = (earnings - rent - primeCost) * 12;
        if (annualProfit > 0) {
            System.out.println("Прибыль за год: +" + annualProfit + " руб.");
        } else {
            System.out.println("Прибыль за год: " + annualProfit + " руб.");
        }
    }
}