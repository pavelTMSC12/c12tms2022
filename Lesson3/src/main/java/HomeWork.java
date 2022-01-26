import java.util.Random;

public class HomeWork {

    //Задачи:
    //1) Используя тип данных char и операцию инкремента вывести на консоль все буквы английского алфавита
    public static void main(String[] args) {
//        char ch = 'a';
//        char m = 12;//16 бит [0; 65536]
////        System.out.println((char) 0);
//        for (char i = 'a'; i <= 'z'; i++) {
//            System.out.print(i + " ");
//        }
//        System.out.println();
//        printEnglishLetters('A');
//
//
//
//        Scanner scanner = new Scanner(System.in);
//        if (scanner.hasNextInt()) {
//            int value = scanner.nextInt();
//            if (value % 2 == 0) {
//                System.out.println("четное");
//            } else {
//                System.out.println("не четное");
//            }
//        } else {
//            System.out.println("ошибка");
//        }
//
////        Scanner scanner = new Scanner(System.in);
//        double a = scanner.nextDouble();
//        double b = scanner.nextDouble();
//        double c = scanner.nextDouble();
//        if (a < 0) {
////            a = a * -1;
//            a = -a;
//            System.out.println(a);
//        }
//
//        double absA = Math.abs(a);
//        double absB = Math.abs(b);
//        double absC = Math.abs(c);
////        double result = min(absA, absB);
//        System.out.println(Math.min(Math.min(absA, absB), absC));
//
//        //4
////        [0;28800]
        Random random = new Random();
        System.out.println(random.nextInt());
//        [-10 10]
        System.out.println(random.nextInt(21) - 10);
//        System.out.println("Random value " +value);
//        display(value);
        max(null);
    }

    private static void display(int value) {
        int hour = value / 60 / 60;
        String result = "";
        switch (hour) {
            case 0:
                result = "менее часа";
                break;
            case 1:
                result = "час";
                break;
            case 2:
            case 3:
            case 4:
                result = "часа";
                break;
            case 5:
            case 6:
            case 7:
            case 8:
                result = "часов";
                break;
        }
        System.out.println("осталось " + (hour == 0 ? "" : hour) + " " + result);
    }

    private static double min(double absA, double absB) {
        return absA < absB ? absA : absB;
    }


    //2)Проверка четности числа
    //Создать программу, которая будет сообщать, является ли целое число, введённое пользователем,
    // чётным или нет. Ввод числа осуществлять с помощью класса Scanner.
    // Если пользователь введёт не целое число, то сообщать ему об ошибке.

    //3) Меньшее по модулю число
    //Создать программу, которая будет выводить на экран меньшее по модулю из трёх введённых
    // пользователем вещественных чисел с консоли.

    //4) На некотором предприятии инженер Петров создал устройство, на табло которого показывается количество секунд,
    // оставшихся до конца рабочего дня. Когда рабочий день начинается ровно в 9 часов утра — табло отображает «28800» (т.е. остаётся 8 часов),
    // когда времени 14:30 — на табло «9000» (т.е. остаётся два с половиной часа), а когда наступает 17 часов — на табло отображается «0»
    // (т.е. рабочий день закончился).
    //Программист Иванов заметил, как страдают офисные сотрудницы — им неудобно оценивать остаток рабочего дня в секундах.
    // Иванов вызвался помочь сотрудницам и написать программу, которая вместо секунд будет выводить на табло понятные фразы с информацией о том,
    // сколько полных часов осталось до конца рабочего дня. Например: «осталось 7 часов», «осталось 4 часа», «остался 1 час», «осталось менее часа».
    //Итак, в переменную n должно записываться случайное (на время тестирования программы) целое число из [0;28800],
    // далее оно должно выводиться на экран (для Петрова) и на следующей строке (для сотрудниц) должна
    // выводиться фраза о количестве полных часов, содержащихся в n секундах.

    //5) Необходимо написать программу, которая будет выводить на консоль таблицу приведения типов!
//              byte	short	char	int 	long	float	double	boolean
//    byte
//    short
//    char
//    int
//    long
//    float
//    double
//    boolean
//
//    На пересечении напишите следующие фразы:
//    ня (неявное) – если преобразование происходит автоматически,
//    я (явное) – если нужно использовать явное преобразование,
//    х – если преобразование невозможно,
//    т  - если преобразование тождественно.
//    Внимание! используйте System.out.printLn

    /**
     * 6) Метод должен вернуть среднее значение из массива чисел
     * (необходимо сумму всех элеменов массива разделить на длину массива)
     * <p>
     * Example:
     * array = {1,2,3,4,5}
     * Метод должен return 3.0
     */
    public static double average(int[] array) {
        double count = 0;
        for (int value : array) {
            count = count + value;
        }
        return count / array.length;
    }

    /**
     * 7) Метод должен вернуть максимальый элемент массива. Пример: array = {1,2,10,3} метод возвращает 10
     **/
    public static int max(int[] array) {
        if (array != null) {
            int max = Integer.MIN_VALUE;
            for (int value : array) {
                if (value > max) {
                    max = value;
                }
            }
            return max;
        } else {
            return Integer.MIN_VALUE;
        }
    }

//    public static void main(String[] args) {
//        printEnglishLetters('A');
//    }

    private static char printEnglishLetters(char value) {
        System.out.print(value + " ");
        if (value == 'Z') {
            return 0;
        }
        return printEnglishLetters(++value);
    }

    public static void main1(String[] args) {
        byte b = 1;
        char c = (char) b;
//        System.out.println("    byte short char int long float double boolean");
//        System.out.println("byte  т    ня    я   ня   ня   ня    ня      х");
//        System.out.println("short я    т     я   ня   ня   ня    ня      х");
//        System.out.println("char  я    я     т   ня   ня   ня    ня      х");
//        System.out.println("int   я    я     я   т    ня   ня    ня      х");
//        System.out.println("long  я    я     я   я    т    ня    ня      х");
//        System.out.println("float я    я     я   я    я    т     ня      х");
//        System.out.println("double я   я     я   я    я    я     т       х");
//        System.out.println("boolean х  х     х   х    х    х     х       т");
    }
}
