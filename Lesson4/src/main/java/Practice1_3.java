import java.util.Scanner;

public class Practice1_3 {
    public static void main(String[] args) {
//        System.out.println("Введите число");
//        Scanner scanner = new Scanner(System.in);
//        int s = scanner.nextInt();
//        switch (s) {
//            case 3:
//                System.out.println("Лате готово");
//                break;
//            case 5:
//                System.out.println("Капучино готово");
//                break;
//            case 7:
//                System.out.println("sss");
//                break;
//            default:
//                System.out.println("Кофе готово");
//        }

//        String str = "12";
//        switch (str) {
//            case "12":
//                System.out.println("12");
//                break;
//            case "14":
//                System.out.print("14");
//                break;
//            default:
//                System.out.println("default");
//        }

//        if (s == 1) {
//            System.out.println("Лате готово");
//        } else if (s == 2) {
//            System.out.println("Капучино готово");
//        } else {
//            System.out.println("Кофе готово");
//        }


        int s = 0;
        System.out.println("Добро пожаловать в кафе, что будете?");
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("лате (нажми 1)");
            System.out.println("капучино (нажми 2)");
            System.out.println("выход (нажми 3)");
            s = scanner.nextInt();
            System.out.println("Спасибо за выбор");
            switch (s) {
                case 1:
                    System.out.println("Лате готово");
                    break;
                case 2:
                    System.out.println("Капучино готово");
                    break;
            }
            System.out.println("Что то еще?");
        } while (s != 3); //выйдет из цикла когда false
    }
}
