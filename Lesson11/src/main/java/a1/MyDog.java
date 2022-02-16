package a1;

public class MyDog implements IDog {

    @Override
    public void walk() throws DogIsNotReadyException {
        System.out.println("реализация метода прогулки");
        throw new DogIsNotReadyException("нельзя гулять");
    }

    protected void test() {

    }
}
