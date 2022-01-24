public class Practice8 {

    boolean[] array;

    /**
     * объявнение
     * https://metanit.com/java/tutorial/2.4.php
     **/
    public static void main(String[] args) {
        //поговорим про массивы
        boolean[] array = {true, false, true};

        for (int i = 0; i < array.length; i++) {
            //0
            //1
            //2
            if (i == 0) {
                System.out.println("i==0");
            }
            System.out.println(array[i]);
        }

        for (boolean value : array) {
            System.out.println(value);
        }


        new Practice8().calc(array.length);

    }

    private void calc(int size) {
        boolean[] array = new boolean[size];
        this.array = array;

    }


}
