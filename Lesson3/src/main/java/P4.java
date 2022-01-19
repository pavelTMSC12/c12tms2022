public class P4 {
    /**
     * Нередки ситуации, когда приходится применять различные операции, например,
     * сложение и произведение, над значениями разных типов. Здесь также действуют некоторые правила:
     * <p>
     * 1) если один double, то и второй будет double
     * <p>
     * 2) если один float, то и второй будет float (если 1 условие не соблюдено)
     * <p>
     * 3) если один long, то и второй будет long (если 1 и 2 условие не соблюдены)
     * <p>
     * 4) иначе все операнды операции преобразуются к типу int
     **/
    public static void main(String[] args) {
        myPrint(1 + 1f);//
        myPrint(2L + 1f);//
        myPrint(3 + 1L);//
        myPrint(4f + 1.0);//
        myPrint((byte) 1 + 5);//
        byte x = 5;//рассказать про правило оформления кода!
        long l = 13;
        myPrint((byte) 5 + 13L);//
        myPrint(x + l);//
        myPrint((byte) 2 + (short) 5);//
        myPrint(5.5 + (int) 3);//
        myPrint((char) 'a' + 5);//
        myPrint(4.3f, "abc");//
        System.out.println(myPrint("abc", 4.3f));//
    }

    private static void myPrint(float value) {
        System.out.println(value + " принадлежит к типу float");
    }

    private static void myPrint(float value, String str) {
        System.out.println(value + " принадлежит к типу float");
    }

    private static int myPrint(String str, float value) {
        System.out.println(value + " принадлежит к типу float");
        return 1;
    }

    public static void myPrint(int value) {
        System.out.println(value + " принадлежит к типу int");
    }

    private static void myPrint(long value) {
        System.out.println(value + " принадлежит к типу long");
    }

    private static void myPrint(double value) {
        System.out.println(value + " принадлежит к типу double");
    }

}
