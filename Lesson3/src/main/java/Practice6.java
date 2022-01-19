import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Practice6 {
    /**
     * объявнение
     **/
    public static void main(String[] args) {
        System.out.println("Введите слово, число, число с плавающей точкой и boolean значение");

        Scanner scanner = new Scanner(System.in);

        int[] ints = new int[scanner.nextInt()];
        Random random = new Random();
        for (int i = 0; i < ints.length; i++) {
            ints[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(ints));

//        String s = scanner.nextLine();
//        int i = scanner.nextInt();
//        double d = scanner.nextDouble();
//        boolean b = scanner.nextBoolean();

//        System.out.println(s + ", " + i + ", " + d + ", " + b);
    }
}
