public class Summ {
    public static void main(String[] args) {
        sum(10, 20);
        sum(-1, 20);
        sum(20, -1);
        sum(-1, -1);
        sum(0, -1);
        sum(-1, 0);
        sum(Integer.MAX_VALUE, Integer.MIN_VALUE);
    }

    public static int sum(int a, int b) {
        if ((long) a + b > Integer.MAX_VALUE) {
            return -1;
        }
        return a + b;
    }

}
