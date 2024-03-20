public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("1.Вывод характеристик компьютера");

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
        System.out.println("Общая стоимость товаров без скидки: " + (penPrice + bookPrice));
        System.out.println("Сумма скидки: " + ((penPrice + bookPrice) * 0.11));
        System.out.println("Общая стоимость товаров со скидкой: " 
                + ((penPrice + bookPrice) * 0.89));

        System.out.println("\n3.Вывод слова JAVA");
        System.out.println("   J" + "   a" + "  v   " + "   v" + "  a");
        System.out.println("   J" + "  a" + " a" + "  v " + "   v" + "  a " + "a");
        System.out.println("J  " + "J "+ "aaaaa " + " V " + " V " + " aaaaa");
        System.out.println(" JJ " + "a" + "    " + " a " + "  V " + " a   " + "  a");

        System.out.println("\nВывод min и max значений целых числовых типов");
        //byte short long int
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
        long maxLong = 9_223_372_036_854_775_807l;
        System.out.println("\nПервоначальное значение: " + maxLong);
        System.out.println("Значение после инкремента на единицу: " + (++maxLong));
        System.out.println("Значение после декремента на единицу: " + (--maxLong));

        System.out.println("\n5.Перестановка значений переменных");
        int a = 2;
        int b = 5;
        int c = a;

        System.out.println("Перестановка с помощью третьей переменной:");
        System.out.println("Исходные значения переменных: a = " + a + ", b = " + b);
        a = b;
        b = c;
        System.out.println("Новые значения переменных: a = " + a + ", b = " + b);

        System.out.println("\nПерестановка с помощью арифметической операции:");
        System.out.println("Исходные значения переменных: a = " + a + ", b = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Новые значения переменных: a = " + a + ", b = " + b);

        System.out.println("\nПерестановка с помощью побитовой операции:");
        System.out.println("Исходные значения переменных: a = " + a + ", b = " + b);
        a = a ^ b;
        b = b ^ a;
        a = a ^ b;
        System.out.println("Новые значения переменных: a = " + a + ", b = " + b);

        System.out.println("\n6.Вывод символов и их кодов");
        char firstSymbol = '$';
        char secondSymbol = '*';
        char thirdSymbol = '@';
        char fourthSymbol = '|';
        char fifthSymbol = '~';
        System.out.println("Коду " + (int)firstSymbol + " соответствует символ " + firstSymbol
                + "\nКоду " + (int)secondSymbol + " соответствует символ " + secondSymbol
                + "\nКоду " + (int)thirdSymbol + " соответствует символ " + thirdSymbol
                + "\nКоду " + (int)fourthSymbol + " соответствует символ " + fourthSymbol
                + "\nКоду " + (int)fifthSymbol + " соответствует символ " + fifthSymbol);

        System.out.println("\n7.Вывод в консоль ASCII-арта Дюка");
        char slash = '\\';
        char backSlash = '/';
        char openBraket = '(';
        char closeBraket = ')';
        char underline = '_';
        System.out.println("    " + backSlash + slash + "    " + "\n" + "   " + backSlash
                + "  " + slash + "   " + "\n" + "  " + backSlash + underline + openBraket
                + " " + closeBraket + slash + "   " + "\n" + " " + backSlash + "      "
                + slash + "  " + "\n" + backSlash + underline + underline + underline
                + underline + backSlash + slash + underline + underline + slash);

        System.out.println("\n8.Вывод количества сотен, десятков и единиц числа");
        int num = 123;
        int numHundreds = 123 / 100;
        int numTens = 123 % 100 / 10;
        int numOnes = 123 % 10;
        int numSum = numHundreds + numTens + numOnes;
        int numProd = numHundreds + numTens + numOnes;
        System.out.println("Число 123 содержит:" + "\n  сотен - " + numHundreds + 
                "\n  десятков - " + numTens + "\n  единиц - " + numOnes);
        System.out.println("Сумма его цифр = " + numSum);
        System.out.println("Произведение цфир = " + numProd);

        System.out.println("\n9.Вывод времени");
        int timeAmount = 86399;
        int hours = timeAmount / 3600;
        int minutes = (timeAmount / 60) % 60;
        int seconds = timeAmount % 60;
        System.out.println(hours + ":" + minutes + ":" + seconds);
    }
}