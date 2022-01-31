import java.util.Random;
import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {

//1) Задача на оператор switch!
//        Рандомно генерируется число От 1 до 7.
//        Если число равно 1, выводим на консоль “Понедельник”, 2 –”Вторник” и так далее.
//        Если 6 или 7 – “Выходной”.
        int value = new Random().nextInt(7) + 1;
        switch (value) {
            case 1:
                System.out.println("Пн");
                break;
            case 6, 7:
                System.out.println("Вых");
                break;

        }

//2) Одноклеточная амеба каждые 3 часа делится на 2 клетки. Определить,
//         сколько амеб будет через 3, 6, 9, 12,..., 24 часа

        int result = 1;
        for (int i = 1; i <= 24; i += 3) {
            result = result * 2;
        }
        System.out.println(result);

//3) В переменную записываем число.
//        Надо вывести на экран сколько в этом числе цифр и положительное оно или отрицательное.
//        Например, Введите число: 5
//        "5 - это положительное число, количество цифр = 1"
        describe(-23423423);

//4) Дано 2 числа, день и месяц рождения. Написать программу, которая определяет знак зодиака человека.
        String zodiacName = getZodiacName(20, 1);
        if (zodiacName != null) {
            System.out.println(zodiacName);
        } else {
            System.out.println("не корректные данные");
        }

        //Некоторые тесты для проверки задач. Можно также написать свои тесты.
        printArray();
        System.out.println(operation(1));
        System.out.println(operation(0));
        System.out.println(calculateCountOfOddElementsInMatrix(new int[]{1, 2, 3, 4, 5, 6}));
        countDevs(103);
        countDevs(11);

        for (int i = 0; i < 1000; i++) {
            countDevs(i);
        }

        foobar(6);
        foobar(10);
        foobar(15);
        printPrimeNumbers();
    }

    public static void describe(int number) {
        int figures = 1;
        int numberCut = number;
        while (Math.abs(numberCut) / 10 != 0) {
            figures++;
            numberCut /= 10;
        }
        if (number > 0) {
            System.out.println(number + " - это положительное число, количество цифр = " + figures);
        } else if (number < 0) {
            System.out.println(number + " - это отрицательное число, количество цифр = " + figures);
        } else {
            System.out.println(number + " - это ноль. Не положительный и не отрицательный. Количество цифр = 1");
        }
    }


    static String getZodiacName(int day, int month) {
//        Овен (21 марта – 20 апреля)
//        Телец (21 апреля – 21 мая) ...
//        Близнецы (22 мая – 21 июня) ...
//        Рак (22 июня – 22 июля) ...
//        Лев (23 июля – 21 августа) ...
//        Дева (22 августа – 23 сентября) ...
//        Весы (24 сентября – 23 октября) ...
//        Скорпион (24 октября – 23 ноября)
//        Стрелец (23 ноября — 22 декабря)
//        Козерог (23 декабря — 20 января)
//        Водолей (21 января — 19 февраля)
//        Рыбы (20 февраля — 20 марта)
        switch (month) {
            case 1:
                return checkDay(day, 21, 31) ? "водолей" : checkDay(day, 1, 20) ? "Козерог" : null;
            case 2:
                return checkDay(day, 1, 19) ? "водолей" : checkDay(day, 20, 29) ? "Рыбы" : null;//и т.д
            case 12:
        }
        return null;
    }

    private static boolean checkDay(int day, int from, int to) {
        return day >= from && day <= to;
    }


    /**
     * Необходимо прочитать с консоли значение числа типа int,
     * сделать проверку что если пользователь ввел не положительное число,
     * то вывести ошибку и отправить пользователя вводить заново новое число!
     * далее создать одномерный массив типа int размера прочитанного с консоли
     * далее заполнить массив случайными значениями
     * далее вывести массив на консоль
     */
    private static void printArray() {
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            if (scanner.hasNextInt()) {
                count = scanner.nextInt();
            } else {
                System.out.println("ошибка");
                scanner.next();
            }
        } while (count <= 0);
        System.out.println();
        // тут пишем логику
    }

    /**
     * Метод должен выполнять некоторую операцию с int "number" в зависимости от некоторых условий:
     * - if number положительное число, то необходимо number увеличить на 1
     * - if number отрицательное - уменьшить на 2
     * - if number равно 0 , то замените значение number на 10
     * вернуть number после выполнения операций
     */
    public static int operation(int number) {
        if (number > 0) {
            number++;
        } else if (number < 0) {
            number -= 2;
        } else {
            number = 10;
        }
        return number;
    }

    /**
     * На вход приходит массив целых чисел типа int
     * Необходимо найти количество нечетных элементов в массиве и вернуть значение в метод main,
     * в котором это значение распечатается на консоль.
     */
    public static int calculateCountOfOddElementsInMatrix(int[] ints) {
        int count = 0;
        for (int i : ints) {
            if (i % 2 != 0) {
                count++;
            }
        }
        return count;
    }

    /**
     * На вход приходит число.
     * Вывести в консоль фразу из разряда "_COUNT_ программистов",
     * заменить _COUNT_ на число которое пришло на вход в метод и заменить окончание в слове "программистов" на
     * уместное с точки зрения русского языка.
     * Пример: 1 программист, 42 программиста, 50 программистов
     *
     * @param count - количество программистов
     */
    public static void countDevs(int count) {

//       0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20
//       в т а а а в в в в в в  в  в   в ..................в

        //1, 101, 11 - исключение из правила

        int c10 = count % 10;//последняя цифра в числе
        int c100 = count % 100;//2 последние цифры

        if (c10 == 1 && c100 != 11) {
            //т
        } else if (c10 >= 2 && c10 <= 4 && !(c100 >= 12 && c100 <= 14)) {
            //а
        } else {
            //в
        }
        // тут пишем логику
        if (count % 10 == 1 && count % 100 != 11) {
            System.out.println(count + " программист");
        } else if (count % 10 >= 2 && count % 10 <= 4 && !(count % 100 >= 12 && count % 100 <= 14)) {
            System.out.println(count + " программиста");
        } else {
            System.out.println(count + " программистов");
        }
    }

    /**
     * Метод должен выводить разные строки в консоли в зависимости от некоторых условий:
     * - если остаток от деления на 3 равен нулю - выведите "foo" (example of number - 6)
     * - если остаток от деления на 5 равен нулю - вывести "bar" (example of number - 10)
     * - если остаток от деления на 3 и 5 равен нулю 0 ,то вывести "foobar" (example of number - 15)
     */
    public static void foobar(int number) {
        // тут пишем логику
        //11 то выполнится только первая проверка а на вторую не пойдет
//        if (number % 3 == 0 && number % 5 == 0) { //& от &&
        if (number % 3 == 0) {
            System.out.print("foo");
        }
        if (number % 5 == 0) {
            System.out.print("bar");
        }
    }

    /**
     * Задача со звездочкой!
     * Метод должен печатать все простые числа <1000
     * что такое просто число (https://www.webmath.ru/poleznoe/formules_18_5.php)
     */
    public static void printPrimeNumbers() {
        int count = 0;
        for (int i = 2; i < 1000; i++) {
            boolean isPrimeNumber = true;
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    isPrimeNumber = false;
                    break;
                }
            }
            if (isPrimeNumber) {
                count++;
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println(count);
    }
}
