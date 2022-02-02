package car;

public class MainCar {
    public static void main(String[] args) {
        Car car = new Car("жигули", "красный", new Engine());
        car.test();

//        System.out.println(car.getModel());
//        car.Car.Engine engine1 = new car.Car.Engine();
//        Car.Engine engine = car.new Engine();


//        car.Car.Engine.Test test = engine.new Test();
//        test.test();
//        engine.info();
//        engine.start();
//        engine.stop();

//        Car.Panel panel1 = new Car.Panel(1);
//
//        Car.Panel panel = new Car.Panel(12);
//        panel.check();
        new Car.Panel(1).check();
    }
}
