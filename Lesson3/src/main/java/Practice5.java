public class Practice5 {
    /**
     * объявнение
     * https://metanit.com/java/tutorial/2.4.php
     **/
    public static void main(String[] args) {
        boolean[] b = new boolean[3];
        b[0] = true;
        b[1] = true;
        b[2] = false;

        int[] kk = {};

        int[] nn = new int[5];

        int[] mass = new int[5];
        boolean[] mm = new boolean[2];
        //0 - 0 индекс
        //0 - 1 индекс
        mass[2] = 10;//- 2 индекс
        //0 - 3 индекс
        mass[4] = 11; //- 4 индекс

        int length = mass.length;//
        int element = mass[--length];//mass[4] //
        System.out.println(element);
        System.out.println(mass[--length]);//
    }
}
