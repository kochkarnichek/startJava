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
        } else if (num > 0) {
            if (num % 2 == 0) {
                System.out.println(num + " является положительным и четным");
            } else {
                System.out.println(num + " является положительным и нечетным");
            }
        } else {
            if (num % 2 == 0) {
                System.out.println(num + " является отрицательным и четным");
            } else {
                System.out.println(num + " является отрицательным и нечетным");
            }
        }

        System.out.println("\n4. Поиск одинаковых цифр в числах");
        int firstNum = 456;
        int secondNum = 789;
        int firstNumHundreds = firstNum / 100;
        int firstNumTens = firstNum % 100 / 10;
        int firstNumOnes = firstNum % 10;
        int secondNumHundreds = secondNum / 100;
        int secondNumTens = secondNum % 100 / 10;
        int secondNumOnes = secondNum % 10;

        if (firstNumHundreds == secondNumHundreds || firstNumTens == secondNumTens 
            || firstNumOnes == secondNumOnes) {
            System.out.println("В числах " + firstNum + " и " + 
                secondNum + " есть одинаковые цифры :");
            if (firstNumHundreds == secondNumHundreds) {
                System.out.println("Совпадают " + firstNumHundreds + " и " 
                    + secondNumHundreds + " в третьем разряде");
            }
            if (firstNumTens == secondNumTens) {
                System.out.println("Совпадают " + firstNumTens + " и " 
                    + secondNumTens + " во втором разряде");
            }
            if (firstNumOnes == secondNumOnes) {
                System.out.println("Совпадают " + firstNumOnes + " и " 
                    + secondNumOnes + " в первом разряде");
            }
        } else {
            System.out.println("В числах " + firstNum + " и " + secondNum + " нет одинаковых цифр");
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
        if (deposit < 100000) {
            System.out.println("Сумма вклада: " + deposit + 
                "\nСумма начисленного %: " + (deposit * 0.05) + 
                "\nИтоговая сумма с % " + (deposit * 1.05));
        } else if (deposit >= 100000 && deposit < 300000) {
            System.out.println("Сумма вклада: " + deposit + 
                "\nСумма начисленного %: " + (deposit * 0.07) + 
                "\nИтоговая сумма с % " + (deposit * 1.07));
        } else {
            System.out.println("Сумма вклада: " + deposit + 
                "\nСумма начисленного %: " + (deposit * 0.10) + 
                "\nИтоговая сумма с %: " + (deposit * 1.10));
        }

        System.out.println("\n7. Определение оценки по предметам");
        int historyPercentage = 59;
        int historyGrade = 0;
        int programmingPercentage = 92;
        int programmingGrade = 0;

        if (historyPercentage <= 60) {
            historyGrade = 2;
        } else if (historyPercentage > 60 && historyPercentage <= 73) {
            historyGrade = 3;
        } else if (historyPercentage > 73 && historyPercentage <= 91) {
            historyGrade = 4;
        } else {
            historyGrade = 5;
        }

        if (programmingPercentage <= 60) {
            programmingGrade = 2;
        } else if (programmingPercentage > 60 && programmingPercentage <= 73) {
            programmingGrade = 3;
        } else if (programmingPercentage > 73 && programmingPercentage <= 91) {
            programmingGrade = 4;
        } else {
            programmingGrade = 5;
        }

        int gpa = (historyGrade + programmingGrade) / 2;
        int averagePercentage = (historyPercentage + programmingPercentage) / 2;
        System.out.println("История: " + historyGrade + "\nПрограммирование: " + programmingGrade + 
            "\nСредний балл по предметам: " + gpa + "\nСредний процент по предметам " + 
            averagePercentage);

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