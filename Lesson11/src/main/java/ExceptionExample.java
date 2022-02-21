public class ExceptionExample {

    public static void main(String[] args) {
        System.out.println("start");
        try {
            test();
//            test();
            System.out.println("try catch");
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        System.out.println("end");

    }

    private static void test() {
        System.out.println("test");
        double v = 3 / 1;
    }


}
