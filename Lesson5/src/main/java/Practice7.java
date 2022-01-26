public class Practice7 {
    static int mm;

    /**
     * объявнение
     * https://metanit.com/java/tutorial/2.4.php
     **/
    public static void main(String[] args) {
        //поговорим про массивы
//        int count = 0;
//        System.out.println(count);
//        System.out.println(mm);

        boolean[] array22;

        boolean[] array33;
        array33 = new boolean[10];
        System.out.println(array33.length);
        array33[0] = true;
        array33[1] = false;

        System.out.println(array33[1]);

        boolean[] array = {true, false, true};


        boolean[] array3 = new boolean[4];
        array3[0] = false;
        array3[3] = false;


        int[] array2; // объявляем сылку на массив
        array2 = new int[5];
        array2 = null;
//        array2[0] = true;
        //
//        max(null);
        max(array2);
        String[] masString = new String[2];
        char[] c = new char[5];
        System.out.println();
    }

    public static void max(int[] array) {
        System.out.println(array.length);
        System.out.println();
    }
}
