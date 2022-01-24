public class Practice {//начало класса

    String str;

    public static void main(String[] args) { //начинается работа майн
//        тут только вызываем методы или пишем логику
        calculation(); //вызов метод расчета а+b и вывода на консоль
        String next = next();
        System.out.println(next);
        String result = next + "Minsk";
        System.out.println(next());
        System.out.println(result);

    } //после этой скобки заканчивается работа метода майн

    //тут пишем уже метод calculation
    public static void calculation() { //начало метода
        int a = 2;
        int b = 5;
        int sum = a + b;
        System.out.println(sum);
        if (b > a) {
            String ss = next();
            System.out.println(ss);
        }
    } //после этой скобки заканчивается работа метода calculation

    //следующий метод next (нигде не вызывается). например можем вызвать в методе calculation(). Попробуйте.
    public static String next() {
        System.out.println("123");
        return "null";
    }
}//конец класса
