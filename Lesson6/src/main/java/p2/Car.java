package p2;

public class Car {
    private String model;
    private String color;

    public Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    //внутренний класс
    public class Engine {
        //доступ есть к полям
//        если магазин запчастей то надо отдельный класс
        //start stop
        //инициализация
        public void info() {
            System.out.println("Model " + model + "Color " + color);
        }

        public void start() {
            System.out.println("start");
        }

        public void stop() {
            System.out.println("stop");
        }
    }

    public static class Panel {
        private int count;

        public Panel(int count) {
            this.count = count;
        }

        public void check() {
            System.out.println("check Engine " + count);
        }
    }
}
