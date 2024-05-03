package com.startjava.lesson_1.base;

public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("1. Вывод характеристик компьютера");

        short vivobookModel = 15;
        System.out.println("Модель Vivobook: " + vivobookModel);
        long batteryCapacity = 65;
        System.out.println("Емкость аккумулятора: " + batteryCapacity + " Вт");
        double cpuClockRate = 2.42d;
        System.out.println("Тактовая частота процессора: " + cpuClockRate + " Ггц");
        int ramCapacity = 8;
        System.out.println("Объем оперативной памяти: " + ramCapacity + " ГБ");
        float ramAvaliable = 7.7f;
        System.out.println("Из них доступно " + ramAvaliable + " ГБ оперативной памяти");
        byte systemType = 64;
        System.out.println("Тип системы: " + systemType + "-разрядная ОС");
        boolean hasTouchInput = false;
        System.out.println("Доступность сенсорного ввода: " + hasTouchInput);
        char pcName = 'L';
        System.out.println("Имя устройства: " + pcName);

        System.out.println("\n2. Расчет стоимости товара со скидкой");
        int penPrice = 100;
        int bookPrice = 200;
        int totalPrice = penPrice + bookPrice;
        System.out.println("Общая стоимость товаров без скидки: " + totalPrice);
        System.out.println("Сумма скидки: " + (totalPrice * 0.11));
        System.out.println("Общая стоимость товаров со скидкой: " + (totalPrice * 0.89));

        System.out.println("\n3.Вывод слова JAVA");
        System.out.println("   J   a  v      v  a");
        System.out.println("   J  a a  v    v  a a");
        System.out.println("J  J aaaaa  V  V  aaaaa");
        System.out.println(" JJ a     a   V  a     a");

        System.out.println("\nВывод min и max значений целых числовых типов");
        // byte short long int
        byte maxByte = 127;
        System.out.println("Первоначальное значение: " + maxByte);
        System.out.println("Значение после инкремента на единицу: " + (++maxByte));
        System.out.println("Значение после декремента на единицу: " + (--maxByte));
        short maxShort = 32_767;
        System.out.println("\nПервоначальное значение: " + maxShort);
        System.out.println("Значение после инкремента на единицу: " + (++maxShort));
        System.out.println("Значение после декремента на единицу: " + (--maxShort));
        int maxInt = 2_147_483_647;
        System.out.println("\nПервоначальное значение: " + maxInt);
        System.out.println("Значение после инкремента на единицу: " + (++maxInt));
        System.out.println("Значение после декремента на единицу: " + (--maxInt));
        long maxLong = 9_223_372_036_854_775_807L;
        System.out.println("\nПервоначальное значение: " + maxLong);
        System.out.println("Значение после инкремента на единицу: " + (++maxLong));
        System.out.println("Значение после декремента на единицу: " + (--maxLong));

        System.out.println("\n5. Перестановка значений переменных");
        int a = 2;
        int b = 5;

        System.out.println("Перестановка с помощью третьей переменной:");
        System.out.println("Исходные значения переменных: a = " + a + ", b = " + b);
        int swap = a;
        a = b;
        b = swap;
        System.out.println("Новые значения переменных: a = " + a + ", b = " + b);

        System.out.println("\nПерестановка с помощью арифметической операции:");
        System.out.println("Исходные значения переменных: a = " + a + ", b = " + b);
        a += b;
        b = a - b;
        a -= b;
        System.out.println("Новые значения переменных: a = " + a + ", b = " + b);

        System.out.println("\nПерестановка с помощью побитовой операции:");
        System.out.println("Исходные значения переменных: a = " + a + ", b = " + b);
        a ^= b;
        b ^= a;
        a ^= b;
        System.out.println("Новые значения переменных: a = " + a + ", b = " + b);

        System.out.println("\n6.Вывод символов и их кодов");
        char dollar = '$';
        char asterisk = '*';
        char at = '@';
        char verticalBar = '|';
        char tilde = '~';
        System.out.println("Коду " + (int) dollar + " соответствует символ " + dollar +
                "\nКоду " + (int) asterisk + " соответствует символ " + asterisk +
                "\nКоду " + (int) at + " соответствует символ " + at +
                "\nКоду " + (int) verticalBar + " соответствует символ " + verticalBar +
                "\nКоду " + (int) tilde + " соответствует символ " + tilde);

        System.out.println("\n7.Вывод в консоль ASCII-арта Дюка");
        char slash = '\\';
        char backSlash = '/';
        char openBraket = '(';
        char closeBraket = ')';
        char underline = '_';
        System.out.println("    " + backSlash + slash +
                "\n   " + backSlash + "  " + slash +
                "\n  " + backSlash + underline + openBraket + " " + closeBraket + slash +
                "\n " + backSlash + "      " + slash +
                "\n" + backSlash + underline + underline + underline +
                underline + backSlash + slash + underline + underline + slash);

        System.out.println("\n8.Вывод количества сотен, десятков и единиц числа");
        int num = 123;
        int hundreds = num / 100;
        int tens = num % 100 / 10;
        int ones = num % 10;
        int sumNum = hundreds + tens + ones;
        int prodNum = hundreds * tens * ones;
        System.out.println("Число " + num + " содержит:" + "\n  сотен - " + hundreds +
                "\n  десятков - " + tens + "\n  единиц - " + ones);
        System.out.println("Сумма его цифр = " + sumNum);
        System.out.println("Произведение цифр = " + prodNum);

        System.out.println("\n9.Вывод времени");
        int timeAmount = 86399;
        int hh = timeAmount / 3600;
        int mm = (timeAmount / 60) % 60;
        int ss = timeAmount % 60;
        System.out.println(hh + ":" + mm + ":" + ss);
    }
}