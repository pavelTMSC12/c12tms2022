package p2;

public class MainCar {
    public static void main(String[] args) {
        Car car = new Car("жигули", "красный");
        Car.Engine engine = car.new Engine();
//        Car.Engine.Test test = engine.new Test();
//        test.test();
        engine.info();
        engine.start();
        engine.stop();
        Car.Panel panel = new Car.Panel(12);
        panel.check();
    }
}
