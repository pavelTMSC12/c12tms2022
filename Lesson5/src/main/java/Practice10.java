import java.util.Arrays;

public class Practice10 {
    public static void main(String[] args) {

        //поговорим про массивы
        int[] mass = new int[10];
        Arrays.fill(mass, 3);

        int[] temp = mass;
        mass[3] = 5;
        mass[4] = 6;
        System.out.println(Arrays.toString(mass));
        System.out.println(Arrays.toString(temp));

        System.out.println(mass == temp);//true
//
        //копирование
        int[] temp2 = new int[11];
        System.arraycopy(mass, 0, temp2, 1, mass.length);
        System.out.println(Arrays.toString(temp2));

        System.out.println(mass == temp2);//false

        temp2[3] = 11;
        System.out.println("-----");
        System.out.println(Arrays.toString(mass));
        System.out.println(Arrays.toString(temp2));
//
//        //как проверить равны ли массивы

        for (int i : temp2) {
            System.out.println(i);
        }

        for (int i = 0; i < mass.length; i++) {

        }

        for (int i = 0; i < mass.length; i++) {
            if (mass[i] == temp2[i]) {
                System.out.println("equals");
            } else {
                System.out.println("not equals");
            }
        }
        System.out.println("ARR: " + Arrays.equals(mass, temp2));
        int[] array = {1, 2, 3};
        int[] array2 = array;
        System.out.println(array == array2);//true
        System.out.println(array.equals(array2));//true
        System.out.println("ARR: " + Arrays.equals(array, array2));
    }

}
