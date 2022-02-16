package a1;

public class TestDog extends MyDog {

    @Override
    public void walk() {
        try {
            test();

            super.walk();
        } catch (DogIsNotReadyException e) {
            e.printStackTrace();
        }
    }
}
