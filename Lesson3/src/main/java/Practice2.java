public class Practice2 {

    public static void main(String[] args) {

        boolean b = false;
        boolean k = true;

        //false - true
        //true - false

        k = !b;


        System.out.println();//

        int mm = 8;
        System.out.println(mm);//8
        mm = -2; // mm = mm - 2
        System.out.println(mm);//-2
        mm += 2;
        System.out.println(mm);//0


        int a1 = 4;//010
        int b1 = 5;//101
        //000
        System.out.println(a1 | b1);//0


        System.out.println("-----------");

        System.out.println(true || false);//true
        System.out.println(false && true);//false
        System.out.println(true ^ false); //XOR логическое исключающее ИЛИ // true
        System.out.println(true && !false);// true

        if (5 > 3 && 7 < 2) {
            ///операция
        }

        System.out.println(1 & ~0);//~ (логическое отрицание) & (логическое умножение)//true
        System.out.println(more(3, 5) && less(7, 10));//
        System.out.println(more(5, 3) & less(10, 7));//

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
