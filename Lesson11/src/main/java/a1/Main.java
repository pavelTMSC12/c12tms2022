package a1;

import java.io.InputStream;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog("Барсик");
        dog.putCollar();
        dog.putMuzzle();
        dog.putLeash();
        try {
            dog.walk();
            dog.walk2();
        } catch (DogIsNotReadyException exception) {
            System.out.println(exception.getMessage());
        } catch (Exception exception) {
            System.out.println("обработка Exception");
            exception.printStackTrace();
        } finally {
            System.out.println("finally");
        }


        String x = "z";
        InputStream ss = null;
        try {
            x = "234";
        } finally {
            x = "Finally";
        }
        System.out.println(x);

    }
}
