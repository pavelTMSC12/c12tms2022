//https://metanit.com/java/tutorial/2.6.php
public class Practice12 {
    public static void main(String[] args) {
        //поговорим про операторы ветвления
        boolean condition = true || 500 > 100;
        boolean anotherCondition = true;

        int a = 5;
        int b = 2;

        if (condition) {
            if (a > b) {
                System.out.println("12");
            } else if (anotherCondition) {
                System.out.println("12аааа");
            }
            System.out.println("condition is true");
        } else {//if
            System.out.println("condition is false");
        }
        int monthIndex = 0;
        switchExample(monthIndex);

    }

    private static void switchExample(int monthIndex) {
        switch (monthIndex) {
            case 0:
                System.out.println("январь");
                break;
            case 1:
                System.out.println("февраль");
                break;
            case 2:
                System.out.println("март");
                break;
            case 4:
                System.out.println("апрель");
                break;
            default:
                System.out.println("не нашли месяц");

        }
    }


}
