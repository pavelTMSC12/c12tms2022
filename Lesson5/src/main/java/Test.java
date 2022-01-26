public class Test {
    public static void main(String[] args) {
        String zodiacName = getZodiacName(1, 11);
        System.out.println(zodiacName);
    }

    private static String getZodiacName(int day, int month) {
//        if (5 > 2) {
//            System.out.println("5>2");
//        } else if (7 > 2) {
//        } else {
//            System.out.println("else");
//        }

        if (checkValue(5, 2)) {
            if (7 > 1) {
                System.out.println("1");
            } else {
                System.out.println("0");
            }
        } else {
            System.out.println(2);
        }
        return checkValue(5, 2) ?
                (checkValue(7, 1) ? "1" : "0")
                : "2";

//        switch (day) {
//            case 1:
//                return "Овен";
//            case 2:
//                return "sdfsdf";
//        }
//        return null;
    }

    private static boolean checkValue(int i, int i2) {
        return i > i2;
    }

}
