package a1;

import java.io.FileNotFoundException;

public class MyDog implements Walkable {

//    @Override
//    public void walk() throws DogIsNotReadyException {
//        System.out.println("реализация метода прогулки");
//        throw new DogIsNotReadyException("нельзя гулять");
//    }

    protected void test() {

    }

    @Override
    public void walk() throws Exception {

        throw new FileNotFoundException("asd");
//        try {
//            throw new DogIsNotReadyException("asdasd");
//        } catch (DogIsNotReadyException e) {
//            e.printStackTrace();
//        }
//        System.out.println("walk");
    }
}
