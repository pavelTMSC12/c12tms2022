public class Practice2 {
    /**
     * объяснение
     * https://metanit.com/java/tutorial/2.13.php
     **/
    public static void main(String[] args) {

        boolean b = false;
        boolean k = true;

        //false - true
        //true - false

        k = !b;
        System.out.println(k);//

        int mm = 8;
        System.out.println(mm);//
        mm = -2;
        System.out.println(mm);//
        mm += 2;
        System.out.println(mm);//


        System.out.println("-----------");

        System.out.println(true || false);//
        System.out.println(false && true);//
        System.out.println(true ^ false); //XOR логическое исключающее ИЛИ //
        System.out.println(true && !false);//
        System.out.println(1 & ~0);//~ (логическое отрицание) & (логическое умножение)//
        System.out.println(more(5, 3) & less(10, 7));//
        System.out.println(more(3, 5) && less(7, 10));//

        System.out.println(more(5, 3) | less(7, 10));//
        System.out.println(more(5, 3) || less(7, 10));//
        System.out.println(14.5 % 3);//2.5 = 14.5 -(4*3)=14.5-12=2.5
    }

    private static boolean more(int a, int b) {
        System.out.print("a more b ");
        return a > b;
    }

    private static boolean less(int a, int b) {
        System.out.print("a less b ");
        return a < b;
    }
}
