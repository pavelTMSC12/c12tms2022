import java.util.Arrays;

public class Practice9 {
    public static void main(String[] args) {
        //поговорим про массивы
        String[] array = {"ttt", "ee", "true"};
        System.out.println(array.length);
        array = new String[10]; // про память
        System.out.println(array.length);

        //1) поменять местами элементы массива 1 и последний

        //for// - обязательно фигурные скобки


        System.out.println(Arrays.toString(array)); //вывод
        //2) fill заполняет массив из 10 элементов
        Arrays.fill(array, "5");

    }

}
