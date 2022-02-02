package car;

public class Car {
    private String model;
    private String color;
    private Engine engine;

    public Car(String model, String color, Engine engine) {
        this.model = model;
        this.color = color;
//        this.engine = new Engine();
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    //внутренний класс
//    private class Engine {
//        //доступ есть к полям
////        если магазин запчастей то надо отдельный класс
//        //start stop
//        //инициализация
//        public void info() {
//            System.out.println("Model " + model + "Color " + color);
//        }
//
//        public void start() {
//            System.out.println("start");
//        }
//
//        public void stop() {
//            System.out.println("stop");
//        }
//    }

    public void test() {
//        engine.info();
    }

    public static class Panel {
        public static final String TEMP = "asdas";
        private int count;

        public Panel(int count) {
            this.count = count;
        }

        public void check() {
            System.out.println("check Engine " + count);
        }
    }
}
