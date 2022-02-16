package p3;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        int k = 5;
//        int l = 5 / 0;

        try {
            System.out.println(calc(0));
        } catch (CustomException | FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            //System.out.println(calc(0));
            //} catch (CustomException e) {
//            e.printStackTrace();
            System.out.println("WWWWW");
//            System.exit(0);
        } finally {
            System.out.println("1");
        }
        Object b = new Object();
        System.out.println(b.toString());

    }

    private static double calc(int k) throws CustomException, FileNotFoundException {
        int result = 89;
        throw new CustomException("custom message");
//        return result / 0;
//        return i;
    }
}
