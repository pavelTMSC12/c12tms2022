public class P2 {
    //обмен значениями без использования временной переменной
    public static void main(String[] args) {
        int a = 1;
        int b = 8;

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a " + a);
        System.out.println("b " + b);
    }

}
