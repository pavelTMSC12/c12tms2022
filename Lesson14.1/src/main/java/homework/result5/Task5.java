package homework.result5;


import hw5.Car;

import java.io.File;
import java.io.IOException;


public class Task5 {
    private static final String FILE_NAME = "Lesson14.1/src/main/java/homework/result5/car.json";

    public static void main(String[] args) throws IOException {
//        Car car = new Car("Toyota", 230, 35000);
        File file = new File(FILE_NAME);
//        ObjJsonInteract.writeObjToJson(file, car);
        Car carFromJson = ObjJsonInteract.readObjFormJson(file, Car.class);
        System.out.println(carFromJson);
    }
}
