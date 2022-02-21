package a1;

import java.io.InputStream;

public class Main {

    public static void main(String[] args) {

        MyDog myDog = new MyDog();
        try {
            myDog.walk();
        } catch (Exception e) {
            e.printStackTrace();
        }

        Dog dog = new Dog("Барсик");
        dog.putCollar();
        dog.putMuzzle();
        dog.putLeash();
        try {
            String str = dog.walk();
            System.out.println(str);

            throw new Exception("Exception");

//            dog.walk2();
        } catch (DogIsNotReadyException exception) {
            System.out.println(exception.getMessage());
//            return;
//            System.exit(1);
        } catch (Exception exception) {
            System.out.println("обработка Exception");
            exception.printStackTrace();
        } catch (Throwable throwable) {
            System.out.println("обработка Throwable");
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
        System.out.println(x);//Finally

    }
}
