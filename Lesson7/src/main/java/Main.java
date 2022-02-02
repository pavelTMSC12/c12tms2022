public class Main {
    public static void main(String[] args) {
        System.out.println();
        print(new Car());
        print(new Person());
        print(new int[]{1, 2, 3, 3});
    }

    private static void print(Object object) {
        System.out.println(object);
    }

    private static String print(int value) {
        System.out.println(value);
        return "";
    }

    private static void print(long value) {
        System.out.println(value);
    }
}
