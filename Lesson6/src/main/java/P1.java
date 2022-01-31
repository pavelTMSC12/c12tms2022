import utils.ArrayHelper;

import java.util.Arrays;
import java.util.Random;

public class P1 {
    /**
     * вывести красиво на экран массивы!
     *
     * @param args
     */
    public static void main(String[] args) {

        int[] array = new int[10];
        Random random = new Random();
        Arrays.setAll(array, x -> random.nextInt(1000));
        System.out.println(Arrays.toString(array));

        //1 2 3
        //3 4 5
        //6 7 8
        int[][] ints = new int[10][10];
        for (int[] anInt : ints) {
            Arrays.setAll(anInt, x -> random.nextInt(1000));
        }
        System.out.println();
        for (int[] rows : ints) {
//            for (int columnValue : rows) {
//                System.out.printf("%3d\t",columnValue);
//            }
//            System.out.println();
            System.out.println(ArrayHelper.print(rows));
        }
    }
}
